/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranghht.tbl_MissionDetail;

/**
 *
 * @author VS9 X64Bit
 */
public class tbl_MissionDetailDTO {
    private String pilotId, missionId, ownStatus;

    public tbl_MissionDetailDTO() {
    }

    public tbl_MissionDetailDTO(String pilotId, String missionId, String ownStatus) {
        this.pilotId = pilotId;
        this.missionId = missionId;
        this.ownStatus = ownStatus;
    }

    public String getPilotId() {
        return pilotId;
    }

    public void setPilotId(String pilotId) {
        this.pilotId = pilotId;
    }

    public String getMissionId() {
        return missionId;
    }

    public void setMissionId(String missionId) {
        this.missionId = missionId;
    }

    public String getOwnStatus() {
        return ownStatus;
    }

    public void setOwnStatus(String ownStatus) {
        this.ownStatus = ownStatus;
    }
    
}
