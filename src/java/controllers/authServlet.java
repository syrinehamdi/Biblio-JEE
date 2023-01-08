/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Personne;
import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 21655
 */
public class authServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        EntityManagerFactory emf =  
                Persistence.createEntityManagerFactory("BiblioPU");
        EntityManager em = emf.createEntityManager();
       // HttpSession session = request.getSession();
        try {
            //récupération des données 
            String login = request.getParameter("login");
            String pass = request.getParameter("pass");
            System.out.println(login +" "+ pass);
            Query q = em.createNamedQuery("Personne.findByLogin").setParameter("login", login);
            Personne p = (Personne)q.getSingleResult();
            if((p != null) && (p.getPass().equals(pass)) && ((p.getEnseignant()!= null ) || (p.getEtudiant()!= null))){
                request.getSession().setAttribute("person", p);
                response.sendRedirect("homeServlet");
            } else if ((p != null) && (p.getPass().equals(pass)) && (p.getEnseignant()== null ) && (p.getEtudiant()== null)){
                request.getSession().setAttribute("admin", p);
                response.sendRedirect("dashboardServlet");
            }
        } catch (NoResultException e){
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Wrong login or password !!");
        } finally {
            em.close();
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
