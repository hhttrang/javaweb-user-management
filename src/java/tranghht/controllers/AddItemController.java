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
import tranghht.models.AddGundamErrObj;
import tranghht.models.AddWeaponErrObj;
import tranghht.tbl_Gundam.tbl_GundamDAO;
import tranghht.tbl_Weapon.tbl_WeaponDAO;

/**
 *
 * @author VS9 X64Bit
 */
@WebServlet(name = "AddItemController", urlPatterns = {"/AddItemController"})
public class AddItemController extends HttpServlet {
    private static final String GUNDAM = "gundamManager.jsp";
    private static final String WEAPON = "weaponManager.jsp";  
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
            /* TODO output your page here. You may use following sample code. */
            String url = ERR;
            boolean valid = true;
            int check = 0;
            AddGundamErrObj GErrObj = new AddGundamErrObj();
            AddWeaponErrObj WErrObj = new AddWeaponErrObj();
            try {
                if (request.getParameter("txtGundamId") != null) {
                    check = 1;
                    String id = request.getParameter("txtGundamId");
                    String name = request.getParameter("txtGundamName");
                    String type = request.getParameter("GundamtypeList"); 
                    float height = Float.parseFloat(request.getParameter("txtGundamHeight"));
                    float weight = Float.parseFloat(request.getParameter("txtGundamWeight"));
                    String des = request.getParameter("txtGundamDes");
                    String weapon = request.getParameter("weaponList");

                    if (id.trim().length() < 2 || id.trim().length() > 10) {
                        GErrObj.setInvalidGundamId("Gundam Id from 2 to 10 characters");
                        valid = false;
                        System.out.println("loi 1");
                    }
                    if ((type.contains("Armor") && !id.contains("MA")) || (type.contains("Suit") && !id.contains("MS"))) {
                        GErrObj.setInvalidGundamId("Gundam Id must contains type abbreviations");
                        valid = false;
                        System.out.println("loi 2");
                    }
                    if (name.trim().length() < 2 || name.trim().length() > 30) {
                        GErrObj.setInvalidGundamName("Name from 2 to 30 characters");
                        valid = false;
                        System.out.println("loi 3");
                    }
                    if (des.trim().length() > 100) {
                        GErrObj.setInvalidGundamName("Description under 100 characters");
                        valid = false;
                        System.out.println("loi 4");
                    }
                    if (valid) {
                        System.out.println("insert time");
                        tbl_GundamDAO gdao = new tbl_GundamDAO();
                        boolean rs = gdao.addGundam(id, name, des, type, height, weight, weapon);
                        if (rs) {
                            tbl_WeaponDAO wdao = new tbl_WeaponDAO();
                            int number = wdao.getWeaponQuantity(weapon) - 1;
                            wdao.updateQuantity(weapon, number);
                            url = GUNDAM;
                        } else {
                            request.setAttribute("ERROR", "Insert Gundam failed!");
                            request.setAttribute("LINKBACK", GUNDAM);
                            url = ERR;
                        }
                    } else {
                        request.setAttribute("INVALID", GErrObj);
                        url = GUNDAM;
                    }
                }

                if (request.getParameter("txtWeaponId") != null) {
                    System.out.println("start to add weapon");
                    String id = request.getParameter("txtWeaponId");
                    String name = request.getParameter("txtWeaponName");
                    String des = request.getParameter("txtWeaponDes");
                    int number = Integer.parseInt(request.getParameter("txtEditWeaponNumber"));
                    if (id.trim().length() < 2 || id.trim().length() > 10) {
                        WErrObj.setInvalidWeaponId("Weapon Id from 2 to 10 characters");
                        valid = false;
                    }
                    if (id.charAt(0) != 'W') {
                        WErrObj.setInvalidWeaponId("Weapon Id must contains W at first");
                        valid = false;
                    }
                    if (name.trim().length() < 2 || name.trim().length() > 30) {
                        WErrObj.setInvalidWeaponName("Name from 2 to 30 characters");
                        valid = false;
                    }
                    if (des.trim().length() > 100) {
                        WErrObj.setInvalidWeaponDes("Description under 100 characters");
                        valid = false;
                    }
                    if (valid) {
                        tbl_WeaponDAO wdao = new tbl_WeaponDAO();
                        boolean rs = wdao.addWeapon(id, name, des, number);
                        if (rs) {
                            url = WEAPON;
                        } else {
                            request.setAttribute("ERROR", "Insert Weapon failed!");
                            request.setAttribute("LINKBACK", WEAPON);
                            url = ERR;
                        }
                    } else {
                        request.setAttribute("INVALID", WErrObj);
                        url = WEAPON;
                    }
                }
                System.out.println("current link is: " + url);
            } catch (Exception e) {
                log("ERROR at AddItemController: " + e.getMessage());
                if (e.getMessage().toLowerCase().contains("duplicate")) {
                    if (check == 1) {
                        GErrObj.setInvalidGundamName("Id is already exist!");
                        request.setAttribute("INVALID", GErrObj);
                        url = GUNDAM;
                    } else {
                        WErrObj.setInvalidWeaponId("Id is already exist!");
                        request.setAttribute("INVALID", WErrObj);
                        url = WEAPON;
                    } 
                    
                } else {
                    request.setAttribute("ERROR", "Insert Failed");
                    request.setAttribute("LINKBACK", "leader.jsp");
                    url = ERR;
                }
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
