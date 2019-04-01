package hu.evoplus.control;

import hu.evoplus.entity.Degree2person;
import hu.evoplus.control.util.JsfUtil;
import hu.evoplus.control.util.JsfUtil.PersistAction;
import hu.evoplus.dto.Degree2personDTO;
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

@Named("degree2personController")
@SessionScoped
public class Degree2personController implements Serializable {

    @EJB
    private hu.evoplus.control.Degree2personFacade ejbFacade;
    private List<Degree2personDTO> items = new ArrayList<>();
    private Degree2personDTO selected;

    public Degree2personController() {
    }

    public Degree2personDTO getSelected() {
        return selected;
    }

    public void setSelected(Degree2personDTO selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private Degree2personFacade getFacade() {
        return ejbFacade;
    }

    public Degree2personDTO prepareCreate() {
        selected = Mapper.getMapper().convertFromDegree2personEntityToDTO(new Degree2person());
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("Degree2personCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items.clear();    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("Degree2personUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("Degree2personDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items.clear();    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Degree2personDTO> getItems() {
        if (items.isEmpty()) {
            List<Degree2person> ds = getFacade().findAll();
            for(Degree2person d : ds) {
                items.add(Mapper.getMapper().convertFromDegree2personEntityToDTO(d));
            }
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            Degree2person d = Mapper.getMapper().convertFromDegree2personDTOToEntity(selected);
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(d);
                } else {
                    getFacade().remove(d);
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

    public Degree2person getDegree2person(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<Degree2person> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Degree2person> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Degree2person.class)
    public static class Degree2personControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            Degree2personController controller = (Degree2personController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "degree2personController");
            return controller.getDegree2person(getKey(value));
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
            if (object instanceof Degree2person) {
                Degree2person o = (Degree2person) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Degree2person.class.getName()});
                return null;
            }
        }

    }

}
