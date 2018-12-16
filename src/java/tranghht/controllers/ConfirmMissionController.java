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
import javax.servlet.http.HttpSession;
import tranghht.models.ViewMissionInfoForPilot;
import tranghht.tbl_Mission.tbl_MissionDAO;
import tranghht.tbl_MissionDetail.tbl_MissionDetailDAO;

/**
 *
 * @author VS9 X64Bit
 */
@WebServlet(name = "ConfirmMissionController", urlPatterns = {"/ConfirmMissionController"})
public class ConfirmMissionController extends HttpServlet {

    public ConfirmMissionController() {
    }

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
        try {
            //cap nhat trang thai trong dao missiondetail
            String act = request.getParameter("act");
            HttpSession session = request.getSession();
            String PilotStatus;
            if (act.equals("Success")) {
                PilotStatus = "SUCCESSFUL";
            } else {
                PilotStatus = "FAILED";
            }
            String missionid = request.getParameter("txtMissionId");
            String pilotid = (String) session.getAttribute("USERID");
            System.out.println("missionid: "+ missionid + ", pilotid: "+pilotid);
            tbl_MissionDetailDAO mddao = new tbl_MissionDetailDAO();
            boolean rs = mddao.updateStatus(missionid, pilotid, PilotStatus);
            //cap nhat & tinh lai trang thai mission
            if (rs) {
                System.out.println("cap nhat trang thai cua missiondetail xong");
                if (mddao.checkMissionFinish(missionid)) {
                    mddao.showListStatus(missionid);
                    List listStatus = mddao.getListStatus();
                    int countSuccess = 0;
                    for (int i = 0; i < listStatus.size(); i++) {
                        if (listStatus.get(i).equals("SUCCESSFUL")) {
                            countSuccess++;
                        }
                    }
                    tbl_MissionDAO mdao = new tbl_MissionDAO();
                    boolean result;
                    System.out.println("so sanh giua countSuccess:"+countSuccess+" & listStatus size:"+listStatus.size());
                    if(listStatus.size() == 1){
                        if(countSuccess == 1){
                            result = mdao.updateStatus(missionid, "SUCCESSFUL");
                        }else{
                            result = mdao.updateStatus(missionid, "FAILED");
                        }
                    }else{
                        if (countSuccess >= listStatus.size() / 2) {
                            result = mdao.updateStatus(missionid, "SUCCESSFUL");
                        } else {
                            result = mdao.updateStatus(missionid, "FAILED");
                        }
                    } 
                    System.out.println("Confirm Mission rs: " + result);
                }
                ViewMissionInfoForPilot showObj = new ViewMissionInfoForPilot();
                List<ViewMissionInfoForPilot> CurrentMission = showObj.showMissionInfo(pilotid, "PROCESSING");
                session.setAttribute("CurrentMission", CurrentMission);
            }else{
                System.out.println("update status for mission detail failed");
            }
            //nho cap nhat lai session
        } catch (Exception e) {
            log("ERROR at ConfirmMissionController: " + e.getMessage());
        } finally {
            response.sendRedirect("currentMissionforPilot.jsp");
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
