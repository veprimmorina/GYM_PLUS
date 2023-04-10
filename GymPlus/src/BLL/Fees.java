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
@Table(name = "Fees")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fees.findAll", query = "SELECT f FROM Fees f"),
    @NamedQuery(name = "Fees.findById", query = "SELECT f FROM Fees f WHERE f.id = :id"),
    @NamedQuery(name = "Fees.findByKohezgjatjanemuaj", query = "SELECT f FROM Fees f WHERE f.kohezgjatjanemuaj = :kohezgjatjanemuaj"),
    @NamedQuery(name = "Fees.findByCmimi", query = "SELECT f FROM Fees f WHERE f.cmimi = :cmimi")})
public class Fees implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq" , sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer id;
    
    @Column(name = "Kohezgjatjanemuaj")
    private Integer kohezgjatjanemuaj;
    @Column(name = "Cmimi")
    private Integer cmimi;
    @JoinColumn(name = "PersoniID", referencedColumnName = "ID")
    @ManyToOne
    private Personi personiID;

    public Fees() {
    }

    public Fees(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKohezgjatjanemuaj() {
        return kohezgjatjanemuaj;
    }

    public void setKohezgjatjanemuaj(Integer kohezgjatjanemuaj) {
        this.kohezgjatjanemuaj = kohezgjatjanemuaj;
    }

    public Integer getCmimi() {
        return cmimi;
    }

    public void setCmimi(Integer cmimi) {
        this.cmimi = cmimi;
    }

    public Personi getPersoniID() {
        return personiID;
    }

    public void setPersoniID(Personi personiID) {
        this.personiID = personiID;
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
        if (!(object instanceof Fees)) {
            return false;
        }
        Fees other = (Fees) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + id + kohezgjatjanemuaj + cmimi;
    }
    
}
