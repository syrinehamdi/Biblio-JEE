package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 21655
 */
@Entity
@Table(name = "reservation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservation.findAll", query = "SELECT r FROM Reservation r")
    , @NamedQuery(name = "Reservation.findByIdres", query = "SELECT r FROM Reservation r WHERE r.idres = :idres")
    , @NamedQuery(name = "Reservation.findByDateres", query = "SELECT r FROM Reservation r WHERE r.dateres = :dateres")})
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDRES")
    private Integer idres;
    @Column(name = "DATERES")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateres;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idres")
    private List<Emprunt> empruntList;
    @JoinColumn(name = "ISBN", referencedColumnName = "ISBN")
    @ManyToOne(optional = false)
    private Livre isbn;
    @JoinColumn(name = "IDPERS", referencedColumnName = "IDPERS")
    @ManyToOne(optional = false)
    private Personne idpers;

    public Reservation() {
    }

    public Reservation(Integer idres) {
        this.idres = idres;
    }

    public Integer getIdres() {
        return idres;
    }

    public void setIdres(Integer idres) {
        this.idres = idres;
    }

    public Date getDateres() {
        return dateres;
    }

    public void setDateres(Date dateres) {
        this.dateres = dateres;
    }

    @XmlTransient
    public List<Emprunt> getEmpruntList() {
        return empruntList;
    }

    public void setEmpruntList(List<Emprunt> empruntList) {
        this.empruntList = empruntList;
    }

    public Livre getIsbn() {
        return isbn;
    }

    public void setIsbn(Livre isbn) {
        this.isbn = isbn;
    }

    public Personne getIdpers() {
        return idpers;
    }

    public void setIdpers(Personne idpers) {
        this.idpers = idpers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idres != null ? idres.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.idres == null && other.idres != null) || (this.idres != null && !this.idres.equals(other.idres))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Reservation[ idres=" + idres + " ]";
    }
    
}
