package controllers;

import entities.Emprunt;
import entities.Reservation;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class borrowBook extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            EntityManagerFactory emf =  
                Persistence.createEntityManagerFactory("BiblioPU");
            EntityManager em = emf.createEntityManager();
            PrintWriter out = response.getWriter();
            try
            {
                em.getTransaction().begin();
                Reservation res = em.find(Reservation.class, Integer.parseInt(request.getParameter("idres")));
                //Creation Date
                Calendar c = Calendar.getInstance();
                Date date = new Date();
                Date retour = new Date(date.getTime()+(1000*60*60*24*7));
                //Creation d'objet
                Emprunt emp = new Emprunt() ;
                emp.setDateemp(c.getTime());
                emp.setDateretour(retour);
                emp.setIdres(res);
                em.persist(emp);
                em.getTransaction().commit(); 
                response.sendRedirect("borrowingServlet");

            }catch (Exception ex) {
                out.println(ex.getMessage());
            }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
