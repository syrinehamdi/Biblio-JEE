package entities;

import entities.Enseignant;
import entities.Etudiant;
import entities.Reservation;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-12-24T00:55:46")
@StaticMetamodel(Personne.class)
public class Personne_ { 

    public static volatile ListAttribute<Personne, Reservation> reservationList;
    public static volatile SingularAttribute<Personne, Integer> idpers;
    public static volatile SingularAttribute<Personne, String> pass;
    public static volatile SingularAttribute<Personne, String> adresse;
    public static volatile SingularAttribute<Personne, Integer> telephone;
    public static volatile SingularAttribute<Personne, Enseignant> enseignant;
    public static volatile SingularAttribute<Personne, String> login;
    public static volatile SingularAttribute<Personne, String> nom;
    public static volatile SingularAttribute<Personne, String> prenom;
    public static volatile SingularAttribute<Personne, String> email;
    public static volatile SingularAttribute<Personne, Etudiant> etudiant;

}