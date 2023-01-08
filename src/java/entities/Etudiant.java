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
@Table(name = "etudiant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etudiant.findAll", query = "SELECT e FROM Etudiant e")
    , @NamedQuery(name = "Etudiant.findByIdetud", query = "SELECT e FROM Etudiant e WHERE e.idetud = :idetud")
    , @NamedQuery(name = "Etudiant.findByClasse", query = "SELECT e FROM Etudiant e WHERE e.classe = :classe")})
public class Etudiant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDETUD")
    private Integer idetud;
    @Column(name = "CLASSE")
    private String classe;
    @JoinColumn(name = "IDETUD", referencedColumnName = "IDPERS", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Personne personne;

    public Etudiant() {
    }

    public Etudiant(Integer idetud) {
        this.idetud = idetud;
    }

    public Etudiant(Integer idetud, String classe) {
        this.idetud = idetud;
        this.classe = classe;
    }

    public Integer getIdetud() {
        return idetud;
    }

    public void setIdetud(Integer idetud) {
        this.idetud = idetud;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
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
        hash += (idetud != null ? idetud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etudiant)) {
            return false;
        }
        Etudiant other = (Etudiant) object;
        if ((this.idetud == null && other.idetud != null) || (this.idetud != null && !this.idetud.equals(other.idetud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Etudiant[ idetud=" + idetud + " ]";
    }
    
}
