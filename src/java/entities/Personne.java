/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 21655
 */
@Entity
@Table(name = "personne")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personne.findAll", query = "SELECT p FROM Personne p")
    , @NamedQuery(name = "Personne.findByIdpers", query = "SELECT p FROM Personne p WHERE p.idpers = :idpers")
    , @NamedQuery(name = "Personne.findByNom", query = "SELECT p FROM Personne p WHERE p.nom = :nom")
    , @NamedQuery(name = "Personne.findByPrenom", query = "SELECT p FROM Personne p WHERE p.prenom = :prenom")
    , @NamedQuery(name = "Personne.findByEmail", query = "SELECT p FROM Personne p WHERE p.email = :email")
    , @NamedQuery(name = "Personne.findByAdresse", query = "SELECT p FROM Personne p WHERE p.adresse = :adresse")
    , @NamedQuery(name = "Personne.findByTelephone", query = "SELECT p FROM Personne p WHERE p.telephone = :telephone")
    , @NamedQuery(name = "Personne.findByLogin", query = "SELECT p FROM Personne p WHERE p.login = :login")
    , @NamedQuery(name = "Personne.findByPass", query = "SELECT p FROM Personne p WHERE p.pass = :pass")})
public class Personne implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDPERS")
    private Integer idpers;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "PRENOM")
    private String prenom;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "ADRESSE")
    private String adresse;
    @Column(name = "TELEPHONE")
    private Integer telephone;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "PASS")
    private String pass;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpers")
    private List<Reservation> reservationList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "personne")
    private Enseignant enseignant;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "personne")
    private Etudiant etudiant;

    public Personne() {
    }

    public Personne(Integer idpers) {
        this.idpers = idpers;
    }

    public Personne(Integer idpers, String nom, String prenom, String email, String adresse, Integer telephone, String login, String pass, Enseignant enseignant) {
        this.idpers = idpers;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.telephone = telephone;
        this.login = login;
        this.pass = pass;
        this.enseignant = enseignant;
    }

    public Personne(Integer idpers, String nom, String prenom, String email, String adresse, Integer telephone, String login, String pass, Etudiant etudiant) {
        this.idpers = idpers;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.telephone = telephone;
        this.login = login;
        this.pass = pass;
        this.etudiant = etudiant;
    }

    public Personne(Integer idpers, String nom, String prenom, String email, String adresse, Integer telephone, String login, String pass) {
        this.idpers = idpers;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.telephone = telephone;
        this.login = login;
        this.pass = pass;
    }


    public Integer getIdpers() {
        return idpers;
    }

    public void setIdpers(Integer idpers) {
        this.idpers = idpers;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @XmlTransient
    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpers != null ? idpers.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personne)) {
            return false;
        }
        Personne other = (Personne) object;
        if ((this.idpers == null && other.idpers != null) || (this.idpers != null && !this.idpers.equals(other.idpers))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Personne[ idpers=" + idpers + " ]";
    }
    
}
