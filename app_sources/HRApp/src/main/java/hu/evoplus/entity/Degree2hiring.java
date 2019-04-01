/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.evoplus.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author notes
 */
@Entity
@Table(name = "degree2hiring")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Degree2hiring.findAll", query = "SELECT d FROM Degree2hiring d")
    , @NamedQuery(name = "Degree2hiring.findById", query = "SELECT d FROM Degree2hiring d WHERE d.id = :id")})
public class Degree2hiring extends AbstractEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "degree_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Degree degreeId;
    @JoinColumn(name = "hiring_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Hiring hiringId;

    public Degree2hiring() {
    }

    public Degree2hiring(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Degree getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(Degree degreeId) {
        this.degreeId = degreeId;
    }

    public Hiring getHiringId() {
        return hiringId;
    }

    public void setHiringId(Hiring hiringId) {
        this.hiringId = hiringId;
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
        if (!(object instanceof Degree2hiring)) {
            return false;
        }
        Degree2hiring other = (Degree2hiring) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hu.evoplus.entity.Degree2hiring[ id=" + id + " ]";
    }
    
}
