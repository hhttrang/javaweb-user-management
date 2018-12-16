/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranghht.models;

import java.io.Serializable;

/**
 *
 * @author VS9 X64Bit
 */
public class AddMissionErrObj implements Serializable{
    private String invalidChoosePilot, invalidMissionName;

    public AddMissionErrObj() {
    }

    public String getInvalidChoosePilot() {
        return invalidChoosePilot;
    }

    public void setInvalidChoosePilot(String invalidChoosePilot) {
        this.invalidChoosePilot = invalidChoosePilot;
    }

    public String getInvalidMissionName() {
        return invalidMissionName;
    }

    public void setInvalidMissionName(String invalidMissionName) {
        this.invalidMissionName = invalidMissionName;
    }
 
    
}
