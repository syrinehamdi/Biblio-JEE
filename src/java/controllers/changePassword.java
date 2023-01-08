package controllers;

import entities.Personne;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class changePassword extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EntityManagerFactory emf =  
            Persistence.createEntityManagerFactory("BiblioPU");
        EntityManager em = emf.createEntityManager();
        
        try{
            HttpSession session = request.getSession();
            int idpers = Integer.parseInt(request.getParameter("idpers"));
            String currentPassword = request.getParameter("currentPassword");
            String newPassword = request.getParameter("newPassword");
            String confirmPassword = request.getParameter("confirmPassword");
            
            System.out.println(idpers+" "+currentPassword+""+newPassword+""+confirmPassword);
            
            Personne user = em.find(Personne.class, idpers);
            System.out.println(user);
            if(!currentPassword.equals(user.getPass())){
                request.setAttribute("errorMessage", "Incorrect current Password !");
                response.sendRedirect("profile.jsp");
                return;
            }
            
            if (!newPassword.equals(confirmPassword)){
                request.setAttribute("errorMessage", "New password and confirm password does not matched ! :/");
                response.sendRedirect("profile.jsp");
                return;
            }
            user.setPass(newPassword);
            em.getTransaction().begin();
            em.merge(user);
            em.getTransaction().commit();
            request.setAttribute("status", "success)");
            response.sendRedirect("profile.jsp");
            em.close();
            emf.close();
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
