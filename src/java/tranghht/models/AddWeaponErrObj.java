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
public class AddWeaponErrObj implements Serializable{
    private String invalidWeaponId, invalidWeaponName,invalidWeaponDes;

    public AddWeaponErrObj() {
    }
    
    public String getInvalidWeaponId() {
        return invalidWeaponId;
    }

    public void setInvalidWeaponId(String invalidWeaponId) {
        this.invalidWeaponId = invalidWeaponId;
    }

    public String getInvalidWeaponName() {
        return invalidWeaponName;
    }

    public void setInvalidWeaponName(String invalidWeaponName) {
        this.invalidWeaponName = invalidWeaponName;
    }

    public String getInvalidWeaponDes() {
        return invalidWeaponDes;
    }

    public void setInvalidWeaponDes(String invalidWeaponDes) {
        this.invalidWeaponDes = invalidWeaponDes;
    }
    
    
}
