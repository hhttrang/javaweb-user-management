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
import tranghht.tbl_Gundam.tbl_GundamDAO;
import tranghht.tbl_Weapon.tbl_WeaponDAO;

/**
 *
 * @author VS9 X64Bit
 */
@WebServlet(name = "DeleteController", urlPatterns = {"/DeleteController"})
public class DeleteController extends HttpServlet {

    private static final String ERR = "err.jsp";
    private static final String WEAPON = "weaponManager.jsp";
    private static final String GUNDAM = "gundamManager.jsp";
    private static final String LEADER = "leader.jsp";
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
        String url = ERR;
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            try {
                String searchval = request.getParameter("txtLastSearch");
                String WeaponId = request.getParameter("txtWeaponId");
                tbl_WeaponDAO wdao = new tbl_WeaponDAO();
                if (WeaponId != null) {  
                    boolean rs = wdao.deleteWeapon(WeaponId);
                    if (rs) {
                        url = "MainController?act=Search&txtSearchWeapon=" + searchval;
                    } else {
                        request.setAttribute("ERROR", "Delete Weapon Failed");
                        request.setAttribute("LINKBACK", WEAPON);
                    }
                }
                
                String GundamId = request.getParameter("txtGundamId");
                if (GundamId != null) { 
                    tbl_GundamDAO gdao = new tbl_GundamDAO();
                    String weaponId = gdao.getWeaponid(GundamId); 
                    wdao.updateQuantity(weaponId,wdao.getWeaponQuantity(weaponId) + 1);
                    System.out.println("get weapon "+weaponId +" up to "+wdao.getWeaponQuantity(weaponId) + 1);
                    boolean rs = gdao.deleteGundam(GundamId); 
                    if (rs) {
                        url = "MainController?act=Search&txtSearchGundam=" + searchval;
                    } else {
                        request.setAttribute("ERROR", "Delete Weapon Failed");
                        request.setAttribute("LINKBACK", GUNDAM);
                    }
                }
            } catch (Exception e) {
                log("ERROR at DeleteController: " + e.getMessage());
                request.setAttribute("ERROR", "Delete Failed");
                request.setAttribute("LINKBACK", LEADER);
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
