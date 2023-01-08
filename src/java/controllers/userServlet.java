package controllers;

import entities.Personne;
import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "userServlet", urlPatterns = {"/userServlet"})
public class userServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            EntityManagerFactory emf =  
                Persistence.createEntityManagerFactory("BiblioPU");
            EntityManager em = emf.createEntityManager();

            // Afficher tous les personnes
            try {
                List<Personne> personnes = em.createNamedQuery("Personne.findAll").getResultList();
                if(personnes.size() == 0){
                    System.out.println("Aucun enseignant à afficher");
                }else{
                    request.setAttribute("personnes", personnes);
                    request.getRequestDispatcher("list-users.jsp").forward(request, response);
                } 
            } catch (Exception ex){

            }
    }

}
