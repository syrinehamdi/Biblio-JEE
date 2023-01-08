package controllers;

import entities.Livre;
import entities.Personne;
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

public class homeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            PrintWriter out = response.getWriter();
            EntityManagerFactory emf =  
                Persistence.createEntityManagerFactory("BiblioPU");
            EntityManager em = emf.createEntityManager();

            // Afficher tous les livres
            try {
                List<Livre> livres = em.createNamedQuery("Livre.findAll").getResultList();
                
                if(livres.size() == 0){
                    out.println("Aucun book à afficher");
                }else{
                    request.setAttribute("livres", livres);
                    request.getRequestDispatcher("home.jsp").forward(request, response);
                } 
            } catch (Exception ex){
                System.out.println(ex.getMessage());
            }
    }

}
