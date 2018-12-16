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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tranghht.models.RegistErrObj;
import tranghht.models.ViewMissionInfoForPilot;
import tranghht.tbl_Gundam.tbl_GundamDAO;
import tranghht.tbl_Mission.tbl_MissionDAO;
import tranghht.tbl_MissionDetail.tbl_MissionDetailDAO;
import tranghht.tbl_MissionDetail.tbl_MissionDetailDTO;
import tranghht.tbl_User.tbl_UserDAO;
import tranghht.tbl_Weapon.tbl_WeaponDAO;

/**
 *
 * @author VS9 X64Bit
 */
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

    private static final String DEFAULT = "index.jsp";
    private static final String LEADER = "leader.jsp";
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
            /* TODO output your page here. You may use following sample code. */
            String url = ERR;
            RegistErrObj errObj = new RegistErrObj();
            try {
                String user = request.getParameter("txtUsername");
                String pass = request.getParameter("txtPassword");
                boolean valid = true;
                if (user.trim().length() < 1) {
                    errObj.setInvalidUsername("Username can't be blank");
                    valid = false;
                }
                if (pass.trim().length() <1) {
                    errObj.setInvalidPassword("Password can't be blank");
                    valid = false;
                }
                if (valid) {
                    tbl_UserDAO udao = new tbl_UserDAO();
                    int rs = udao.checkLogin(user, pass);
                    if (rs == 1 || rs == 0) {
                        Cookie cookie = new Cookie(user, pass);
                        cookie.setMaxAge(60 * 10);
                        response.addCookie(cookie);
                        HttpSession session = request.getSession();
                        session.setAttribute("USERID", user);

                        if (rs == 1) {
                            url = LEADER;

                            udao.infoListPilot();
                            tbl_GundamDAO gdao = new tbl_GundamDAO();
                            gdao.infoListGundam();
                            tbl_WeaponDAO wdao = new tbl_WeaponDAO();
                            wdao.infoListWeapon();

                            session.setAttribute("WEAPONLIST", wdao.getListWeapon());
                            session.setAttribute("PILOTLIST", udao.getListPilot());
                            session.setAttribute("GUNDAMLIST", gdao.getListGundam());
                        } else if (rs == 0) {
//                        tbl_MissionDetailDAO mddao = new tbl_MissionDetailDAO();
//                        tbl_MissionDAO mdao = new tbl_MissionDAO();
//                        mddao.viewMissioninfo(user);
//                        List<tbl_MissionDetailDTO> listdetail= mddao.getListMissionDetailInfo();
                            ViewMissionInfoForPilot showObj = new ViewMissionInfoForPilot();
                            List<ViewMissionInfoForPilot> CurrentMission = showObj.showMissionInfo(user, "PROCESSING");

                            session.setAttribute("CurrentMission", CurrentMission);
                            url = PILOT;
                        }
                    } else {
                        request.setAttribute("ERROR", "Login failed");
                        request.setAttribute("LINKBACK", DEFAULT);
                    }
                }else{
                     request.setAttribute("INVALID", errObj); 
                     url = DEFAULT;
                }
            } catch (Exception e) {
                log("ERROR at LoginController: " + e.getMessage());
            } finally {
                if (!url.equals(ERR)) {
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
