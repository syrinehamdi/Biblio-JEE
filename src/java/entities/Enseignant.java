/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 21655
 */
@Entity
@Table(name = "enseignant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enseignant.findAll", query = "SELECT e FROM Enseignant e")
    , @NamedQuery(name = "Enseignant.findByIdens", query = "SELECT e FROM Enseignant e WHERE e.idens = :idens")
    , @NamedQuery(name = "Enseignant.findByGrade", query = "SELECT e FROM Enseignant e WHERE e.grade = :grade")
    , @NamedQuery(name = "Enseignant.findByDepartement", query = "SELECT e FROM Enseignant e WHERE e.departement = :departement")})
public class Enseignant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDENS")
    private Integer idens;
    @Column(name = "GRADE")
    private String grade;
    @Column(name = "DEPARTEMENT")
    private String departement;
    @JoinColumn(name = "IDENS", referencedColumnName = "IDPERS", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Personne personne;

    public Enseignant() {
    }

    public Enseignant(Integer idens, String grade, String departement, Personne personne) {
        this.idens = idens;
        this.grade = grade;
        this.departement = departement;
        this.personne = personne;
    }

    public Enseignant(Integer idens, String grade, String departement) {
        this.idens = idens;
        this.grade = grade;
        this.departement = departement;
    }

    public Enseignant(Integer idens) {
        this.idens = idens;
    }


    public Integer getIdens() {
        return idens;
    }

    public void setIdens(Integer idens) {
        this.idens = idens;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idens != null ? idens.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enseignant)) {
            return false;
        }
        Enseignant other = (Enseignant) object;
        if ((this.idens == null && other.idens != null) || (this.idens != null && !this.idens.equals(other.idens))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Enseignant[ idens=" + idens + " ]";
    }
    
}
