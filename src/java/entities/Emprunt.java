/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 21655
 */
@Entity
@Table(name = "emprunt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Emprunt.findAll", query = "SELECT e FROM Emprunt e")
    , @NamedQuery(name = "Emprunt.findByIdemp", query = "SELECT e FROM Emprunt e WHERE e.idemp = :idemp")
    , @NamedQuery(name = "Emprunt.findByDateemp", query = "SELECT e FROM Emprunt e WHERE e.dateemp = :dateemp")
    , @NamedQuery(name = "Emprunt.findByDateretour", query = "SELECT e FROM Emprunt e WHERE e.dateretour = :dateretour")})
public class Emprunt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDEMP")
    private Integer idemp;
    @Column(name = "DATEEMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateemp;
    @Column(name = "DATERETOUR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateretour;
    @JoinColumn(name = "IDRES", referencedColumnName = "IDRES")
    @ManyToOne(optional = false)
    private Reservation idres;

    public Emprunt() {
    }

    public Emprunt(Integer idemp) {
        this.idemp = idemp;
    }

    public Integer getIdemp() {
        return idemp;
    }

    public void setIdemp(Integer idemp) {
        this.idemp = idemp;
    }

    public Date getDateemp() {
        return dateemp;
    }

    public void setDateemp(Date dateemp) {
        this.dateemp = dateemp;
    }

    public Date getDateretour() {
        return dateretour;
    }

    public void setDateretour(Date dateretour) {
        this.dateretour = dateretour;
    }

    public Reservation getIdres() {
        return idres;
    }

    public void setIdres(Reservation idres) {
        this.idres = idres;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idemp != null ? idemp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emprunt)) {
            return false;
        }
        Emprunt other = (Emprunt) object;
        if ((this.idemp == null && other.idemp != null) || (this.idemp != null && !this.idemp.equals(other.idemp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Emprunt[ idemp=" + idemp + " ]";
    }
    
}
