package controllers;

import entities.Livre;
import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class searchBook extends HttpServlet {
    EntityManagerFactory emf =  
        Persistence.createEntityManagerFactory("BiblioPU");
    EntityManager em = emf.createEntityManager();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            String searchTerm = request.getParameter("searchTerm");
            Query query = em.createQuery("SELECT l FROM Livre l WHERE l.titre LIKE :searchTerm OR l.auteurs LIKE :searchTerm");
            query.setParameter("searchTerm", "%" + searchTerm + "%");
            List<Livre> books = query.getResultList();

            request.setAttribute("books", books);
            request.getRequestDispatcher("home.jsp").forward(request, response);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
