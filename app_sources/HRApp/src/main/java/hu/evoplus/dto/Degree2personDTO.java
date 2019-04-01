/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.evoplus.dto;

import hu.evoplus.entity.Degree;
import hu.evoplus.entity.Person;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author lkg
 */
public class Degree2personDTO extends AbstractDTO {

    private Integer id;
    private Date dateOfIssue;
    private Degree degreeId;
    private Person personId;

    public Degree2personDTO(Degree2personDTOBuilder builder) {
        this.id = builder.id;
        this.dateOfIssue = builder.dateOfIssue;
        this.degreeId = builder.degreeId;
        this.personId = builder.personId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Degree getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(Degree degreeId) {
        this.degreeId = degreeId;
    }

    public Person getPersonId() {
        return personId;
    }

    public void setPersonId(Person personId) {
        this.personId = personId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + Objects.hashCode(this.dateOfIssue);
        hash = 11 * hash + Objects.hashCode(this.degreeId);
        hash = 11 * hash + Objects.hashCode(this.personId);
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
        final Degree2personDTO other = (Degree2personDTO) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dateOfIssue, other.dateOfIssue)) {
            return false;
        }
        if (!Objects.equals(this.degreeId, other.degreeId)) {
            return false;
        }
        if (!Objects.equals(this.personId, other.personId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Degree2personDTO{" + "id=" + id + ", dateOfIssue=" + dateOfIssue + ", degreeId=" + degreeId + ", personId=" + personId + '}';
    }

    public static class Degree2personDTOBuilder {

        private Integer id;
        private Date dateOfIssue;
        private Degree degreeId;
        private Person personId;

        public Degree2personDTOBuilder() {

        }

        public Degree2personDTOBuilder withId(Integer id) {
            this.id = id;
            return this;
        }

        public Degree2personDTOBuilder withDateOfIssue(Date dateOfIssue) {
            this.dateOfIssue = dateOfIssue;
            return this;
        }

        public Degree2personDTOBuilder withDegreeId(Degree degreeId) {
            this.degreeId = degreeId;
            return this;
        }

        public Degree2personDTOBuilder withPersonId(Person personId) {
            this.personId = personId;
            return this;
        }

        public Degree2personDTO build() {
            return new Degree2personDTO(this);
        }

    }

}
