/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TECHCOM
 */
@Entity
@Table(name = "Traineri")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Traineri.findAll", query = "SELECT t FROM Traineri t"),
    @NamedQuery(name = "Traineri.findById", query = "SELECT t FROM Traineri t WHERE t.id = :id"),
    @NamedQuery(name = "Traineri.findByEmri", query = "SELECT t FROM Traineri t WHERE t.emri = :emri"),
    @NamedQuery(name = "Traineri.findByMbiemri", query = "SELECT t FROM Traineri t WHERE t.mbiemri = :mbiemri")})
public class Traineri implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq" , sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer id;
    
    @Basic(optional = false)
    @Column(name = "Emri")
    private String emri;
    @Basic(optional = false)
    @Column(name = "Mbiemri")
    private String mbiemri;
    @OneToMany(mappedBy = "traineriID")
    private Collection<Personi> personiCollection;
    @OneToMany(mappedBy = "traineriID")
    private Collection<Classes> classesCollection;

    public Traineri() {
    }

    public Traineri(Integer id) {
        this.id = id;
    }

    public Traineri(Integer id, String emri, String mbiemri) {
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    @XmlTransient
    public Collection<Personi> getPersoniCollection() {
        return personiCollection;
    }

    public void setPersoniCollection(Collection<Personi> personiCollection) {
        this.personiCollection = personiCollection;
    }

    @XmlTransient
    public Collection<Classes> getClassesCollection() {
        return classesCollection;
    }

    public void setClassesCollection(Collection<Classes> classesCollection) {
        this.classesCollection = classesCollection;
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
        if (!(object instanceof Traineri)) {
            return false;
        }
        Traineri other = (Traineri) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + id + " "+emri+" "+mbiemri;
    }
    
}
