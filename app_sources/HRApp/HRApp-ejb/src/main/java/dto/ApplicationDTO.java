/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import model.Hiring;
import model.Interview;
import model.Person;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import process.ListMapper;

/**
 *
 * @author lkg
 */
public class ApplicationDTO extends AbstractDTO {

      private Integer id;
    private Date dateOfApplication;
    private String status;
    private Date modificationDate;
    private Hiring hiringId;
    private Person personId;
    private List<InterviewDTO> interviewList;

    private ApplicationDTO(ApplicationDTOBuilder builder) {
        this.id = builder.id;
        this.dateOfApplication = builder.dateOfApplication;
        this.status = builder.status;
        this.modificationDate = builder.modificationDate;
        this.hiringId = builder.hiringId;
        this.personId = builder.personId;
        this.interviewList = ListMapper.getListMapper()
                .convertFromInterviewEntityList(builder.interviewList);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateOfApplication() {
        return dateOfApplication;
    }

    public void setDateOfApplication(Date dateOfApplication) {
        this.dateOfApplication = dateOfApplication;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public Hiring getHiringId() {
        return hiringId;
    }

    public void setHiringId(Hiring hiringId) {
        this.hiringId = hiringId;
    }

    public Person getPersonId() {
        return personId;
    }

    public void setPersonId(Person personId) {
        this.personId = personId;
    }

    public List<InterviewDTO> getInterviewList() {
        return interviewList;
    }

    public void setInterviewList(List<InterviewDTO> interviewList) {
        this.interviewList = interviewList;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.dateOfApplication);
        hash = 67 * hash + Objects.hashCode(this.status);
        hash = 67 * hash + Objects.hashCode(this.modificationDate);
        hash = 67 * hash + Objects.hashCode(this.hiringId);
        hash = 67 * hash + Objects.hashCode(this.personId);
        hash = 67 * hash + Objects.hashCode(this.interviewList);
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
        final ApplicationDTO other = (ApplicationDTO) obj;
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dateOfApplication, other.dateOfApplication)) {
            return false;
        }
        if (!Objects.equals(this.modificationDate, other.modificationDate)) {
            return false;
        }
        if (!Objects.equals(this.hiringId, other.hiringId)) {
            return false;
        }
        if (!Objects.equals(this.personId, other.personId)) {
            return false;
        }
        if (!Objects.equals(this.interviewList, other.interviewList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ApplicationDTO{" + "id=" + id + ", dateOfApplication=" + dateOfApplication + ", status=" + status + ", modificationDate=" + modificationDate + ", hiringId=" + hiringId + ", personId=" + personId + ", interviewList=" + interviewList + '}';
    }
    
    
    public static class ApplicationDTOBuilder {

        private Integer id;
        private Date dateOfApplication;
        private String status;
        private Date modificationDate;
        private Hiring hiringId;
        private Person personId;
        private List<Interview> interviewList;

        public ApplicationDTOBuilder() {
        }

        public ApplicationDTOBuilder withId(Integer id) {
            this.id = id;
            return this;
        }

        public ApplicationDTOBuilder withDateOfApplication(Date dateOfApplication) {
            this.dateOfApplication = dateOfApplication;
            return this;
        }

        public ApplicationDTOBuilder withStatus(String status) {
            this.status = status;
            return this;
        }

        public ApplicationDTOBuilder withModificationDate(Date modificationDate) {
            this.modificationDate = modificationDate;
            return this;
        }

        public ApplicationDTOBuilder withHiringId(Hiring hiringId) {
            this.hiringId = hiringId;
            return this;
        }

        public ApplicationDTOBuilder withPersonId(Person personId) {
            this.personId = personId;
            return this;
        }

        public ApplicationDTOBuilder withInterviewList(List<Interview> interviewList) {
            this.interviewList = interviewList;
            return this;
        }

        public ApplicationDTO build() {
            return new ApplicationDTO(this);
        }

    }
}
