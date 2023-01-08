package entities;

import entities.Reservation;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-12-24T00:55:46")
@StaticMetamodel(Emprunt.class)
public class Emprunt_ { 

    public static volatile SingularAttribute<Emprunt, Date> dateretour;
    public static volatile SingularAttribute<Emprunt, Reservation> idres;
    public static volatile SingularAttribute<Emprunt, Integer> idemp;
    public static volatile SingularAttribute<Emprunt, Date> dateemp;

}