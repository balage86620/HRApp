/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.evoplus.dto;

import hu.evoplus.entity.Skill2hiring;
import hu.evoplus.entity.Skill2person;
import hu.evoplus.process.ListMapper;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author lkg
 */
public class SkillDTO extends AbstractDTO {

    private Integer id;
    private String name;
    private String type;
    private List<Skill2personDTO> skill2personList;
    private List<Skill2hiringDTO> skill2hiringList;

    public SkillDTO(SkillDTOBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.type = builder.type;
        this.skill2personList = ListMapper.getListMapper()
                .convertFromSkill2personEntityList(builder.skill2personList);
        this.skill2hiringList = ListMapper.getListMapper()
                .convertFromSkill2hiringEntityList(builder.skill2hiringList);
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Skill2personDTO> getSkill2personList() {
        return skill2personList;
    }

    public void setSkill2personList(List<Skill2personDTO> skill2personList) {
        this.skill2personList = skill2personList;
    }

    public List<Skill2hiringDTO> getSkill2hiringList() {
        return skill2hiringList;
    }

    public void setSkill2hiringList(List<Skill2hiringDTO> skill2hiringList) {
        this.skill2hiringList = skill2hiringList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.type);
        hash = 71 * hash + Objects.hashCode(this.skill2personList);
        hash = 71 * hash + Objects.hashCode(this.skill2hiringList);
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
        final SkillDTO other = (SkillDTO) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.skill2personList, other.skill2personList)) {
            return false;
        }
        if (!Objects.equals(this.skill2hiringList, other.skill2hiringList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SkillDTO{" + "id=" + id + ", name=" + name + ", type=" + type + ", skill2personList=" + skill2personList + ", skill2hiringList=" + skill2hiringList + '}';
    }

    public static class SkillDTOBuilder {

        private Integer id;
        private String name;
        private String type;
        private List<Skill2person> skill2personList;
        private List<Skill2hiring> skill2hiringList;

        public SkillDTOBuilder() {
        }

        public SkillDTOBuilder withId(Integer id) {
            this.id = id;
            return this;
        }

        public SkillDTOBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public SkillDTOBuilder withType(String type) {
            this.type = type;
            return this;
        }

        public SkillDTOBuilder withSkill2personList(List<Skill2person> skill2personList) {
            this.skill2personList = skill2personList;
            return this;
        }

        public SkillDTOBuilder withSkill2hiringList(List<Skill2hiring> skill2hiringList) {
            this.skill2hiringList = skill2hiringList;
            return this;
        }

        public SkillDTO build() {
            return new SkillDTO(this);
        }

    }

}
