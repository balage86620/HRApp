/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.evoplus.dto;

import hu.evoplus.entity.Application;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author lkg
 */
public class InterviewDTO extends AbstractDTO {

    private Integer id;
    private Date date;
    private String description;
    private Application applicationId;

    public InterviewDTO(InterviewDTOBuilder builder) {
        this.id = builder.id;
        this.date = builder.date;
        this.description = builder.description;
        this.applicationId = builder.applicationId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Application getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Application applicationId) {
        this.applicationId = applicationId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.date);
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + Objects.hashCode(this.applicationId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InterviewDTO other = (InterviewDTO) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.applicationId, other.applicationId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InterviewDTO{" + "id=" + id + ", date=" + date + ", description=" + description + ", applicationId=" + applicationId + '}';
    }
    
    public static class InterviewDTOBuilder {
       
        private Integer id;
        private Date date;
        private String description;
        private Application applicationId;
        
        public InterviewDTOBuilder() {
        }

        public InterviewDTOBuilder withId(Integer id) {
            this.id = id;
            return this;
        }

        public InterviewDTOBuilder withDate(Date date) {
            this.date = date;
            return this;
        }

        public InterviewDTOBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public InterviewDTOBuilder withApplicationId(Application applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        
        public InterviewDTO build() {
            return new InterviewDTO(this);
        } 
        
    }
}



