/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranghht.tbl_Weapon;

import java.io.Serializable;

/**
 *
 * @author VS9 X64Bit
 */
public class tbl_WeaponDTO implements Serializable{
    private String weaponId,weaponName,description,img;
    private int quantity;

    public tbl_WeaponDTO(String weaponId, String weaponName, String description, int quantity, String img) {
        this.weaponId = weaponId;
        this.weaponName = weaponName;
        this.description = description;
        this.quantity = quantity;
       this.img = img;
    }

    public tbl_WeaponDTO() {
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(String weaponId) {
        this.weaponId = weaponId;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
