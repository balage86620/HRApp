/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.evoplus.dto;

import hu.evoplus.entity.Degree;
import hu.evoplus.entity.Hiring;
import java.util.Objects;

/**
 *
 * @author lkg
 */
public class Degree2hiringDTO extends AbstractDTO {

    private Integer id;
    private Degree degreeId;
    private Hiring hiringId;

    public Degree2hiringDTO(Degree2hiringDTOBuilder builder) {
        this.id = builder.id;
        this.degreeId = builder.degreeId;
        this.hiringId = builder.hiringId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Degree getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(Degree degreeId) {
        this.degreeId = degreeId;
    }

    public Hiring getHiringId() {
        return hiringId;
    }

    public void setHiringId(Hiring hiringId) {
        this.hiringId = hiringId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.degreeId);
        hash = 29 * hash + Objects.hashCode(this.hiringId);
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
        final Degree2hiringDTO other = (Degree2hiringDTO) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.degreeId, other.degreeId)) {
            return false;
        }
        if (!Objects.equals(this.hiringId, other.hiringId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Degree2hiringDTO{" + "id=" + id + ", degreeId=" + degreeId + ", hiringId=" + hiringId + '}';
    }

    public static class Degree2hiringDTOBuilder {

        private Integer id;
        private Degree degreeId;
        private Hiring hiringId;

        public Degree2hiringDTOBuilder() {
        }

        public Degree2hiringDTOBuilder withId(Integer id) {
            this.id = id;
            return this;
        }

        public Degree2hiringDTOBuilder withDegreeId(Degree degreeId) {
            this.degreeId = degreeId;
            return this;
        }

        public Degree2hiringDTOBuilder withHiringId(Hiring hiringId) {
            this.hiringId = hiringId;
            return this;
        }

        public Degree2hiringDTO build() {
            return new Degree2hiringDTO(this);
        }

    }

}
