/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranghht.tbl_User;

import java.io.Serializable;

/**
 *
 * @author VS9 X64Bit
 */
public class tbl_UserDTO implements Serializable{
    private String username,fullname;
    private int numberMission; 

    public tbl_UserDTO() {
    }

    public tbl_UserDTO(String username, String fullname, int numberMission ) {
        this.username = username;
        this.fullname = fullname;
        this.numberMission = numberMission; 
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getNumberMission() {
        return numberMission;
    }

    public void setNumberMission(int numberMission) {
        this.numberMission = numberMission;
    } 
}
