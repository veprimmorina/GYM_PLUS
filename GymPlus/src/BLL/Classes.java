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
@Table(name = "Classes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Classes.findAll", query = "SELECT c FROM Classes c"),
    @NamedQuery(name = "Classes.findById", query = "SELECT c FROM Classes c WHERE c.id = :id"),
    @NamedQuery(name = "Classes.findByFillon", query = "SELECT c FROM Classes c WHERE c.fillon = :fillon"),
    @NamedQuery(name = "Classes.findByMbaron", query = "SELECT c FROM Classes c WHERE c.mbaron = :mbaron")})
public class Classes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq" , sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Fillon")
    @Temporal(TemporalType.TIME)
    private Date fillon;
    @Basic(optional = false)
    @Column(name = "Mbaron")
    @Temporal(TemporalType.TIME)
    private Date mbaron;
    @OneToMany(mappedBy = "classesID")
    private Collection<Equipments> equipmentsCollection;
    @JoinColumn(name = "TraineriID", referencedColumnName = "ID")
    @ManyToOne
    private Traineri traineriID;

    public Classes() {
    }

    public Classes(Integer id) {
        this.id = id;
    }

    public Classes(Integer id, Date fillon, Date mbaron) {
        this.id = id;
        this.fillon = fillon;
        this.mbaron = mbaron;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFillon() {
        return fillon;
    }

    public void setFillon(Date fillon) {
        this.fillon = fillon;
    }

    public Date getMbaron() {
        return mbaron;
    }

    public void setMbaron(Date mbaron) {
        this.mbaron = mbaron;
    }

    @XmlTransient
    public Collection<Equipments> getEquipmentsCollection() {
        return equipmentsCollection;
    }

    public void setEquipmentsCollection(Collection<Equipments> equipmentsCollection) {
        this.equipmentsCollection = equipmentsCollection;
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
        if (!(object instanceof Classes)) {
            return false;
        }
        Classes other = (Classes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return   ""+ fillon +mbaron ;
    }
    
}
