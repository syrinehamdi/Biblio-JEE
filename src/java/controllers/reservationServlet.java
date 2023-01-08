package controllers;

import entities.Emprunt;
import entities.Reservation;
import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class reservationServlet extends HttpServlet {
        EntityManagerFactory emf =  
        Persistence.createEntityManagerFactory("BiblioPU");
            EntityManager em = emf.createEntityManager();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
                try {
                List<Reservation> reservations = em.createNamedQuery("Reservation.findAll").getResultList();
                if(reservations.size() == 0){
                    System.out.println("Aucun book à afficher");
                }else{
                    /*for (Reservation res: reservations){
                        for (Emprunt emp :res.getEmpruntList()){
                            if (emp.getIdres().getIdres()== res.getIdres()){
                                request.setAttribute("msg", "Borrowing");
                            }else{
                                request.setAttribute("msg", "Not yet ! :)");
                            }
                        }
                    }*/
                    request.setAttribute("reservations", reservations);
                    request.getRequestDispatcher("reservation.jsp").forward(request, response);
                } 
            } catch (Exception ex){

            }

    }
}
