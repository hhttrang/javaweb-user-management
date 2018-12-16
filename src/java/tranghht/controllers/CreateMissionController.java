/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranghht.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tranghht.models.AddMissionErrObj;
import tranghht.tbl_Mission.tbl_MissionDAO;
import tranghht.tbl_MissionDetail.tbl_MissionDetailDAO;
import tranghht.tbl_User.tbl_UserDAO;

/**
 *
 * @author VS9 X64Bit
 */
@WebServlet(name = "CreateMissionController", urlPatterns = {"/CreateMissionController"})
public class CreateMissionController extends HttpServlet {

    private static final String MISSION = "missionManager.jsp"; 
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
    private boolean checkDuplicatePilot(List checkList) {
        for (int i = 0; i < checkList.size(); i++) {
            for (int z = i + 1; z < checkList.size(); z++) {
                if (i != z && checkList.get(i).equals(checkList.get(z))) {
                    return true;
                }
            }
        }
        return false;
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String url = ERR;
            boolean valid = true;
            AddMissionErrObj MissErrObj = new AddMissionErrObj();
            /* TODO output your page here. You may use following sample code. */
            try {
                String act = request.getParameter("act");
                if (act.equals("OK")) {
                    request.setAttribute("CreateSign", "block");

                    url = MISSION;
                } else if (act.equals("Create")) {
                    String name = request.getParameter("txtMissionName");
                    int numberofPilot = Integer.parseInt(request.getParameter("txtMissionPilotsNum"));
                    List<String> participants = new ArrayList();
                    for (int i = 0; i < numberofPilot; i++) {
                        int count = i + 1;
                        String thisid = "pilotList" + Integer.toString(count);
                        participants.add(request.getParameter(thisid));
                        System.out.println("participants: " + thisid);
                    }
                    System.out.println("it's not seem fine");
                    if (checkDuplicatePilot(participants)) {
                        valid = false;
                        MissErrObj.setInvalidChoosePilot("Not choose Duplicate Pilots");
                        System.out.println("error: duplicated pilot");
                        url = MISSION;
                    }
                    if (name == null || name.length() > 30) {
                        valid = false;
                        MissErrObj.setInvalidMissionName("Mission name from 1 to 30 characters");
                        System.out.println("error: mission name incorrect");
                        url = MISSION;
                    }

                    if (valid) {
                        System.out.println("after check infomation mission");
                        String des = request.getParameter("txtMissionDes");
                        HttpSession session = request.getSession();
                        String leader = (String) session.getAttribute("USERID");
                        String missionId = null;
                        tbl_MissionDAO mdao = new tbl_MissionDAO();
                        int lastID = mdao.checkLastId();
                        if (lastID == -1) {
                            missionId = "1";
                        } else {
                            missionId = Integer.toString(lastID + 1);
                        }

                        boolean rs1 = mdao.addMission(name, missionId, des, numberofPilot, leader);
                        if (rs1) {
                            System.out.println("da dung rs1");
                            tbl_MissionDetailDAO mddao = new tbl_MissionDetailDAO();
                            boolean rs2 = mddao.addMissionDetail(missionId, participants);
                            if (rs2) {
                                System.out.println("Da dung rs2");
                                tbl_UserDAO udao = new tbl_UserDAO();
                                for (int i = 0; i < participants.size(); i++) {
                                    int thisNumber = udao.getUserMissionNumber(participants.get(i));
                                    System.out.println("last pilot's mission number: " + thisNumber);
                                    thisNumber++;
                                    udao.addUserMissionNumber(participants.get(i), thisNumber);
                                    System.out.println("de dung rs3");
                                    request.setAttribute("CresteMissionStatus", "Create Mission Successfully"); 
                                    url = MISSION;
                                }
                            } else {
                                request.setAttribute("ERROR", "Create Mission failed!");
                                request.setAttribute("LINKBACK", MISSION);
                            }
                        } else {
                            System.out.println("deo dung cai nao ca");
                            request.setAttribute("ERROR", "Create Mission failed!");
                            request.setAttribute("LINKBACK", MISSION);
                        }
                    } else {
                        request.setAttribute("INVALID", MissErrObj); 
                    }

                }
            } catch (Exception e) {
                log("ERROR at CreateMissionController: " + e.getMessage());
                request.setAttribute("ERROR", "Create Mission Failed");
                request.setAttribute("LINKBACK", MISSION);
            } finally {
                //chua biet
//                if(url.equals(SUCCESS)) response.sendRedirect(url);
//                else 
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
