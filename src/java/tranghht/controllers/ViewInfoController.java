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
import tranghht.models.ViewMissionInfoForPilot;
import tranghht.tbl_Mission.tbl_MissionDAO;
import tranghht.tbl_Mission.tbl_MissionDTO;
import tranghht.tbl_MissionDetail.tbl_MissionDetailDAO;
import tranghht.tbl_MissionDetail.tbl_MissionDetailDTO;

/**
 *
 * @author VS9 X64Bit
 */
@WebServlet(name = "ViewInfoController", urlPatterns = {"/ViewInfoController"})
public class ViewInfoController extends HttpServlet {
    private static final String LEADER = "viewMissionforLeader.jsp"; 
    private static final String PILOT = "viewMissionforPilot.jsp";
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
             String info = request.getParameter("viewMissionforLeader");
            try { 
                HttpSession session = request.getSession();
                String userid = (String) session.getAttribute("USERID"); 
                tbl_MissionDAO mdao = new tbl_MissionDAO();
                
                if (info.equals("yes")) { 
                    mdao.viewMissionWithLeadername(userid);
                    List<tbl_MissionDTO> listMission = mdao.getListMissionInfo();
                    request.setAttribute("listMission", listMission);
                } else { 
//                            System.out.println("view step 1");
//                    tbl_MissionDetailDAO mddao = new tbl_MissionDetailDAO();
//                     mddao.viewMissioninfo(userid);
//                    List<tbl_MissionDetailDTO> listMissionDetail =mddao.getListMissionDetailInfo();
//                    System.out.println("step 3");
                    ViewMissionInfoForPilot showObj = new ViewMissionInfoForPilot();
                    List<ViewMissionInfoForPilot> InfoList = showObj.showMissionInfo(userid);
//                    
//                    for(int i = 0; i < listMissionDetail.size(); i++){ 
//                        mdao.viewMissionWithID(listMissionDetail.get(i).getMissionId()); 
//                        tbl_MissionDTO mdto = mdao.getMissionInfo();
//                        System.out.println("step 5");
//                        String missionName = mdto.getMissionName(); ////
//                        String missionLeader = mdto.getMissionLeader();////
//                        String status =listMissionDetail.get(i).getOwnStatus(); 
//                        int number = mdto.getParticipants();////
//                        System.out.println("step 6");
//                        System.out.println(missionName+"-"+missionLeader+"-"+status+"-"+number); 
//                        InfoList.add(i,new ViewMissionInfoForPilot(missionName, missionLeader, status, number));
//                        System.out.println("step 7"); 
//                    }
                    request.setAttribute("listPilotMission", InfoList);
                }
            } catch (Exception e) {
                log("ERROR at ViewInfoController:"+e.getMessage());
            } finally {
                String url ="";
                 if (info.equals("yes")) { 
                     url =LEADER;
                 }else{
                     url =PILOT;
                 }
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
