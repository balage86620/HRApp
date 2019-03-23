/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.evoplus.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author notes
 */
@Entity
@Table(name = "hiring")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hiring.findAll", query = "SELECT h FROM Hiring h")
    , @NamedQuery(name = "Hiring.findById", query = "SELECT h FROM Hiring h WHERE h.id = :id")
    , @NamedQuery(name = "Hiring.findByJobName", query = "SELECT h FROM Hiring h WHERE h.jobName = :jobName")
    , @NamedQuery(name = "Hiring.findByJobDescription", query = "SELECT h FROM Hiring h WHERE h.jobDescription = :jobDescription")
    , @NamedQuery(name = "Hiring.findByJobLocation", query = "SELECT h FROM Hiring h WHERE h.jobLocation = :jobLocation")
    , @NamedQuery(name = "Hiring.findBySalaryCategory", query = "SELECT h FROM Hiring h WHERE h.salaryCategory = :salaryCategory")
    , @NamedQuery(name = "Hiring.findByJobId", query = "SELECT h FROM Hiring h WHERE h.jobId = :jobId")})
public class Hiring implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "job_name")
    private String jobName;
    @Size(max = 2000)
    @Column(name = "job_description")
    private String jobDescription;
    @Size(max = 45)
    @Column(name = "job_location")
    private String jobLocation;
    @Size(max = 500)
    @Column(name = "salary_category")
    private String salaryCategory;
    @Basic(optional = false)
    @NotNull
    @Column(name = "job_id")
    private int jobId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hiringId")
    private List<Application> applicationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hiringId")
    private List<Degree2hiring> degree2hiringList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hiringId")
    private List<Skill2hiring> skill2hiringList;

    public Hiring() {
    }

    public Hiring(Integer id) {
        this.id = id;
    }

    public Hiring(Integer id, int jobId) {
        this.id = id;
        this.jobId = jobId;
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

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    @XmlTransient
    public List<Application> getApplicationList() {
        return applicationList;
    }

    public void setApplicationList(List<Application> applicationList) {
        this.applicationList = applicationList;
    }

    @XmlTransient
    public List<Degree2hiring> getDegree2hiringList() {
        return degree2hiringList;
    }

    public void setDegree2hiringList(List<Degree2hiring> degree2hiringList) {
        this.degree2hiringList = degree2hiringList;
    }

    @XmlTransient
    public List<Skill2hiring> getSkill2hiringList() {
        return skill2hiringList;
    }

    public void setSkill2hiringList(List<Skill2hiring> skill2hiringList) {
        this.skill2hiringList = skill2hiringList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hiring)) {
            return false;
        }
        Hiring other = (Hiring) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hu.evoplus.entity.Hiring[ id=" + id + " ]";
    }
    
}
