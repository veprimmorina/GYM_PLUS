/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TECHCOM
 */
@Entity
@Table(name = "Personi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personi.findAll", query = "SELECT p FROM Personi p"),
    @NamedQuery(name = "Personi.findById", query = "SELECT p FROM Personi p WHERE p.id = :id"),
    @NamedQuery(name = "Personi.findByEmri", query = "SELECT p FROM Personi p WHERE p.emri = :emri"),
    @NamedQuery(name = "Personi.findByMbiemri", query = "SELECT p FROM Personi p WHERE p.mbiemri = :mbiemri"),
    @NamedQuery(name = "Personi.findByDataERegjistrimit", query = "SELECT p FROM Personi p WHERE p.dataERegjistrimit = :dataERegjistrimit")})
public class Personi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq" , sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer id;
    @Column(name = "Emri")
    private String emri;
    @Column(name = "Mbiemri")
    private String mbiemri;
    @Column(name = "DataERegjistrimit")
    @Temporal(TemporalType.DATE)
    private Date dataERegjistrimit;
    @OneToMany(mappedBy = "personiID")
    private Collection<Fees> feesCollection;
    @JoinColumn(name = "TraineriID", referencedColumnName = "ID")
    @ManyToOne
    private Traineri traineriID;

    public Personi() {
    }

    public Personi(Integer id) {
        this.id = id;
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

    public Date getDataERegjistrimit() {
        return dataERegjistrimit;
    }

    public void setDataERegjistrimit(Date dataERegjistrimit) {
        this.dataERegjistrimit = dataERegjistrimit;
    }

    @XmlTransient
    public Collection<Fees> getFeesCollection() {
        return feesCollection;
    }

    public void setFeesCollection(Collection<Fees> feesCollection) {
        this.feesCollection = feesCollection;
    }

    public Traineri getTraineriID() {
        return traineriID;
    }

    public void setTraineriID(Traineri traineriID) {
        this.traineriID = traineriID;
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
        if (!(object instanceof Personi)) {
            return false;
        }
        Personi other = (Personi) object;
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
