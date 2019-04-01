/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.evoplus.entity;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author notes
 */
@Entity
@Table(name = "degree")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Degree.findAll", query = "SELECT d FROM Degree d")
    , @NamedQuery(name = "Degree.findById", query = "SELECT d FROM Degree d WHERE d.id = :id")
    , @NamedQuery(name = "Degree.findByName", query = "SELECT d FROM Degree d WHERE d.name = :name")})
public class Degree extends AbstractEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "degreeId")
    private List<Degree2person> degree2personList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "degreeId")
    private List<Degree2hiring> degree2hiringList;

    public Degree() {
    }

    public Degree(Integer id) {
        this.id = id;
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

    @XmlTransient
    public List<Degree2person> getDegree2personList() {
        return degree2personList;
    }

    public void setDegree2personList(List<Degree2person> degree2personList) {
        this.degree2personList = degree2personList;
    }

    @XmlTransient
    public List<Degree2hiring> getDegree2hiringList() {
        return degree2hiringList;
    }

    public void setDegree2hiringList(List<Degree2hiring> degree2hiringList) {
        this.degree2hiringList = degree2hiringList;
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
        if (!(object instanceof Degree)) {
            return false;
        }
        Degree other = (Degree) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hu.evoplus.entity.Degree[ id=" + id + " ]";
    }
    
}
