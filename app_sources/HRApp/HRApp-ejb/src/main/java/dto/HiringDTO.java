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
import java.util.Objects;
import process.ListMapper;

/**
 *
 * @author lkg
 */
public class HiringDTO extends AbstractDTO{

    private Integer id;
    private String jobName;
    private String jobDescription;
    private String jobLocation;
    private String salaryCategory;
    private Date addedAt;
    private int jobId;
    private List<ApplicationDTO> applicationList;
    private List<Degree2hiringDTO> degree2hiringList;
    private List<Skill2hiringDTO> skill2hiringList;
    
    private HiringDTO(HiringDTOBuilder builder) {
        this.id = builder.id;
        this.jobName = builder.jobName;
        this.jobDescription = builder.jobDescription;
        this.jobLocation = builder.jobLocation;
        this.salaryCategory = builder.salaryCategory;
        this.addedAt = builder.addedAt;
        this.jobId = builder.jobId;
        this.applicationList = ListMapper.getListMapper()
                .convertFromApplicationEntityList(builder.applicationList);
        this.degree2hiringList = ListMapper.getListMapper()
                .convertFromDegree2hiringEntityList(builder.degree2hiringList);
        this.skill2hiringList = ListMapper.getListMapper()
                .convertFromSkill2hiringEntityList(builder.skill2hiringList);

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

    public List<ApplicationDTO> getApplicationList() {
        return applicationList;
    }

    public void setApplicationList(List<ApplicationDTO> applicationList) {
        this.applicationList = applicationList;
    }

    public List<Degree2hiringDTO> getDegree2hiringList() {
        return degree2hiringList;
    }

    public void setDegree2hiringList(List<Degree2hiringDTO> degree2hiringList) {
        this.degree2hiringList = degree2hiringList;
    }

    public List<Skill2hiringDTO> getSkill2hiringList() {
        return skill2hiringList;
    }

    public void setSkill2hiringList(List<Skill2hiringDTO> skill2hiringList) {
        this.skill2hiringList = skill2hiringList;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.jobName);
        hash = 59 * hash + Objects.hashCode(this.jobDescription);
        hash = 59 * hash + Objects.hashCode(this.jobLocation);
        hash = 59 * hash + Objects.hashCode(this.salaryCategory);
        hash = 59 * hash + Objects.hashCode(this.addedAt);
        hash = 59 * hash + this.jobId;
        hash = 59 * hash + Objects.hashCode(this.applicationList);
        hash = 59 * hash + Objects.hashCode(this.degree2hiringList);
        hash = 59 * hash + Objects.hashCode(this.skill2hiringList);
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
        final HiringDTO other = (HiringDTO) obj;
        if (this.jobId != other.jobId) {
            return false;
        }
        if (!Objects.equals(this.jobName, other.jobName)) {
            return false;
        }
        if (!Objects.equals(this.jobDescription, other.jobDescription)) {
            return false;
        }
        if (!Objects.equals(this.jobLocation, other.jobLocation)) {
            return false;
        }
        if (!Objects.equals(this.salaryCategory, other.salaryCategory)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.addedAt, other.addedAt)) {
            return false;
        }
        if (!Objects.equals(this.applicationList, other.applicationList)) {
            return false;
        }
        if (!Objects.equals(this.degree2hiringList, other.degree2hiringList)) {
            return false;
        }
        if (!Objects.equals(this.skill2hiringList, other.skill2hiringList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HiringDTO{" + "id=" + id + ", jobName=" + jobName + ", jobDescription=" + jobDescription + ", jobLocation=" + jobLocation + ", salaryCategory=" + salaryCategory + ", addedAt=" + addedAt + ", jobId=" + jobId + ", applicationList=" + applicationList + ", degree2hiringList=" + degree2hiringList + ", skill2hiringList=" + skill2hiringList + '}';
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
