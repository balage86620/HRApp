/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import model.Application;
import model.Degree2hiring;
import model.Skill2hiring;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lkg
 */
public class HiringDTO {

    private Integer id;
    private String jobName;
    private String jobDescription;
    private String jobLocation;
    private String salaryCategory;
    private Date addedAt;
    private int jobId;
    private List<Application> applicationList;
    private List<Degree2hiring> degree2hiringList;
    private List<Skill2hiring> skill2hiringList;
    
    private HiringDTO(HiringDTOBuilder builder) {
        this.id = builder.id;
        this.jobName = builder.jobName;
        this.jobDescription = builder.jobDescription;
        this.jobLocation = builder.jobLocation;
        this.salaryCategory = builder.salaryCategory;
        this.addedAt = builder.addedAt;
        this.jobId = builder.jobId;
        this.applicationList = builder.applicationList;
        this.degree2hiringList = builder.degree2hiringList;
        this.skill2hiringList = builder.skill2hiringList;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getSalaryCategory() {
        return salaryCategory;
    }

    public void setSalaryCategory(String salaryCategory) {
        this.salaryCategory = salaryCategory;
    }

    public Date getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(Date addedAt) {
        this.addedAt = addedAt;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public List<Application> getApplicationList() {
        return applicationList;
    }

    public void setApplicationList(List<Application> applicationList) {
        this.applicationList = applicationList;
    }

    public List<Degree2hiring> getDegree2hiringList() {
        return degree2hiringList;
    }

    public void setDegree2hiringList(List<Degree2hiring> degree2hiringList) {
        this.degree2hiringList = degree2hiringList;
    }

    public List<Skill2hiring> getSkill2hiringList() {
        return skill2hiringList;
    }

    public void setSkill2hiringList(List<Skill2hiring> skill2hiringList) {
        this.skill2hiringList = skill2hiringList;
    }
    
    public static class HiringDTOBuilder {

        private Integer id;
        private String jobName;
        private String jobDescription;
        private String jobLocation;
        private String salaryCategory;
        private Date addedAt;
        private int jobId;
        private List<Application> applicationList;
        private List<Degree2hiring> degree2hiringList;
        private List<Skill2hiring> skill2hiringList;

        public HiringDTOBuilder() {
        }
        
        public HiringDTOBuilder withId(Integer id) {
            this.id = id;
            return this;
        }

        public HiringDTOBuilder withJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }

        public HiringDTOBuilder withJobDescription(String jobDescription) {
            this.jobDescription = jobDescription;
            return this;
        }

        public HiringDTOBuilder withJobLocation(String jobLocation) {
            this.jobLocation = jobLocation;
            return this;
        }

        public HiringDTOBuilder withSalaryCategory(String salaryCategory) {
            this.salaryCategory = salaryCategory;
            return this;
        }

        public HiringDTOBuilder withAddedAt(Date addedAt) {
            this.addedAt = addedAt;
            return this;
        }

        public HiringDTOBuilder withJobId(int jobId) {
            this.jobId = jobId;
            return this;
        }

        public HiringDTOBuilder withApplicationList(List<Application> applicationList) {
            this.applicationList = applicationList;
            return this;
        }

        public HiringDTOBuilder withDegree2hiringList(List<Degree2hiring> degree2hiringList) {
            this.degree2hiringList = degree2hiringList;
            return this;
        }

        public HiringDTOBuilder withSkill2hiringList(List<Skill2hiring> skill2hiringList) {
            this.skill2hiringList = skill2hiringList;
            return this;
        }
        
        public HiringDTO build() {
            return new HiringDTO(this);
        } 
        
    }
}
