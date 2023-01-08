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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 21655
 */
@Entity
@Table(name = "livre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Livre.findAll", query = "SELECT l FROM Livre l")
    , @NamedQuery(name = "Livre.findByIsbn", query = "SELECT l FROM Livre l WHERE l.isbn = :isbn")
    , @NamedQuery(name = "Livre.deleteByIsbn", query = "DELETE FROM Livre l WHERE l.isbn = :isbn")
    , @NamedQuery(name = "Livre.findByTitre", query = "SELECT l FROM Livre l WHERE l.titre = :titre")
    , @NamedQuery(name = "Livre.findByAuteurs", query = "SELECT l FROM Livre l WHERE l.auteurs = :auteurs")})
public class Livre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ISBN")
    private String isbn;
    @Column(name = "TITRE")
    private String titre;
    @Column(name = "AUTEURS")
    private String auteurs;
    @Basic(optional = false)
    @Lob
    @Column(name = "IMG")
    private String img;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "isbn")
    private List<Reservation> reservationList;

    public Livre() {
    }

    public Livre(String isbn) {
        this.isbn = isbn;
    }

    public Livre(String isbn, String img) {
        this.isbn = isbn;
        this.img = img;
    }

    public Livre(String isbn, String titre, String auteurs, String img) {
        this.isbn = isbn;
        this.titre = titre;
        this.auteurs = auteurs;
        this.img = img;
    }



    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(String auteurs) {
        this.auteurs = auteurs;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @XmlTransient
    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livre)) {
            return false;
        }
        Livre other = (Livre) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Livre[ isbn=" + isbn + " ]";
    }
    
}
