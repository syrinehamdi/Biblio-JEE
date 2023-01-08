package controllers;

import entities.Enseignant;
import entities.Personne;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class enseignantServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
                processRequest(request, response);
                    EntityManagerFactory emf =  
                Persistence.createEntityManagerFactory("BiblioPU");
            EntityManager em = emf.createEntityManager();

            // Afficher tous les enseignants
            try {
                List<Enseignant> enseignants = em.createNamedQuery("Enseignant.findAll").getResultList();
                if(enseignants.size() == 0){
                    System.out.println("Aucun enseignant à afficher");
                }else{
                    request.setAttribute("enseignants", enseignants);
                    request.getRequestDispatcher("list-teachers.jsp").forward(request, response);
                } 
            } catch (Exception ex){

            }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EntityManagerFactory emf =  
            Persistence.createEntityManagerFactory("BiblioPU");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            //récupération des données 
            int idpers = Integer.parseInt(request.getParameter("idpers"));
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            String email = request.getParameter("email");
            String adresse = request.getParameter("adresse");
            int telephone = Integer.parseInt(request.getParameter("telephone"));
            String login = request.getParameter("login");
            String pass = request.getParameter("pass");
            String grade = request.getParameter("grade");
            String departement = request.getParameter("departement");
            System.out.println(idpers + " "+ nom +" "+ prenom +" "+ email +" "+ adresse +" "+ telephone +" "+ login +" "+ pass );
            //Creation d'objet
            Personne p = new Personne(idpers, nom, prenom, email, adresse, telephone, login, pass, new Enseignant(idpers, grade, departement)) ;
            em.persist(p);
            em.getTransaction().commit(); 
            response.sendRedirect("userServlet");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
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
