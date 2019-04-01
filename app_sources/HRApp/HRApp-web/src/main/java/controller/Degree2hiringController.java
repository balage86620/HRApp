package controller;

import dto.Degree2hiringDTO;
import model.Degree2hiring;
import util.JsfUtil;
import util.JsfUtil.PersistAction;

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
import process.Mapper;
import repository.Degree2hiringFacade;

@Named("degree2hiringController")
@SessionScoped
public class Degree2hiringController implements Serializable {

    @EJB
    private Degree2hiringFacade ejbFacade;
    private List<Degree2hiringDTO> items = new ArrayList<>();
    private Degree2hiringDTO selected;

    public Degree2hiringController() {
    }

    public Degree2hiringDTO getSelected() {
        return selected;
    }

    public void setSelected(Degree2hiringDTO selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private Degree2hiringFacade getFacade() {
        return ejbFacade;
    }

    public Degree2hiringDTO prepareCreate() {
        selected = Mapper.getMapper().convertFromDegree2hiringEntityToDTO(new Degree2hiring());
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("Degree2hiringCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items.clear();    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("Degree2hiringUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("Degree2hiringDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items.clear();    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Degree2hiringDTO> getItems() {
        if (items.isEmpty()) {
            List<Degree2hiring> dh = getFacade().findAll();
            for (Degree2hiring d : dh) {
                items.add(Mapper.getMapper().convertFromDegree2hiringEntityToDTO(d));
            }
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            Degree2hiring d = Mapper.getMapper().convertFromDegree2hiringDTOToEntity(selected);
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

    public Degree2hiring getDegree2hiring(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<Degree2hiring> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Degree2hiring> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Degree2hiring.class)
    public static class Degree2hiringControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            Degree2hiringController controller = (Degree2hiringController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "degree2hiringController");
            return controller.getDegree2hiring(getKey(value));
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
            if (object instanceof Degree2hiring) {
                Degree2hiring o = (Degree2hiring) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Degree2hiring.class.getName()});
                return null;
            }
        }

    }

}
