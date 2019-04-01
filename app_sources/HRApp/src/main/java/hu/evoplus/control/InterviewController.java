package hu.evoplus.control;

import hu.evoplus.process.Mapper;
import hu.evoplus.entity.Interview;
import hu.evoplus.control.util.JsfUtil;
import hu.evoplus.control.util.JsfUtil.PersistAction;
import hu.evoplus.dto.InterviewDTO;

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

@Named("interviewController")
@SessionScoped
public class InterviewController implements Serializable {

    @EJB
    private hu.evoplus.control.InterviewFacade ejbFacade;
    private List<InterviewDTO> items = new ArrayList<>();
    private InterviewDTO selected;

    public InterviewController() {
    }

    public InterviewDTO getSelected() {
        return selected;
    }

    public void setSelected(InterviewDTO selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private InterviewFacade getFacade() {
        return ejbFacade;
    }

    public InterviewDTO prepareCreate() {
        selected = Mapper.getMapper().convertFromInterviewEntityToDTO(new Interview());
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("InterviewCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items.clear();    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("InterviewUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("InterviewDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items.clear();    // Invalidate list of items to trigger re-query.
        }
    }

    public List<InterviewDTO> getItems() {
        if (items.isEmpty()) {
            List<Interview> interviews = getFacade().findAll();
            for(Interview i : interviews) {
                items.add(Mapper.getMapper().convertFromInterviewEntityToDTO(i));
            }
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            Interview interview = Mapper.getMapper().convertFromInterviewDTOToEntity(selected);
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(interview);
                } else {
                    getFacade().remove(interview);
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

    public Interview getInterview(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<Interview> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Interview> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Interview.class)
    public static class InterviewControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            InterviewController controller = (InterviewController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "interviewController");
            return controller.getInterview(getKey(value));
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
            if (object instanceof Interview) {
                Interview o = (Interview) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Interview.class.getName()});
                return null;
            }
        }

    }

}
