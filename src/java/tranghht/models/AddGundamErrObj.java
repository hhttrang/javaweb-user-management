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
public class AddGundamErrObj implements Serializable{
     private String invalidGundamId, invalidGundamName,invalidGundamDes;

    public AddGundamErrObj() {
    }

    public String getInvalidGundamId() {
        return invalidGundamId;
    }

    public void setInvalidGundamId(String invalidGundamId) {
        this.invalidGundamId = invalidGundamId;
    }

    public String getInvalidGundamName() {
        return invalidGundamName;
    }

    public void setInvalidGundamName(String invalidGundamName) {
        this.invalidGundamName = invalidGundamName;
    }

    public String getInvalidGundamDes() {
        return invalidGundamDes;
    }

    public void setInvalidGundamDes(String invalidGundamDes) {
        this.invalidGundamDes = invalidGundamDes;
    }
     
}
