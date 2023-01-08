package controllers;

import entities.Personne;
import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class updateProfile extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EntityManagerFactory emf =  
            Persistence.createEntityManagerFactory("BiblioPU");
        EntityManager em = emf.createEntityManager();
        try{    
            int idpers = Integer.parseInt(request.getParameter("idpers"));
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            String email = request.getParameter("email");
            String adresse = request.getParameter("adresse");
            int telephone = Integer.parseInt(request.getParameter("telephone"));
            String login = request.getParameter("login");
            
            Personne user = em.find(Personne.class, idpers);
            System.out.println(user);
            user.setAdresse(adresse);
            user.setEmail(email);
            user.setLogin(login);
            user.setNom(nom);
            user.setPrenom(prenom);
            user.setTelephone(telephone);
            
            em.getTransaction().begin();
            em.merge(user);
            em.getTransaction().commit();
            request.setAttribute("status", "success)");
            response.sendRedirect("profile.jsp");
            em.close();
            emf.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
