/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranghht.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author VS9 X64Bit
 */
public class MainController extends HttpServlet {

    private static final String STARTUP = "StartupController";
    private static final String LOGIN = "LoginController";
    private static final String LOGOUT = "LogoutController";
    private static final String SEARCH = "SearchController";
    private static final String CREATEACC = "RegistController";
    private static final String ADD = "AddItemController";
    private static final String UPDATE = "UpdateController";
    private static final String DELETE = "DeleteController";
    private static final String CREATEMISSION = "CreateMissionController";
    private static final String CHOOSEGUNDAM = "ChooseGundamController";
    private static final String VIEWINFO = "ViewInfoController";
     private static final String CONFIRMMISSION = "ConfirmMissionController";
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
            String url = STARTUP;
            try {
                String act = request.getParameter("act");
                if(act == null){
                    url = STARTUP;
                } else switch (act) {
                    case "Log In":
                        url = LOGIN;
                        break;
                    case "Log Out":
                        url = LOGOUT;
                        break;
                    case "Search":
                        url = SEARCH;
                        break;
                    case "Regist":
                        url = CREATEACC; 
                        break;
                    case "Add":
                        url = ADD;
                        break;
                    case "Edit":
                        url = UPDATE;
                        break;
                    case "Delete":
                        url = DELETE;
                        break;
                    case "OK":
                    case "Create":
                        url = CREATEMISSION;
                        break;
                    case "Choose":
                        url = CHOOSEGUNDAM;
                        break;
                    case "View":
                        url = VIEWINFO;
                        break;
                    case "Success":
                    case "Fail":
                        url = CONFIRMMISSION;
                        break;
                    default:
                        url = ERR;
                        request.setAttribute("ERROR", "Link is not availidable now");
                        break;
                }
            } catch (Exception e) {
                log("ERROR at MainController: " + e.getMessage());
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
