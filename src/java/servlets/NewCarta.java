/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.StufutEJB;
import entities.Carta;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import static servlets.NewUser.STATUS_OK;

@WebServlet(name = "NewCarta", urlPatterns = {"/NewCarta"})
public class NewCarta extends HttpServlet {

    @EJB
    StufutEJB miEjb;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
//        String contentType = request.getContentType();
//         if ((contentType.contains("multipart/form-data"))) {
//             DiskFileItemFactory factory = new DiskFileItemFactory();
//         }
       
        response.setContentType("text/html;charset=UTF-8");

            // Recogemos los datos del formulario
            Integer idcarta = 0;
//            String foto =  request.getParameter("foto");
            String nombre = request.getParameter("nombre");
            Integer media = Integer.parseInt(request.getParameter("media"));
            String pos = request.getParameter("posicion");
            String equipo = request.getParameter("equipo");
            String pais = request.getParameter("pais");
            Integer velocidad = Integer.parseInt(request.getParameter("velocidad"));
            Integer disparo = Integer.parseInt(request.getParameter("disparo"));
            Integer pase = Integer.parseInt(request.getParameter("pase"));
            Integer regate = Integer.parseInt(request.getParameter("regate"));
            Integer defensa = Integer.parseInt(request.getParameter("defensa"));
            Integer fisico = Integer.parseInt(request.getParameter("fisico"));
            String tipo = request.getParameter("tipo");
            Integer like = 0;
            Integer dislike = 0;
            
            
           Carta c = new Carta(idcarta,nombre,media,pos,equipo,pais,velocidad,disparo,pase,regate,defensa,fisico,tipo,like,dislike);

            if (miEjb.insertCarta(c)) {
                request.getRequestDispatcher("index.jsp").forward(request, response);
            } else {
               
            }

        }
    
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        int maxFileSize = 1000 * 1024;
//        int maxMemSize = 1000 * 1024;
//        String filePath = "";
//
////        String contentType = request.getContentType();
////         if ((contentType.contains("multipart/form-data"))) {
////             DiskFileItemFactory factory = new DiskFileItemFactory();
////         }
//        String contentType = request.getContentType();
//        response.setContentType("multipart/form-data");
//        if ((contentType.contains("multipart/form-data"))) {
//            for (Part p : request.getParts()) {
//                if ("foto".equals(p.getName()))   {
//                    DiskFileItemFactory factory = new DiskFileItemFactory();
//                    factory.setSizeThreshold(maxMemSize);
//                    factory.setRepository(new File("."));
//                    ServletFileUpload upload = new ServletFileUpload(factory);
//                    upload.setSizeMax(maxFileSize);
//                    String path = getServletContext().getRealPath("") + File.separator + "files";
//                    File uploadDir = new File(path);
//                    if (!uploadDir.exists()) {
//                        uploadDir.mkdir();
//                    }
//
//                    try {
//                        List<FileItem> formItems = upload.parseRequest(request);
//                        if (formItems != null && formItems.size() > 0) {
//                            for (FileItem item : formItems) {
//                                if (!item.isFormField()) {
//                                    String fileName = new File(item.getName()).getName();
//                                    filePath = path + File.separator + fileName;
//                                    File storeFile = new File(filePath);
//
//                                    // guardamos el fichero en el disco
//                                    item.write(storeFile);
//                                    request.setAttribute("status", STATUS_OK);
//                                }
//
//                            }
//                        }
//                    } catch (FileUploadException ex) {
//                        Logger.getLogger(NewCarta.class.getName()).log(Level.SEVERE, null, ex);
//                    } catch (Exception ex) {
//                        Logger.getLogger(NewCarta.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                } else {
//                    
////response.setContentType("text/html;charset=UTF-8");
//                    // Recogemos los datos del formulario
//                    Integer idcarta = 0;
////                String foto = request.getParameter("foto");
//                    String nombre = request.getParameter("nombre");
//                    Integer media = Integer.parseInt(request.getParameter("media"));
//                    String pos = request.getParameter("posicion");
//                    String equipo = request.getParameter("equipo");
//                    String pais = request.getParameter("pais");
//                    Integer velocidad = Integer.parseInt(request.getParameter("velocidad"));
//                    Integer disparo = Integer.parseInt(request.getParameter("disparo"));
//                    Integer pase = Integer.parseInt(request.getParameter("pase"));
//                    Integer regate = Integer.parseInt(request.getParameter("regate"));
//                    Integer defensa = Integer.parseInt(request.getParameter("defensa"));
//                    Integer fisico = Integer.parseInt(request.getParameter("fisico"));
//                    String tipo = request.getParameter("tipo");
//                    Integer like = 0;
//                    Integer dislike = 0;
//
//                    Carta c = new Carta(idcarta, nombre, media, pos, equipo, pais, velocidad, disparo, pase, regate, defensa, fisico, tipo, like, dislike, filePath);
//
//                    if (miEjb.insertCarta(c)) {
//
//                    } else {
//
//                    }
//                }
//
//            }
////                request.getRequestDispatcher("/final.jsp").forward(request, response);
//
//        }
//
//    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
