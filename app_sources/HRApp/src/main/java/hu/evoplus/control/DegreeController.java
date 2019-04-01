package hu.evoplus.control;

import hu.evoplus.entity.Degree;
import hu.evoplus.control.util.JsfUtil;
import hu.evoplus.control.util.JsfUtil.PersistAction;
import hu.evoplus.dto.DegreeDTO;
import hu.evoplus.process.Mapper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("degreeController")
@SessionScoped
public class DegreeController implements Serializable {

    @EJB
    private hu.evoplus.control.DegreeFacade ejbFacade;
    private List<DegreeDTO> items = new ArrayList<>();
    private DegreeDTO selected;

    public DegreeController() {
    }

    public DegreeDTO getSelected() {
        return selected;
    }

    public void setSelected(DegreeDTO selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private DegreeFacade getFacade() {
        return ejbFacade;
    }

    public DegreeDTO prepareCreate() {
        selected = Mapper.getMapper().convertFromDegreeEntityToDTO(new Degree());
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("DegreeCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items.clear();    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("DegreeUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("DegreeDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items.clear();    // Invalidate list of items to trigger re-query.
        }
    }

    public List<DegreeDTO> getItems() {
        if (items.isEmpty()) {
            List<Degree> degrees = getFacade().findAll();
            for(Degree d : degrees) {
                items.add(Mapper.getMapper().convertFromDegreeEntityToDTO(d));
            }
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            Degree degree = Mapper.getMapper().convertFromDegreeDTOToEntity(selected);
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(degree);
                } else {
                    getFacade().remove(degree);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public Degree getDegree(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<Degree> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Degree> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Degree.class)
    public static class DegreeControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            DegreeController controller = (DegreeController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "degreeController");
            return controller.getDegree(getKey(value));
        }

        java.lang.Integer getKey(String value) {
            java.lang.Integer key;
            key = Integer.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Integer value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Degree) {
                Degree o = (Degree) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Degree.class.getName()});
                return null;
            }
        }

    }

}
