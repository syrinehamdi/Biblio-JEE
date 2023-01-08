package controllers;

import entities.Personne;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class adminServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            PrintWriter out = response.getWriter();
            EntityManagerFactory emf =  
                Persistence.createEntityManagerFactory("BiblioPU");
            EntityManager em = emf.createEntityManager();
            List<Personne> admins = new ArrayList<Personne>();
            // Afficher tous les enseignants
            try {
                List<Personne> personnes = em.createNamedQuery("Personne.findAll").getResultList();
                for (Personne pers : personnes){
                    if ((pers.getEnseignant() == null) && (pers.getEtudiant() == null)){
                        admins.add(pers);
                        out.println(admins);
                    }
                }
                if(admins.size() == 0){
                    System.out.println("Aucun admin à afficher");
                }else{
                    request.setAttribute("admins", admins);
                    request.getRequestDispatcher("list-admins.jsp").forward(request, response);
                } 
            } catch (Exception ex){

            }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EntityManagerFactory emf =  
            Persistence.createEntityManagerFactory("BiblioPU");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            //récupération des données 
            int idpers = Integer.parseInt(request.getParameter("idpers"));
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            String email = request.getParameter("email");
            String adresse = request.getParameter("adresse");
            int telephone = Integer.parseInt(request.getParameter("telephone"));
            String login = request.getParameter("login");
            String pass = request.getParameter("pass");
            //Creation d'objet
            Personne p = new Personne(idpers, nom, prenom, email, adresse, telephone, login, pass) ;
            em.persist(p);
            em.getTransaction().commit();
            response.sendRedirect("userServlet");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}
