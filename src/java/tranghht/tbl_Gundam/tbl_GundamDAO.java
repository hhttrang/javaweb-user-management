/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranghht.tbl_Gundam;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tranghht.dbconn.MyConnection;

/**
 *
 * @author VS9 X64Bit
 */
public class tbl_GundamDAO implements Serializable {

    private Connection conn = null;
    private PreparedStatement stm = null;
    private ResultSet rs = null;

    private void closeConnection() throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (stm != null) {
            stm.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
    private List<tbl_GundamDTO> listsearchName;

    public List<tbl_GundamDTO> getListsearchName() {
        return listsearchName;
    }

    public void findName(String search) throws Exception {
        try {
            conn = MyConnection.makeConnection();
            if (conn != null) {
                String sql = "select ModelNumber, OfficialName, Classification,image,Height,Weight from tbl_Gundam where OfficialName like ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, "%" + search + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    System.out.println("da tim duoc kq search name");
                    String id = rs.getString("ModelNumber");
                    String name = rs.getString("OfficialName");
                    String type = rs.getString("Classification");
                    String image = rs.getString("image");
                    float height = rs.getFloat("Height");
                    float weight = rs.getFloat("Weight");
                    tbl_GundamDTO dto = new tbl_GundamDTO(id, name, type, image, height, weight);
                    if (this.listsearchName == null) {
                        this.listsearchName = new ArrayList<>();
                    }
                    listsearchName.add(dto);
                }
            }
        } finally {
            closeConnection();
            System.out.println("Close connect r");
        }
    }

    public boolean addGundam(String id, String name, String des, String type, float height, float weight, String weapon) throws Exception {
        boolean result = false;
        try {
            conn = MyConnection.makeConnection();
            if (conn != null) {
                String sql = "insert into tbl_Gundam(ModelNumber,OfficialName,Classification,Height,Weight,Description,WeaponId,status,image) values(?,?,?,?,?,?,?,?,?)";
                stm = conn.prepareStatement(sql);
                stm.setString(1, id);
                stm.setString(2, name);
                stm.setString(3, type); 
                stm.setFloat(4, height);
                stm.setFloat(5, weight);
                stm.setString(6, des); 
                stm.setString(7, weapon);
                stm.setString(8, "NOTUSED");
                stm.setString(9, "ProjectImg/gundam.jpg");
                System.out.println(id + "-" + name + "-" + des);
                int check = stm.executeUpdate();
                if (check > 0) {
                    result = true;
                }
            }
        } finally {
            closeConnection();
            System.out.println(result);
        }
        return result;
    }
    public boolean deleteGundam(String id) throws SQLException, Exception{
        boolean check = false;
        try{
             conn = MyConnection.makeConnection();
            if(conn != null){
                String sql = "delete tbl_Gundam where ModelNumber = ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, id);
                if(stm.executeUpdate() > 0){
                    check = true;
                }
            }
        }finally{
            closeConnection();
        }
        return check;
    }
    public boolean updateGundam(String id,String name,String type,float height,float weight) throws Exception {
        boolean check = false;
        try{
            conn = MyConnection.makeConnection();
            if(conn != null){
                String sql = "update tbl_Gundam set OfficialName = ?, Classification = ?, Height = ?, Weight = ? where ModelNumber = ?";
                System.out.println("updateGundam >step 0");
                stm = conn.prepareStatement(sql);
                System.out.println("updateGundam >step 1");
                stm.setString(1, name);
                stm.setString(2, type);
                stm.setFloat(3, height);
                stm.setFloat(4, weight);
                stm.setString(5, id);
                System.out.println("updateGundam >step 2");
                if(stm.executeUpdate() > 0){
                    System.out.println("executeUpdate > 0");
                    check = true;
                }
            }
        }finally{
            closeConnection();
        }
        return check;
    }
     public boolean updateGundam(String id) throws Exception {
        boolean check = false;
        try{
            conn = MyConnection.makeConnection();
            if(conn != null){
                String sql = "update tbl_Gundam set status = ? where ModelNumber = ?"; 
                stm = conn.prepareStatement(sql); 
                stm.setString(1, "USED");  
                stm.setString(2, id); 
                if(stm.executeUpdate() > 0){ 
                    check = true;
                }
            }
        }finally{
            closeConnection();
        }
        return check;
    }
    
    private HashMap<String,String> listGundam;

    public HashMap<String,String> getListGundam() {
        return listGundam;
    }
    
    public void infoListGundam() throws SQLException, Exception{
        try{
             conn = MyConnection.makeConnection();
            if(conn != null){
                String sql = "select ModelNumber, OfficialName, status from tbl_Gundam";
                stm = conn.prepareStatement(sql); 
                rs = stm.executeQuery();
                System.out.println("info test 1");
                while(rs.next()){
                    System.out.println("info test 2");
                    if(rs.getString("status").trim().equals("NOTUSED")){
                        System.out.println("info test 3");
                        if(listGundam == null) listGundam = new HashMap<String,String>();
                        listGundam.put(rs.getString("ModelNumber"),rs.getString("OfficialName"));
                    } 
                }
            }
        }finally{
            closeConnection();
        }
    }
     public String getWeaponid(String Gundamid) throws Exception{ 
        try{
            conn = MyConnection.makeConnection();
            if(conn != null){
                String sql = "select WeaponId from tbl_Gundam where ModelNumber = ?";
                stm = conn.prepareStatement(sql); 
                stm.setString(1, Gundamid);
                rs = stm.executeQuery();
                if(rs.next()){
                    return rs.getString("WeaponId");
                }
            }
        }finally{
            closeConnection();
        }
        return null;
    }
}
