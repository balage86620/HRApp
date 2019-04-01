/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.evoplus.dto;

import hu.evoplus.entity.Person;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author lkg
 */
public class CvDTO extends AbstractDTO {

    private Integer id;
    private String pathToFile;
    private String language;
    private Date uploadDate;
    private Person personId;

    public CvDTO(CvDTOBuilder builder) {
        this.id = builder.id;
        this.pathToFile = builder.pathToFile;
        this.language = builder.language;
        this.uploadDate = builder.uploadDate;
        this.personId = builder.personId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
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
        final CvDTO other = (CvDTO) obj;
        if (!Objects.equals(this.pathToFile, other.pathToFile)) {
            return false;
        }
        if (!Objects.equals(this.language, other.language)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.uploadDate, other.uploadDate)) {
            return false;
        }
        if (!Objects.equals(this.personId, other.personId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CvDTO{" + "id=" + id + ", pathToFile=" + pathToFile + ", language=" + language + ", uploadDate=" + uploadDate + ", personId=" + personId + '}';
    }

    public static class CvDTOBuilder {

        private Integer id;
        private String pathToFile;
        private String language;
        private Date uploadDate;
        private Person personId;

        public CvDTOBuilder() {
        }

        public CvDTOBuilder withId(Integer id) {
            this.id = id;
            return this;
        }

        public CvDTOBuilder withPathToFile(String pathToFile) {
            this.pathToFile = pathToFile;
            return this;
        }

        public CvDTOBuilder withLanguage(String language) {
            this.language = language;
            return this;
        }

        public CvDTOBuilder withUploadDate(Date uploadDate) {
            this.uploadDate = uploadDate;
            return this;
        }

        public CvDTOBuilder withPersonId(Person personId) {
            this.personId = personId;
            return this;
        }

        public CvDTO build() {
            return new CvDTO(this);
        }
    }

}
