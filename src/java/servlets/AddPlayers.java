/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.StufutEJB;
import entities.Mazo;
import entities.Carta;
import entities.MazoCarta;
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
@WebServlet(name = "AddPlayers", urlPatterns = {"/AddPlayers"})
public class AddPlayers extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @EJB
    StufutEJB miEjb;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        Integer idmazo = Integer.parseInt(request.getParameter("idmazo"));
        Mazo m = miEjb.selectMazoByIdmazo(idmazo);

        Integer idmc = 0;

        Integer jugador1 = Integer.parseInt(request.getParameter("jugador1"));
        Carta c1 = miEjb.selectCartaById(jugador1);
        Integer jugador2 = Integer.parseInt(request.getParameter("jugador2"));
        Carta c2 = miEjb.selectCartaById(jugador2);
        Integer jugador3 = Integer.parseInt(request.getParameter("jugador3"));
        Carta c3 = miEjb.selectCartaById(jugador3);
        Integer jugador4 = Integer.parseInt(request.getParameter("jugador4"));
        Carta c4 = miEjb.selectCartaById(jugador4);
        Integer jugador5 = Integer.parseInt(request.getParameter("jugador5"));
        Carta c5 = miEjb.selectCartaById(jugador5);
        Integer jugador6 = Integer.parseInt(request.getParameter("jugador6"));
        Carta c6 = miEjb.selectCartaById(jugador6);
        Integer jugador7 = Integer.parseInt(request.getParameter("jugador7"));
        Carta c7 = miEjb.selectCartaById(jugador7);
        Integer jugador8 = Integer.parseInt(request.getParameter("jugador8"));
        Carta c8 = miEjb.selectCartaById(jugador8);
        Integer jugador9 = Integer.parseInt(request.getParameter("jugador9"));
        Carta c9 = miEjb.selectCartaById(jugador9);
        Integer jugador10 = Integer.parseInt(request.getParameter("jugador10"));
        Carta c10 = miEjb.selectCartaById(jugador10);
        Integer jugador11 = Integer.parseInt(request.getParameter("jugador11"));
        Carta c11 = miEjb.selectCartaById(jugador11);

        MazoCarta mc1 = new MazoCarta(idmc,c1, m);
        MazoCarta mc2 = new MazoCarta(idmc,c2, m);
        MazoCarta mc3 = new MazoCarta(idmc,c3, m);
        MazoCarta mc4 = new MazoCarta(idmc,c4, m);
        MazoCarta mc5 = new MazoCarta(idmc,c5, m);
        MazoCarta mc6 = new MazoCarta(idmc,c6, m);
        MazoCarta mc7 = new MazoCarta(idmc,c7, m);
        MazoCarta mc8 = new MazoCarta(idmc,c8, m);
        MazoCarta mc9 = new MazoCarta(idmc,c9, m);
        MazoCarta mc10 = new MazoCarta(idmc,c10, m);
        MazoCarta mc11 = new MazoCarta(idmc,c11, m);
        
        miEjb.insertMazoCarta(mc1);
        miEjb.insertMazoCarta(mc2);
        miEjb.insertMazoCarta(mc3);
        miEjb.insertMazoCarta(mc4);
        miEjb.insertMazoCarta(mc5);
        miEjb.insertMazoCarta(mc6);
        miEjb.insertMazoCarta(mc7);
        miEjb.insertMazoCarta(mc8);
        miEjb.insertMazoCarta(mc9);
        miEjb.insertMazoCarta(mc10);
        miEjb.insertMazoCarta(mc11);
        
        
        request.getRequestDispatcher("index.jsp").forward(request, response);
       
        

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
