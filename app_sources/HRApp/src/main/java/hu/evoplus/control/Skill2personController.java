package hu.evoplus.control;

import hu.evoplus.entity.Skill2person;
import hu.evoplus.control.util.JsfUtil;
import hu.evoplus.control.util.JsfUtil.PersistAction;
import hu.evoplus.dto.Skill2personDTO;
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

@Named("skill2personController")
@SessionScoped
public class Skill2personController implements Serializable {

    @EJB
    private hu.evoplus.control.Skill2personFacade ejbFacade;
    private List<Skill2personDTO> items = new ArrayList<>();
    private Skill2personDTO selected;

    public Skill2personController() {
    }

    public Skill2personDTO getSelected() {
        return selected;
    }

    public void setSelected(Skill2personDTO selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private Skill2personFacade getFacade() {
        return ejbFacade;
    }

    public Skill2personDTO prepareCreate() {
        selected = Mapper.getMapper().convertFromSkill2personEntityToDTO(new Skill2person());
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("Skill2personCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items.clear();    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("Skill2personUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("Skill2personDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items.clear();    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Skill2personDTO> getItems() {
        if (items.isEmpty()) {
            List<Skill2person> skill2persons = getFacade().findAll();
            for(Skill2person s : skill2persons) {
                items.add(Mapper.getMapper().convertFromSkill2personEntityToDTO(s));
            }
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            Skill2person s = Mapper.getMapper().convertFromSkill2personDTOToEntity(selected);
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

    public Skill2person getSkill2person(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<Skill2person> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Skill2person> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Skill2person.class)
    public static class Skill2personControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            Skill2personController controller = (Skill2personController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "skill2personController");
            return controller.getSkill2person(getKey(value));
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
            if (object instanceof Skill2person) {
                Skill2person o = (Skill2person) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Skill2person.class.getName()});
                return null;
            }
        }

    }

}
