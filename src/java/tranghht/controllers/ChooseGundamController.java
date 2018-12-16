/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranghht.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tranghht.tbl_Gundam.tbl_GundamDAO;
import tranghht.tbl_User.tbl_UserDAO;

/**
 *
 * @author VS9 X64Bit
 */
@WebServlet(name = "ChooseGundamController", urlPatterns = {"/ChooseGundamController"})
public class ChooseGundamController extends HttpServlet {
    private static final String PILOT = "pilot.jsp";
    private static final String ERR = "err.jsp";

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
            String url = ERR;
            /* TODO output your page here. You may use following sample code. */
            try {
                String txtSearch = request.getParameter("txtLastSearch");
                String pilotid = request.getParameter("txtPilotId");
                String gundamid = request.getParameter("choosegundamList");
                tbl_GundamDAO gdao = new tbl_GundamDAO();
                if (gdao.updateGundam(gundamid)) {
                    tbl_UserDAO udao = new tbl_UserDAO();
                    if (udao.updateUserGundam(pilotid, gundamid)) {
                        url = "MainController?act=Search&txtSearchPilot=" + txtSearch;  
                        gdao.infoListGundam(); 
                        udao.infoListPilot();
                        HttpSession session = request.getSession();
                        session.setAttribute("GUNDAMLIST", gdao.getListGundam());
                        session.setAttribute("PILOTLIST", udao.getListPilot());
                    } else {
                        request.setAttribute("ERROR", "Choose Gundam Failed");
                        request.setAttribute("LINKBACK", PILOT);
                    }
                } else {
                    request.setAttribute("ERROR", "Choose Gundam Failed");
                    request.setAttribute("LINKBACK", PILOT);
                }
            } catch (Exception e) {
                log("ERROR at ChooseGundamController: " + e.getMessage());
                request.setAttribute("ERROR", "Choose Gundam Failed");
                request.setAttribute("LINKBACK", PILOT);
            } finally {
                if (url.equals(ERR)) {
                    request.getRequestDispatcher(url).forward(request, response);
                } else {
                    response.sendRedirect(url);
                }
            }
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
