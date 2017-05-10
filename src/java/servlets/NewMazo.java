/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.StufutEJB;
import entities.Formacion;
import entities.Mazo;
import entities.StufutUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static servlets.NewUser.STATUS_ERROR;
import static servlets.NewUser.STATUS_OK;

/**
 *
 * @author Macasoftjr
 */
@WebServlet(name = "NewMazo", urlPatterns = {"/NewMazo"})
public class NewMazo extends HttpServlet {

    public static final String STATUS_OK = "Mazo creado";
    public static final String STATUS_ERROR = "Error";

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
            String nombremazo = request.getParameter("nombremazo");
            String usu = request.getParameter("usu");
            StufutUsuario stusu = miEjb.selectStufutUsuarioByName(usu);
            
            //FALTA FORMACION
            Mazo m = new Mazo(0, nombremazo, 0,stusu);
            if (miEjb.insertMazo(m)) {
        
             
                
                request.setAttribute("statusmazo", STATUS_OK);
//                RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
            } else {
                request.setAttribute("statusmazo", STATUS_ERROR);
            }
            request.getRequestDispatcher("index.jsp").forward(request, response);
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
