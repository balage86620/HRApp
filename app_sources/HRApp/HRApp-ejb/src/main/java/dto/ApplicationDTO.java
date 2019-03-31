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

/**
 *
 * @author lkg
 */
public class ApplicationDTO {

    private Integer id;
    private Date dateOfApplication;
    private String status;
    private Date modificationDate;
    private Hiring hiringId;
    private Person personId;
    private List<Interview> interviewList;

    private ApplicationDTO(ApplicationDTOBuilder builder) {
        this.id = builder.id;
        this.dateOfApplication = builder.dateOfApplication;
        this.status = builder.status;
        this.modificationDate = builder.modificationDate;
        this.hiringId = builder.hiringId;
        this.personId = builder.personId;
        this.interviewList = builder.interviewList;
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

    public List<Interview> getInterviewList() {
        return interviewList;
    }

    public void setInterviewList(List<Interview> interviewList) {
        this.interviewList = interviewList;
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
