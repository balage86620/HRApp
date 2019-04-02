/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Objects;

/**
 *
 * @author lkg
 */
public class JobDTO extends AbstractDTO {

    private Integer id;
    private String jobTitle;
    private String jobDescription;
    private String path;
    private Double minSalary;
    private Double maxSalary;
    private Integer workerNum;
    private String location;
    private String currency = "HUF";

    public JobDTO(JobDTOBuilder builder) {
        this.id = builder.id;
        this.jobTitle = builder.jobTitle;
        this.jobDescription = builder.jobDescription;
        this.path = builder.path;
        this.minSalary = builder.minSalary;
        this.maxSalary = builder.maxSalary;
        this.workerNum = builder.workerNum;
        this.location = builder.location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Double minSalary) {
        this.minSalary = minSalary;
    }

    public Double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(Double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public Integer getWorkerNum() {
        return workerNum;
    }

    public void setWorkerNum(Integer workerNum) {
        this.workerNum = workerNum;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.jobTitle);
        hash = 79 * hash + Objects.hashCode(this.jobDescription);
        hash = 79 * hash + Objects.hashCode(this.path);
        hash = 79 * hash + Objects.hashCode(this.minSalary);
        hash = 79 * hash + Objects.hashCode(this.maxSalary);
        hash = 79 * hash + Objects.hashCode(this.workerNum);
        hash = 79 * hash + Objects.hashCode(this.location);
        hash = 79 * hash + Objects.hashCode(this.currency);
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
        final JobDTO other = (JobDTO) obj;
        if (!Objects.equals(this.jobTitle, other.jobTitle)) {
            return false;
        }
        if (!Objects.equals(this.jobDescription, other.jobDescription)) {
            return false;
        }
        if (!Objects.equals(this.path, other.path)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.currency, other.currency)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.minSalary, other.minSalary)) {
            return false;
        }
        if (!Objects.equals(this.maxSalary, other.maxSalary)) {
            return false;
        }
        if (!Objects.equals(this.workerNum, other.workerNum)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JobDTO{" + "id=" + id + ", jobTitle=" + jobTitle + ", jobDescription=" + jobDescription + ", path=" + path + ", minSalary=" + minSalary + ", maxSalary=" + maxSalary + ", workerNum=" + workerNum + ", location=" + location + ", currency=" + currency + '}';
    }
    
    public static class JobDTOBuilder {

        private Integer id;
        private String jobTitle;
        private String jobDescription;
        private String path;
        private Double minSalary;
        private Double maxSalary;
        private Integer workerNum;
        private String location;
        private String currency = "HUF";

        public JobDTOBuilder() {
        }

        public JobDTOBuilder withId(Integer id) {
            this.id = id;
            return this;
        }

        public JobDTOBuilder withJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public JobDTOBuilder withJobDescription(String jobDescription) {
            this.jobDescription = jobDescription;
            return this;
        }

        public JobDTOBuilder withPath(String path) {
            this.path = path;
            return this;
        }

        public JobDTOBuilder withMinSalary(Double minSalary) {
            this.minSalary = minSalary;
            return this;
        }

        public JobDTOBuilder withMaxSalary(Double maxSalary) {
            this.maxSalary = maxSalary;
            return this;
        }

        public JobDTOBuilder withWorkerNum(Integer workerNum) {
            this.workerNum = workerNum;
            return this;
        }

        public JobDTOBuilder withLocation(String location) {
            this.location = location;
            return this;
        }

        public JobDTOBuilder withCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        
        public JobDTO build() {
            return new JobDTO(this);
        } 
        
    }

}
