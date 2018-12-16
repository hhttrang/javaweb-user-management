/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranghht.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tranghht.tbl_Mission.tbl_MissionDAO;
import tranghht.tbl_Mission.tbl_MissionDTO;
import tranghht.tbl_MissionDetail.tbl_MissionDetailDAO;
import tranghht.tbl_MissionDetail.tbl_MissionDetailDTO;

/**
 *
 * @author VS9 X64Bit
 */
public class ViewMissionInfoForPilot implements Serializable {

    private String missionId, missionName, missionLeader, ownStatus, pilotStatus, description;
    private int participants;

    public ViewMissionInfoForPilot() {
    }

    public ViewMissionInfoForPilot(String missionName, String missionLeader, String ownStatus, int participants) {
        this.missionName = missionName;
        this.missionLeader = missionLeader;
        this.ownStatus = ownStatus;
        this.participants = participants;
    }

    public ViewMissionInfoForPilot(String missionId, String missionName, String pilotStatus, String description) {
        this.missionId = missionId;
        this.missionName = missionName;
        this.pilotStatus = pilotStatus;
        this.description = description;
    }

    public String getMissionId() {
        return missionId;
    }

    public void setMissionId(String missionId) {
        this.missionId = missionId;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getMissionLeader() {
        return missionLeader;
    }

    public void setMissionLeader(String missionLeader) {
        this.missionLeader = missionLeader;
    }

    public String getPilotStatus() {
        return pilotStatus;
    }

    public void setPilotStatus(String pilotStatus) {
        this.pilotStatus = pilotStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnStatus() {
        return ownStatus;
    }

    public void setOwnStatus(String ownStatus) {
        this.ownStatus = ownStatus;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    //statuc cua ca mission
    public List<ViewMissionInfoForPilot> showMissionInfo(String userid) throws Exception {
        System.out.println("view step 1");
        tbl_MissionDetailDAO mddao = new tbl_MissionDetailDAO();
        tbl_MissionDAO mdao = new tbl_MissionDAO();
        mddao.viewMissioninfo(userid);
        List<tbl_MissionDetailDTO> listMissionDetail = mddao.getListMissionDetailInfo();
        System.out.println("step 3");
        List<ViewMissionInfoForPilot> InfoList = new ArrayList();

        for (int i = 0; i < listMissionDetail.size(); i++) {
            mdao.viewMissionWithID(listMissionDetail.get(i).getMissionId());
            tbl_MissionDTO mdto = mdao.getMissionInfo();
            System.out.println("step 5");

            String missionName = mdto.getMissionName(); ////
            String missionLeader = mdto.getMissionLeader();////
            String status = listMissionDetail.get(i).getOwnStatus();
            int number = mdto.getParticipants();////
            System.out.println("step 6");
            System.out.println(missionName + "-" + missionLeader + "-" + status + "-" + number);
            InfoList.add(i, new ViewMissionInfoForPilot(missionName, missionLeader, status.trim(), number));
            System.out.println("step 7");
        }
        return InfoList;
    }

    //statuc cua rieng minh no
    public List<ViewMissionInfoForPilot> showMissionInfo(String userid, String Pilotstatus) throws Exception {
        System.out.println("view step 1");
        tbl_MissionDetailDAO mddao = new tbl_MissionDetailDAO();
        tbl_MissionDAO mdao = new tbl_MissionDAO();
        mddao.viewMissioninfo(userid, Pilotstatus);
        List<tbl_MissionDetailDTO> listMissionDetail = mddao.getListMissionDetailInfo();
        System.out.println("step 3");
        List<ViewMissionInfoForPilot> InfoList = new ArrayList();

        if (listMissionDetail != null) {
            for (int i = 0; i < listMissionDetail.size(); i++) {
                mdao.viewMissionWithID(listMissionDetail.get(i).getMissionId());
                tbl_MissionDTO mdto = mdao.getMissionInfo();
                System.out.println("step 5");

                String missionName = mdto.getMissionName(); ////
                String description = mdto.getDescription();////  
                String missionId = mdto.getMissionId();
                System.out.println("step 6");
                System.out.println(missionName + "-" + missionLeader + "-" + Pilotstatus + "-" + description);
                InfoList.add(i, new ViewMissionInfoForPilot(missionId, missionName, Pilotstatus, description));
                System.out.println("step 7");
            }
        }else{
            System.out.println("listMissionDetail is empty now!");
            InfoList = null;
        }
        return InfoList;
    }
}
