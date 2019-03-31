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

/**
 *
 * @author lkg
 */
public class PersonDTO {

    private Integer id;
    private String name;
    private String userName;
    private String password;
    private String email;
    private List<Cv> cvList;
    private List<Application> applicationList;
    private List<Degree2person> degree2personList;
    private List<Skill2person> skill2personList;

    private PersonDTO(PersonDTOBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.userName = builder.userName;
        this.password = builder.password;
        this.email = builder.email;
        this.cvList = builder.cvList;
        this.applicationList = builder.applicationList;
        this.degree2personList = builder.degree2personList;
        this.skill2personList = builder.skill2personList;
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

    public List<Application> getApplicationList() {
        return applicationList;
    }

    public void setApplicationList(List<Application> applicationList) {
        this.applicationList = applicationList;
    }

    public List<Degree2person> getDegree2personList() {
        return degree2personList;
    }

    public void setDegree2personList(List<Degree2person> degree2personList) {
        this.degree2personList = degree2personList;
    }

    public List<Skill2person> getSkill2personList() {
        return skill2personList;
    }

    public void setSkill2personList(List<Skill2person> skill2personList) {
        this.skill2personList = skill2personList;
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
