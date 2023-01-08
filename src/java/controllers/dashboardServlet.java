package controllers;

import entities.Emprunt;
import entities.Enseignant;
import entities.Etudiant;
import entities.Livre;
import entities.Personne;
import entities.Reservation;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class dashboardServlet extends HttpServlet {
    EntityManagerFactory emf =  
    Persistence.createEntityManagerFactory("BiblioPU");
        EntityManager em = emf.createEntityManager();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try {
                List<Emprunt> emprunts = em.createNamedQuery("Emprunt.findAll").getResultList();
                List<Personne> personnes = em.createNamedQuery("Personne.findAll").getResultList();
                List<Livre> livres = em.createNamedQuery("Livre.findAll").getResultList();
                List<Enseignant> enseignants = em.createNamedQuery("Enseignant.findAll").getResultList();
                List<Etudiant> etudiants = em.createNamedQuery("Etudiant.findAll").getResultList();
                
                int i =0;
                for (Personne pers : personnes){
                    if(pers.getReservationList()!=null){
                        i = i+1;
                    }
                }
                
                Integer adminsNbr = (personnes.size()-(etudiants.size()+enseignants.size())) ;
                request.setAttribute("etudiants", etudiants);
                request.setAttribute("enseignants", enseignants);
                request.setAttribute("personnes", personnes);
                request.setAttribute("livres", livres);
                request.setAttribute("emprunts", emprunts);
                request.setAttribute("actifs", i);
                request.setAttribute("admins", adminsNbr);
                request.getRequestDispatcher("dashboard.jsp").forward(request, response);
            } catch (Exception ex){
                System.out.println(ex.getMessage());
            }
    }
}
