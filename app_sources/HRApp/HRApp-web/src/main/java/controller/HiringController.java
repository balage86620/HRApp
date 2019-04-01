package controller;

import dto.HiringDTO;
import model.Hiring;
import util.JsfUtil;
import util.JsfUtil.PersistAction;
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
import process.Mapper;
import repository.HiringFacade;

@Named("hiringController")
@SessionScoped
public class HiringController implements Serializable {

    @EJB
    private HiringFacade ejbFacade;
    private List<HiringDTO> items = new ArrayList<>();
    private HiringDTO selected;

    public HiringController() {
    }

    public HiringDTO getSelected() {
        return selected;
    }

    public void setSelected(HiringDTO selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private HiringFacade getFacade() {
        return ejbFacade;
    }

    public HiringDTO prepareCreate() {
        selected = Mapper.getMapper().convertFromHiringEntityToDTO(new Hiring());
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("HiringCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items.clear();    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("HiringUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("HiringDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items.clear();    // Invalidate list of items to trigger re-query.
        }
    }

    public List<HiringDTO> getItems() {
        if (items.isEmpty()) {
            List<Hiring> hirings = getFacade().findAll();
            for (Hiring h : hirings) {
                items.add(Mapper.getMapper().convertFromHiringEntityToDTO(h));
            }
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            Hiring hiring = Mapper.getMapper().convertFromHiringDTOToEntity(selected);
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(hiring);
                } else {
                    getFacade().remove(hiring);
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

    public Hiring getHiring(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<Hiring> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Hiring> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    public void onRowSelectNavigate(SelectEvent event) {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("hiringView.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(ApplicationController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FacesConverter(forClass = Hiring.class)
    public static class HiringControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            HiringController controller = (HiringController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "hiringController");
            return controller.getHiring(getKey(value));
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
            if (object instanceof Hiring) {
                Hiring o = (Hiring) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Hiring.class.getName()});
                return null;
            }
        }

    }

}
