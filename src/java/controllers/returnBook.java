package controllers;

import entities.Emprunt;
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

public class returnBook extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            PrintWriter out = response.getWriter();
            EntityManagerFactory emf =  
                Persistence.createEntityManagerFactory("BiblioPU");
            EntityManager em = emf.createEntityManager();
            try
            {
                em.getTransaction().begin();
                Query q = em.createNamedQuery("Emprunt.findByIdemp").setParameter("idemp", Integer.parseInt(request.getParameter("idemp")));
                Emprunt emp = (Emprunt)q.getSingleResult();
                em.remove(emp);
                em.getTransaction().commit();
                request.getRequestDispatcher("/borrowingServlet").forward(request, response);
            }catch (Exception ex) {
                out.println(ex.getMessage());
            }    }
}
