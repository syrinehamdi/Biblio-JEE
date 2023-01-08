package entities;

import entities.Personne;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-12-24T00:55:46")
@StaticMetamodel(Enseignant.class)
public class Enseignant_ { 

    public static volatile SingularAttribute<Enseignant, String> departement;
    public static volatile SingularAttribute<Enseignant, Personne> personne;
    public static volatile SingularAttribute<Enseignant, String> grade;
    public static volatile SingularAttribute<Enseignant, Integer> idens;

}