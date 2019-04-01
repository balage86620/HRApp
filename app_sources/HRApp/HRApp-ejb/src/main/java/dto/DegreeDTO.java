/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.List;
import java.util.Objects;
import model.Degree2hiring;
import model.Degree2person;
import process.ListMapper;

/**
 *
 * @author lkg
 */
public class DegreeDTO extends AbstractDTO {

    private Integer id;
    private String name;
    private List<Degree2personDTO> degree2personList;
    private List<Degree2hiringDTO> degree2hiringList;

    public DegreeDTO(DegreeDTOBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.degree2personList = ListMapper.getListMapper()
                .convertFromDegree2personEntityList(builder.degree2personList);
        this.degree2hiringList = ListMapper.getListMapper()
                .convertFromDegree2hiringEntityList(builder.degree2hiringList);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Degree2personDTO> getDegree2personList() {
        return degree2personList;
    }

    public void setDegree2personList(List<Degree2personDTO> degree2personList) {
        this.degree2personList = degree2personList;
    }

    public List<Degree2hiringDTO> getDegree2hiringList() {
        return degree2hiringList;
    }

    public void setDegree2hiringList(List<Degree2hiringDTO> degree2hiringList) {
        this.degree2hiringList = degree2hiringList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.degree2personList);
        hash = 17 * hash + Objects.hashCode(this.degree2hiringList);
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
        final DegreeDTO other = (DegreeDTO) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.degree2personList, other.degree2personList)) {
            return false;
        }
        if (!Objects.equals(this.degree2hiringList, other.degree2hiringList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DegreeDTO{" + "id=" + id + ", name=" + name + ", degree2personList=" + degree2personList + ", degree2hiringList=" + degree2hiringList + '}';
    }

    public static class DegreeDTOBuilder {

        private Integer id;
        private String name;
        private List<Degree2person> degree2personList;
        private List<Degree2hiring> degree2hiringList;

        public DegreeDTOBuilder() {

        }

        public DegreeDTOBuilder withId(Integer id) {
            this.id = id;
            return this;
        }

        public DegreeDTOBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public DegreeDTOBuilder withDegree2personList(List<Degree2person> degree2personList) {
            this.degree2personList = degree2personList;
            return this;
        }

        public DegreeDTOBuilder withDegree2hiringList(List<Degree2hiring> degree2hiringList) {
            this.degree2hiringList = degree2hiringList;
            return this;
        }

        public DegreeDTO build() {
            return new DegreeDTO(this);
        }

    }
}
