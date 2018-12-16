/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranghht.tbl_Mission;

import java.io.Serializable;

/**
 *
 * @author VS9 X64Bit
 */
public class tbl_MissionDTO implements Serializable {

    private String missionId, missionName, missionLeader, status, description;
    private int participants;

    public tbl_MissionDTO() {
    }

    public tbl_MissionDTO(String missionName, String MissionLeader, String status, String description, int participants) {
        this.missionName = missionName;
        this.missionLeader = MissionLeader;
        this.status = status;
        this.description = description;
        this.participants = participants;
    }

    public tbl_MissionDTO(String missionId, String missionName, String missionLeader, int participants, String description) {
        this.missionId = missionId;
        this.missionName = missionName;
        this.missionLeader = missionLeader;
        this.participants = participants;
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

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public String getMissionLeader() {
        return missionLeader;
    }

    public void setMissionLeader(String missionLeader) {
        this.missionLeader = missionLeader;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
