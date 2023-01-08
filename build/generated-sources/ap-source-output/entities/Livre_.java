package entities;

import entities.Reservation;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-12-24T00:55:46")
@StaticMetamodel(Livre.class)
public class Livre_ { 

    public static volatile ListAttribute<Livre, Reservation> reservationList;
    public static volatile SingularAttribute<Livre, String> img;
    public static volatile SingularAttribute<Livre, String> auteurs;
    public static volatile SingularAttribute<Livre, String> titre;
    public static volatile SingularAttribute<Livre, String> isbn;

}