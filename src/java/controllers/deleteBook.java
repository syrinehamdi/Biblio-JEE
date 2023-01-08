package controllers;

import entities.Livre;
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
public class deleteBook extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            PrintWriter out = response.getWriter();
            EntityManagerFactory emf =  
                Persistence.createEntityManagerFactory("BiblioPU");
            EntityManager em = emf.createEntityManager();
            try
            {
                String isbn= request.getParameter("isbn"); 
                out.println(isbn);
                em.getTransaction().begin();
                Query q = em.createNamedQuery("Livre.findByIsbn").setParameter("isbn", isbn);
                Livre l = (Livre)q.getSingleResult();
                out.println(l);
                em.remove(l);
                em.getTransaction().commit();
                request.getRequestDispatcher("/bookServlet").forward(request, response);
            }catch (Exception ex) {
                out.println(ex.getMessage());
            }

    }
}
