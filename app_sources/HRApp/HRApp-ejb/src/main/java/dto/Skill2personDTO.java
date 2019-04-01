/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Objects;
import model.Person;
import model.Skill;

/**
 *
 * @author Win10
 */
public class Skill2personDTO extends AbstractDTO {

    private Integer id;
    private Integer skillLevel;
    private Person personId;
    private Skill skillId;

    public Skill2personDTO(Skill2personDTOBuilder builder) {
        this.id = builder.id;
        this.skillLevel = builder.skillLevel;
        this.personId = builder.personId;
        this.skillId = builder.skillId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(Integer skillLevel) {
        this.skillLevel = skillLevel;
    }

    public Person getPersonId() {
        return personId;
    }

    public void setPersonId(Person personId) {
        this.personId = personId;
    }

    public Skill getSkillId() {
        return skillId;
    }

    public void setSkillId(Skill skillId) {
        this.skillId = skillId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.skillLevel);
        hash = 89 * hash + Objects.hashCode(this.personId);
        hash = 89 * hash + Objects.hashCode(this.skillId);
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
        final Skill2personDTO other = (Skill2personDTO) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.skillLevel, other.skillLevel)) {
            return false;
        }
        if (!Objects.equals(this.personId, other.personId)) {
            return false;
        }
        if (!Objects.equals(this.skillId, other.skillId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Skill2personDTO{" + "id=" + id + ", skillLevel=" + skillLevel + ", personId=" + personId + ", skillId=" + skillId + '}';
    }

    public static class Skill2personDTOBuilder {

        private Integer id;
        private Integer skillLevel;
        private Person personId;
        private Skill skillId;

        public Skill2personDTOBuilder() {
        }

        public Skill2personDTOBuilder withId(Integer id) {
            this.id = id;
            return this;
        }

        public Skill2personDTOBuilder withSkillLevel(Integer skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }

        public Skill2personDTOBuilder withPersonId(Person personId) {
            this.personId = personId;
            return this;
        }

        public Skill2personDTOBuilder withSkillId(Skill skillId) {
            this.skillId = skillId;
            return this;
        }

        public Skill2personDTO build() {
            return new Skill2personDTO(this);
        }

    }
}
