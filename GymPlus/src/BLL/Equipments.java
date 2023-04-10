/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TECHCOM
 */
@Entity
@Table(name = "Equipments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipments.findAll", query = "SELECT e FROM Equipments e"),
    @NamedQuery(name = "Equipments.findById", query = "SELECT e FROM Equipments e WHERE e.id = :id"),
    @NamedQuery(name = "Equipments.findByPaisjet", query = "SELECT e FROM Equipments e WHERE e.paisjet = :paisjet")})
public class Equipments implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq" , sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Paisjet")
    private String paisjet;
    @JoinColumn(name = "ClassesID", referencedColumnName = "ID")
    @ManyToOne
    private Classes classesID;

    public Equipments() {
    }

    public Equipments(Integer id) {
        this.id = id;
    }

    public Equipments(Integer id, String paisjet) {
        this.id = id;
        this.paisjet = paisjet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaisjet() {
        return paisjet;
    }

    public void setPaisjet(String paisjet) {
        this.paisjet = paisjet;
    }

    public Classes getClassesID() {
        return classesID;
    }

    public void setClassesID(Classes classesID) {
        this.classesID = classesID;
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
        if (!(object instanceof Equipments)) {
            return false;
        }
        Equipments other = (Equipments) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + id +" "+ paisjet;
    }
    
}
