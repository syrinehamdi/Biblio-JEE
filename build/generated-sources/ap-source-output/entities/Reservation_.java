package entities;

import entities.Emprunt;
import entities.Livre;
import entities.Personne;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-12-24T00:55:46")
@StaticMetamodel(Reservation.class)
public class Reservation_ { 

    public static volatile SingularAttribute<Reservation, Integer> idres;
    public static volatile SingularAttribute<Reservation, Personne> idpers;
    public static volatile ListAttribute<Reservation, Emprunt> empruntList;
    public static volatile SingularAttribute<Reservation, Date> dateres;
    public static volatile SingularAttribute<Reservation, Livre> isbn;

}