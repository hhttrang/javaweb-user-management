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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tranghht.tbl_User.tbl_UserDAO;

/**
 *
 * @author VS9 X64Bit
 */
@WebServlet(name = "StartupController", urlPatterns = {"/StartupController"})
public class StartupController extends HttpServlet {

    private static final String DEFAULT = "index.jsp";
    private static final String LEADER = "leader.jsp";
    private static final String PILOT = "pilot.jsp";

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
            String url = DEFAULT;
            try {
                System.out.println("welcome to StartupController");
                Cookie[] cookies = request.getCookies();
                if (cookies != null) {
                    String username = null, pass = null;
                    for (Cookie cookie : cookies) {
                        if (!username.equals("JSESSIONID")) {
                            username = cookie.getName();
                            pass = cookie.getValue();
                        } else {
                            username = pass = "1";
                        }
                    }
                    System.out.println("cookie side: user: "+username+" - pass: "+pass);
                    tbl_UserDAO dao = new tbl_UserDAO();
                    int rs = dao.checkLogin(username, pass);
                    System.out.println("rs login: " + rs);
                    HttpSession session = request.getSession();
                    session.setAttribute("USERID", username);
                    if (rs == 1) {
                        url = LEADER;
                    } else if(rs == 0) {
                        url = PILOT;
                        System.out.println("pilot");
                    }
                }else{
                    System.out.println("cookie rong");
                }
            } catch (Exception e) {
                log("ERROR at StartupController: " + e.getMessage());
            } finally {
                if (url.equals(DEFAULT)) {
                    response.sendRedirect(url);
                } else { 
                    request.getRequestDispatcher(url).forward(request, response);
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
