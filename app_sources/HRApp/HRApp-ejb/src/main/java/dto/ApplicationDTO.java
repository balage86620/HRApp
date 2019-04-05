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
import process.Mapper;

/**
 *
 * @author lkg
 */
public class ApplicationDTO extends AbstractDTO {

    private Integer id;
    private Date dateOfApplication;
    private String status;
    private Date modificationDate;
    private HiringDTO hiringDTO;
    private PersonDTO personDTO;
    private List<InterviewDTO> interviewList;

    private ApplicationDTO(ApplicationDTOBuilder builder) {
        this.id = builder.id;
        this.dateOfApplication = builder.dateOfApplication;
        this.status = builder.status;
        this.modificationDate = builder.modificationDate;
        this.hiringDTO = builder.hiringDTO;
        this.personDTO = builder.personDTO;
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

    public HiringDTO getHiringDTO() {
        return hiringDTO;
    }

    public void setHiringDTO(HiringDTO hiringDTO) {
        this.hiringDTO = hiringDTO;
    }

    public PersonDTO getPersonDTO() {
        return personDTO;
    }

    public void setPersonDTO(PersonDTO personDTO) {
        this.personDTO = personDTO;
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
        hash = 67 * hash + Objects.hashCode(this.hiringDTO);
        hash = 67 * hash + Objects.hashCode(this.personDTO);
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
        if (!Objects.equals(this.hiringDTO, other.hiringDTO)) {
            return false;
        }
        if (!Objects.equals(this.personDTO, other.personDTO)) {
            return false;
        }
        if (!Objects.equals(this.interviewList, other.interviewList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ApplicationDTO{" + "id=" + id + ", dateOfApplication=" + dateOfApplication + ", status=" + status + ", modificationDate=" + modificationDate + ", hiringDTO=" + hiringDTO + ", personDTO=" + personDTO + ", interviewList=" + interviewList + '}';
    }
    
    
    public static class ApplicationDTOBuilder {

        private Integer id;
        private Date dateOfApplication;
        private String status;
        private Date modificationDate;
        private HiringDTO hiringDTO;
        private PersonDTO personDTO;
        private List<InterviewDTO> interviewList;

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

        public ApplicationDTOBuilder withHiring(Hiring hiring) {
            this.hiringDTO = Mapper.getMapper().convertFromHiringEntityToDTO(hiring);
            return this;
        }
        public ApplicationDTOBuilder withHiringDTO(HiringDTO hiringDTO) {
            this.hiringDTO = hiringDTO;
            return this;
        }

        public ApplicationDTOBuilder withPerson(Person person) {
            this.personDTO = Mapper.getMapper().convertFromPersonEntityToDTO(person);
            return this;
        }
        public ApplicationDTOBuilder withPersonDTO(PersonDTO person) {
            this.personDTO = personDTO;
            return this;
        }

        public ApplicationDTOBuilder withInterviewList(List<Interview> interviewList) {
            this.interviewList = ListMapper.getListMapper().convertFromInterviewEntityList(interviewList);
            return this;
        }
        public ApplicationDTOBuilder withInterviewListDTO(List<InterviewDTO> interviewList) {
            this.interviewList = interviewList;
            return this;
        }

        public ApplicationDTO build() {
            return new ApplicationDTO(this);
        }

    }
}
