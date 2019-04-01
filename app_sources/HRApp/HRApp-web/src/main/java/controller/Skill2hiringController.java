package controller;

import dto.Skill2hiringDTO;
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
import model.Skill2hiring;
import process.Mapper;
import repository.Skill2hiringFacade;

@Named("skill2hiringController")
@SessionScoped
public class Skill2hiringController implements Serializable {

     @EJB
    private Skill2hiringFacade ejbFacade;
    private List<Skill2hiringDTO> items = new ArrayList<>();
    private Skill2hiringDTO selected;

    public Skill2hiringController() {
    }

    public Skill2hiringDTO getSelected() {
        return selected;
    }

    public void setSelected(Skill2hiringDTO selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private Skill2hiringFacade getFacade() {
        return ejbFacade;
    }

    public Skill2hiringDTO prepareCreate() {
        selected = Mapper.getMapper().convertFromSkill2hiringEntityToDTO(new Skill2hiring());
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("Skill2hiringCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items.clear();    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("Skill2hiringUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("Skill2hiringDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items.clear();    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Skill2hiringDTO> getItems() {
        if (items.isEmpty()) {
           List<Skill2hiring> skill2hirings = getFacade().findAll();
           for(Skill2hiring s : skill2hirings) {
               items.add(Mapper.getMapper().convertFromSkill2hiringEntityToDTO(s));
           }
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            Skill2hiring s = Mapper.getMapper().convertFromSkill2hiringDTOToEntity(selected);
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(s);
                } else {
                    getFacade().remove(s);
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

    public Skill2hiring getSkill2hiring(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<Skill2hiring> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Skill2hiring> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Skill2hiring.class)
    public static class Skill2hiringControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            Skill2hiringController controller = (Skill2hiringController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "skill2hiringController");
            return controller.getSkill2hiring(getKey(value));
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
            if (object instanceof Skill2hiring) {
                Skill2hiring o = (Skill2hiring) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Skill2hiring.class.getName()});
                return null;
            }
        }

    }

}