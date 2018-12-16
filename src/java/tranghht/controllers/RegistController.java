/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranghht.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tranghht.models.RegistErrObj;
import tranghht.tbl_User.tbl_UserDAO;

/**
 *
 * @author VS9 X64Bit
 */
@WebServlet(name = "RegistController", urlPatterns = {"/RegistController"})
public class RegistController extends HttpServlet {
    private static final String FAIL = "account.jsp";
    private static final String SUCCESS = "index.jsp";
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
            /* TODO output your page here. You may use following sample code. */
            String url = FAIL;
            RegistErrObj errObj = new RegistErrObj();
            try{
                System.out.println("Register");
                String Username = request.getParameter("txtnewUsername");
                String Password = request.getParameter("txtnewPassword");
                String Fullname = request.getParameter("txtnewFullname"); 
                String rePass = request.getParameter("txtRePassword");
                boolean valid = true;
                if (Username.trim().length() < 2 || Username.trim().length() > 10) {
                    errObj.setInvalidUsername("Username from 2 to 10 characters");
                    valid = false;
                }
                if (Password.trim().length() < 6 || Password.trim().length() > 30) {
                    errObj.setInvalidPassword("Password from 6 to 30 characters");
                    valid = false;
                }
                if (!rePass.equals(Password)) {
                    errObj.setInvalidRePass("Pass not match");
                    valid = false;
                }
                if (Fullname.trim().length() < 3) {
                    errObj.setInvalidFullname("Fullname must be longer than 2 characters");
                    valid = false;
                }
                if (!Fullname.trim().matches("[a-zA-Z]{1,}")) {
                    errObj.setInvalidFullname("Fullname must be alphabel characters");
                    valid = false;
                }
                if (valid) { 
                    System.out.println("insert time");
                    tbl_UserDAO dao = new tbl_UserDAO(); 
                    boolean c = dao.registAccount(Username, Password, Fullname);
                    if (c) {
                        url = SUCCESS;
                    } else {
                        request.setAttribute("ERROR", "Insert failed!"); 
                    }
                }else{
                    request.setAttribute("INVALID", errObj); 
                } 
            }catch(Exception e){
                 log("ERROR at RegistController: "+e.getMessage());
                if(e.getMessage().toLowerCase().contains("duplicate")){
                    errObj.setInvalidUsername("Username is already exist!");
                    request.setAttribute("INVALID", errObj);
                    url = FAIL;
                    log("ERROR at RegistController: "+e.getMessage());
                }
            } finally{
                request.getRequestDispatcher(url).forward(request, response);
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
