package controllers;

import entities.Personne;
import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class deleteUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
            PrintWriter out = response.getWriter();
            EntityManagerFactory emf =  
                Persistence.createEntityManagerFactory("BiblioPU");
            EntityManager em = emf.createEntityManager();
            try
            {
                int idpers= Integer.parseInt(request.getParameter("idpers")); 
                out.println(idpers);
                em.getTransaction().begin();
                Query q = em.createNamedQuery("Personne.findByIdpers").setParameter("idpers", idpers);
                Personne p = (Personne)q.getSingleResult();
                out.println(p);
                em.remove(p);
                em.getTransaction().commit();
                request.getRequestDispatcher("/userServlet").forward(request, response);
            }catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
    }
}
