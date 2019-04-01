package hu.evoplus.control;

import hu.evoplus.process.Mapper;
import hu.evoplus.entity.Application;
import hu.evoplus.control.util.JsfUtil;
import hu.evoplus.control.util.JsfUtil.PersistAction;
import hu.evoplus.dto.ApplicationDTO;
import java.io.IOException;

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
import org.primefaces.event.SelectEvent;

@Named("applicationController")
@SessionScoped
public class ApplicationController implements Serializable {

    @EJB
    private hu.evoplus.control.ApplicationFacade ejbFacade;
    private List<ApplicationDTO> items = new ArrayList<>();
    private ApplicationDTO selected;

    public ApplicationController() {
    }

    public ApplicationDTO getSelected() {
        return selected;
    }

    public void setSelected(ApplicationDTO selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private ApplicationFacade getFacade() {
        return ejbFacade;
    }

    public ApplicationDTO prepareCreate() {
        selected = Mapper.getMapper().convertFromApplicationEntityToDTO(new Application());
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("ApplicationCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items.clear();    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("ApplicationUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("ApplicationDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items.clear();    // Invalidate list of items to trigger re-query.
        }
    }

    public List<ApplicationDTO> getItems() {
        if (items.isEmpty()) {
            List<Application> applications = getFacade().findAll();
            for (Application a : applications) {
                items.add(Mapper.getMapper().convertFromApplicationEntityToDTO(a));
            }
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            Application application = Mapper.getMapper().convertFromApplicationDTOToEntity(selected);
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(application);
                } else {
                    getFacade().remove(application);
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

    public Application getApplication(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<Application> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Application> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }
    
    public void onRowSelectNavigate(SelectEvent event) {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("applicationView.xhtml?i=1");
        } catch (IOException ex) {
            Logger.getLogger(ApplicationController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FacesConverter(forClass = Application.class)
    public static class ApplicationControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            ApplicationController controller = (ApplicationController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "applicationController");
            return controller.getApplication(getKey(value));
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
            if (object instanceof Application) {
                Application o = (Application) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Application.class.getName()});
                return null;
            }
        }

    }

}
