
package controllers;

import entities.Etudiant;
import entities.Personne;
import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 21655
 */
public class etudiantServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            EntityManagerFactory emf =  
                Persistence.createEntityManagerFactory("BiblioPU");
            EntityManager em = emf.createEntityManager();

            // Afficher tous les etudiants
            try {
                List<Etudiant> etudiants = em.createNamedQuery("Etudiant.findAll").getResultList();
                if(etudiants.size() == 0){
                    System.out.println("Aucun etudiant à afficher");
                }else{
                    request.setAttribute("etudiants", etudiants);
                    request.getRequestDispatcher("list-students.jsp").forward(request, response);
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
            String classe = request.getParameter("classe");
            //Creation d'objet
            Personne p = new Personne(idpers, nom, prenom, email, adresse, telephone, login, pass, new Etudiant(idpers, classe)) ;
            em.persist(p);
            em.getTransaction().commit();
            request.setAttribute("etudiant", p);
            response.sendRedirect("userServlet");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}
