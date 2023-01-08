package controllers;

import entities.Livre;
import entities.Personne;
import entities.Reservation;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class reserveBook extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
            EntityManagerFactory emf =  
                Persistence.createEntityManagerFactory("BiblioPU");
            EntityManager em = emf.createEntityManager();
            PrintWriter out = response.getWriter();
            try
            {
                em.getTransaction().begin();
                Personne p = em.find(Personne.class, Integer.parseInt(request.getParameter("idpers")));
                Livre l = em.find(Livre.class, request.getParameter("isbn"));
                //Creation Date
                Calendar c = Calendar.getInstance();
                //Creation d'objet
                Reservation res = new Reservation() ;
                res.setDateres(c.getTime());
                res.setIdpers(p);
                res.setIsbn(l);
                em.persist(res);
                em.getTransaction().commit(); 
                response.sendRedirect("homeServlet");

            }catch (Exception ex) {
                out.println(ex.getMessage());
            }
    }

}
