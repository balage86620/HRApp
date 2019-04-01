/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import model.Application;
import model.Cv;
import model.Degree2person;
import model.Skill2person;
import java.util.List;
import java.util.Objects;
import process.ListMapper;

/**
 *
 * @author lkg
 */
public class PersonDTO extends AbstractDTO {

    private Integer id;
    private String name;
    private String userName;
    private String password;
    private String email;
    private List<Cv> cvList;
    private List<ApplicationDTO> applicationList;
    private List<Degree2personDTO> degree2personList;
    private List<Skill2personDTO> skill2personList;

    private PersonDTO(PersonDTOBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.userName = builder.userName;
        this.password = builder.password;
        this.email = builder.email;
        this.cvList = builder.cvList;
        this.applicationList = ListMapper.getListMapper()
                .convertFromApplicationEntityList(builder.applicationList);
        this.degree2personList = ListMapper.getListMapper()
                .convertFromDegree2personEntityList(builder.degree2personList);
        this.skill2personList = ListMapper.getListMapper()
                .convertFromSkill2personEntityList(builder.skill2personList);
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Cv> getCvList() {
        return cvList;
    }

    public void setCvList(List<Cv> cvList) {
        this.cvList = cvList;
    }

    public List<ApplicationDTO> getApplicationList() {
        return applicationList;
    }

    public void setApplicationList(List<ApplicationDTO> applicationList) {
        this.applicationList = applicationList;
    }

    public List<Degree2personDTO> getDegree2personList() {
        return degree2personList;
    }

    public void setDegree2personList(List<Degree2personDTO> degree2personList) {
        this.degree2personList = degree2personList;
    }

    public List<Skill2personDTO> getSkill2personList() {
        return skill2personList;
    }

    public void setSkill2personList(List<Skill2personDTO> skill2personList) {
        this.skill2personList = skill2personList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.userName);
        hash = 97 * hash + Objects.hashCode(this.password);
        hash = 97 * hash + Objects.hashCode(this.email);
        hash = 97 * hash + Objects.hashCode(this.cvList);
        hash = 97 * hash + Objects.hashCode(this.applicationList);
        hash = 97 * hash + Objects.hashCode(this.degree2personList);
        hash = 97 * hash + Objects.hashCode(this.skill2personList);
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
        final PersonDTO other = (PersonDTO) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.cvList, other.cvList)) {
            return false;
        }
        if (!Objects.equals(this.applicationList, other.applicationList)) {
            return false;
        }
        if (!Objects.equals(this.degree2personList, other.degree2personList)) {
            return false;
        }
        if (!Objects.equals(this.skill2personList, other.skill2personList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PersonDTO{" + "id=" + id + ", name=" + name + ", userName=" + userName + ", password=" + password + ", email=" + email + ", cvList=" + cvList + ", applicationList=" + applicationList + ", degree2personList=" + degree2personList + ", skill2personList=" + skill2personList + '}';
    }

    public static class PersonDTOBuilder {

        private Integer id;
        private String name;
        private String userName;
        private String password;
        private String email;
        private List<Cv> cvList;
        private List<Application> applicationList;
        private List<Degree2person> degree2personList;
        private List<Skill2person> skill2personList;

        public PersonDTOBuilder() {
        }

        public PersonDTOBuilder withID(Integer id) {
            this.id = id;
            return this;
        }

        public PersonDTOBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PersonDTOBuilder withUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public PersonDTOBuilder withPassword(String pw) {
            this.password = pw;
            return this;
        }

        public PersonDTOBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public PersonDTOBuilder withCvList(List<Cv> list) {
            this.cvList = list;
            return this;
        }

        public PersonDTOBuilder withApplicants(List<Application> list) {
            this.applicationList = list;
            return this;
        }

        public PersonDTOBuilder withSkills(List<Skill2person> list) {
            this.skill2personList = list;
            return this;
        }

        public PersonDTOBuilder withDegrees(List<Degree2person> list) {
            this.degree2personList = list;
            return this;
        }

        public PersonDTO build() {
            return new PersonDTO(this);
        }
    }

}
