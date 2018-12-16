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
public class RegistErrObj implements Serializable {

    private String invalidUsername, invalidPassword, invalidFullname, invalidRePass;

    public RegistErrObj() {
    }

    public String getInvalidUsername() {
        return invalidUsername;
    }

    public void setInvalidUsername(String invalidUsername) {
        this.invalidUsername = invalidUsername;
    }

    public String getInvalidPassword() {
        return invalidPassword;
    }

    public void setInvalidPassword(String invalidPassword) {
        this.invalidPassword = invalidPassword;
    }

    public String getInvalidFullname() {
        return invalidFullname;
    }

    public void setInvalidFullname(String invalidFullname) {
        this.invalidFullname = invalidFullname;
    } 

    public String getInvalidRePass() {
        return invalidRePass;
    }

    public void setInvalidRePass(String invalidRePass) {
        this.invalidRePass = invalidRePass;
    }

}
