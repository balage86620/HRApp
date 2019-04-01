/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Objects;
import model.Hiring;
import model.Skill;

/**
 *
 * @author lkg
 */
public class Skill2hiringDTO extends AbstractDTO {

    private Integer id;
    private Integer skillLevel;
    private Hiring hiringId;
    private Skill skillId;

    public Skill2hiringDTO(Skill2hiringDTOBuilder builder) {
        this.id = builder.id;
        this.skillLevel = builder.skillLevel;
        this.hiringId = builder.hiringId;
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

    public Hiring getHiringId() {
        return hiringId;
    }

    public void setHiringId(Hiring hiringId) {
        this.hiringId = hiringId;
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
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.skillLevel);
        hash = 37 * hash + Objects.hashCode(this.hiringId);
        hash = 37 * hash + Objects.hashCode(this.skillId);
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
        final Skill2hiringDTO other = (Skill2hiringDTO) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.skillLevel, other.skillLevel)) {
            return false;
        }
        if (!Objects.equals(this.hiringId, other.hiringId)) {
            return false;
        }
        if (!Objects.equals(this.skillId, other.skillId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Skill2hiringDTO{" + "id=" + id + ", skillLevel=" + skillLevel + ", hiringId=" + hiringId + ", skillId=" + skillId + '}';
    }

    public static class Skill2hiringDTOBuilder {

        private Integer id;
        private Integer skillLevel;
        private Hiring hiringId;
        private Skill skillId;

        public Skill2hiringDTOBuilder() {
        }

        public Skill2hiringDTOBuilder withId(Integer id) {
            this.id = id;
            return this;
        }

        public Skill2hiringDTOBuilder withSkillLevel(Integer skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }

        public Skill2hiringDTOBuilder withHiringId(Hiring hiringId) {
            this.hiringId = hiringId;
            return this;
        }

        public Skill2hiringDTOBuilder withSkillId(Skill skillId) {
            this.skillId = skillId;
            return this;
        }

        public Skill2hiringDTO build() {
            return new Skill2hiringDTO(this);
        }

    }
}
