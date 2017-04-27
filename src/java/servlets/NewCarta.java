/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.StufutEJB;
import entities.Carta;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 41013277E
 */
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Nueva Carta</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("entro");
            // Recogemos los datos del formulario
            Integer idcarta = 0;
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
                out.println("Carta dada de alta.");
            } else {
                out.println("Ya existe una Carta con ese nombre.");
            }
            out.println("</body>");
            out.println("</html>");
            out.println("</body>");
            out.println("</html>");

        }
    }

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
