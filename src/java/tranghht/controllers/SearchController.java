/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranghht.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tranghht.tbl_Gundam.tbl_GundamDAO;
import tranghht.tbl_Gundam.tbl_GundamDTO;
import tranghht.tbl_User.tbl_UserDAO;
import tranghht.tbl_User.tbl_UserDTO;
import tranghht.tbl_Weapon.tbl_WeaponDAO;
import tranghht.tbl_Weapon.tbl_WeaponDTO;

/**
 *
 * @author VS9 X64Bit
 */
@WebServlet(name = "SearchController", urlPatterns = {"/SearchController"})
public class SearchController extends HttpServlet {

    private static final String ERR = "err.jsp";
    private static final String LEADER = "leader.jsp";
    private static final String GUNDAM = "gundamManager.jsp";
    private static final String WEAPON = "weaponManager.jsp";
    private static final String PILOT = "pilotManager.jsp";

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
            String url = ERR;
            try {
                String searchGundamName = request.getParameter("txtSearchGundam");
                if (searchGundamName != null) {
                    tbl_GundamDAO bdao = new tbl_GundamDAO();
                    bdao.findName(searchGundamName);
                    List<tbl_GundamDTO> listGundam = bdao.getListsearchName();
                    url = GUNDAM;
                    request.setAttribute("listSearch", listGundam);
                    request.setAttribute("txtSearchGundam", searchGundamName);
                }

                String searchWeapon = request.getParameter("txtSearchWeapon");
                if (searchWeapon != null) {
                    tbl_WeaponDAO wdao = new tbl_WeaponDAO();
                    wdao.findName(searchWeapon);
                    List<tbl_WeaponDTO> listWeapon = wdao.getListsearchName();
                    System.out.println("da search");
                    url = WEAPON;
                    request.setAttribute("listSearch", listWeapon);
                    request.setAttribute("txtSearchWeapon", searchWeapon);
                }

                String searchPilot = request.getParameter("txtSearchPilot");
                if (searchPilot != null) {
                    tbl_UserDAO udao = new tbl_UserDAO();
                    udao.findName(searchPilot);
                    List<tbl_UserDTO> listPilot = udao.getListsearchName();
                    System.out.println("da search");
                    url = PILOT;
                    request.setAttribute("listSearch", listPilot);
                    request.setAttribute("txtSearchPilot", searchPilot);
                }
                if (request.getAttribute("listSearch") != null) {
                    System.out.println("current link is: " + url);
                }
            } catch (Exception e) {
                request.setAttribute("ERROR", e.getMessage());
                request.setAttribute("ERROR", "Search Failed");
                request.setAttribute("LINKBACK", LEADER);
                log("ERROR at SearchController: " + e.getMessage());
            } finally {
                request.getRequestDispatcher(url).forward(request, response);
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
