package controllers;

import entities.Reservation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cancelReserve extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
            PrintWriter out = response.getWriter();
            EntityManagerFactory emf =  
                Persistence.createEntityManagerFactory("BiblioPU");
            EntityManager em = emf.createEntityManager();
            try
            {
                em.getTransaction().begin();
                Reservation res = em.find(Reservation.class, Integer.parseInt(request.getParameter("idres")));
                out.println(res);
                em.remove(res);
                em.getTransaction().commit();
                request.getRequestDispatcher("/reservationServlet").forward(request, response);
            }catch (Exception ex) {
                out.println(ex.getMessage());
            }
    }

}
