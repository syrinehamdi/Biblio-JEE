package controllers;

import entities.Livre;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class updateBook extends HttpServlet {
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
            String isbn = request.getParameter("isbn");
            em.getTransaction().begin();
                
            Query q = em.createNamedQuery("Livre.findByIsbn").setParameter("isbn", isbn);
            Livre l = (Livre)q.getSingleResult();
            System.out.println(l);
            request.setAttribute("book", l);
            em.close();
            em.getTransaction().commit();
            request.getRequestDispatcher("edit-book.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
                //Récupération de données
                String isbn = request.getParameter("isbn");
                Part file = request.getPart("img");
                String img = file.getSubmittedFileName(); //Selected file name
                
                em.getTransaction().begin();
                Livre l = em.find(Livre.class, isbn);

                if (!img.equals(l.getImg())){
                    //Uploading file into folder
                    try{
                        //Path where we should to upload image
                        String path = "C:/Users/21655/Desktop/Biblio/web/img/"+img;
                        FileOutputStream fos = new FileOutputStream(path);
                        InputStream is = file.getInputStream();

                        byte[] data = new byte[is.available()];
                        is.read(data);
                        fos.write(data);
                        fos.close();
                        l.setImg(img);
                        //System.out.println("File Uploaded !!");
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                }
                //Mettre à jour un livre
                try {                    
                    //Creation d'objet
                    l.setAuteurs(request.getParameter("auteurs"));
                    l.setTitre(request.getParameter("titre"));
                    
                    em.merge(l);
                    em.getTransaction().commit();
                    
                    response.sendRedirect("bookServlet");

                } catch (Exception ex){
                    System.out.println(ex.getMessage());
                }finally{
                    em.close();
                    emf.close();
                }
    }
}
