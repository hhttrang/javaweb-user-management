/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranghht.tbl_Gundam;

import java.io.Serializable;
import java.util.ArrayList;
import tranghht.dbconn.MyConnection;

/**
 *
 * @author VS9 X64Bit
 */
public class tbl_GundamDTO implements Serializable{
    private String modelNumber,officialName,classification;
    private float height,weight; 

    private String des,image,weaponid;
    public tbl_GundamDTO() {
    }
    
    public tbl_GundamDTO(String modelNumber, String officialName, String classification, String image, float height, float weight) {
        this.modelNumber = modelNumber;
        this.officialName = officialName;
        this.classification = classification;
        this.image = image;
        this.height = height;
        this.weight = weight; 
    }

    public tbl_GundamDTO(String modelNumber, String officialName, String classification, float height, float weight, String des, String image, String weaponid) {
        this.modelNumber = modelNumber;
        this.officialName = officialName;
        this.classification = classification;
        this.height = height;
        this.weight = weight; 
        this.des = des;
        this.image = image;
        this.weaponid = weaponid;
    }  

    public String getWeaponid() {
        return weaponid;
    }

    public void setWeaponid(String weaponid) {
        this.weaponid = weaponid;
    }
     
    
    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    
    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
 
    
}
