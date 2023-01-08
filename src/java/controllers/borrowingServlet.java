package controllers;

import entities.Emprunt;
import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class borrowingServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            EntityManagerFactory emf =  
                Persistence.createEntityManagerFactory("BiblioPU");
            EntityManager em = emf.createEntityManager();
            processRequest(request, response);
            try {
                List<Emprunt> emprunts = em.createNamedQuery("Emprunt.findAll").getResultList();
                if(emprunts.size() == 0){
                    System.out.println("Aucun book à afficher");
                }else{
                    //System.out.println();
                    request.setAttribute("emprunts", emprunts);
                    request.getRequestDispatcher("emprunts.jsp").forward(request, response);
                } 
            } catch (Exception ex){
                System.out.println(ex.getMessage());
            }
    }

}
