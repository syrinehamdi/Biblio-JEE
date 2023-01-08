 package controllers;

import entities.Livre;
import java.io.FileOutputStream;
import javax.persistence.EntityManager;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class bookServlet extends HttpServlet {
        EntityManagerFactory emf =  
        Persistence.createEntityManagerFactory("BiblioPU");
            EntityManager em = emf.createEntityManager();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            PrintWriter out = response.getWriter();
            // Afficher tous les livres
            try {
                List<Livre> livres = em.createNamedQuery("Livre.findAll").getResultList();
                if(livres.size() == 0){
                    out.println("Aucun book à afficher");
                }else{
                    request.setAttribute("livres", livres);
                    request.getRequestDispatcher("list-books.jsp").forward(request, response);
                } 
            } catch (Exception ex){

            }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               processRequest(request, response);
            System.out.println("Done");
            //Récupération de données
            String isbn = request.getParameter("isbn");
            String titre = request.getParameter("titre");
            String auteurs = request.getParameter("auteurs");
            Part file = request.getPart("img");
            String img = file.getSubmittedFileName(); //Selected file name
            
            String path = "C:/Users/21655/Desktop/Biblio/web/img/"+img;//Path where we should to upload image
            //Uploading file into folder
            try{
                FileOutputStream fos = new FileOutputStream(path);
                InputStream is = file.getInputStream();
                
                byte[] data = new byte[is.available()];
                is.read(data);
                fos.write(data);
                fos.close();
                System.out.println("File Uploaded !!");
            }catch(IOException e){
                e.printStackTrace();
            }
            //Insérer un livre
            try {
                em.getTransaction().begin();
                //Creation d'objet
                Livre l = new Livre(isbn,titre,auteurs,img) ;
                em.persist(l);
                em.getTransaction().commit(); 
                response.sendRedirect("bookServlet");
            } catch (Exception ex){
                System.out.println(ex.getMessage());
            }

    }
}
