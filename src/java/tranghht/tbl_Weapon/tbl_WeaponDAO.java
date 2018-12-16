/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranghht.tbl_Weapon;

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
public class tbl_WeaponDAO implements Serializable {

    Connection conn = null;
    PreparedStatement stm = null;
    ResultSet rs = null;

    private void closeConnect() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private List<tbl_WeaponDTO> listsearchName;

    public List<tbl_WeaponDTO> getListsearchName() {
        return listsearchName;
    }

    public void findName(String search) throws Exception {
        try {
            conn = MyConnection.makeConnection();
            if (conn != null) {
                String sql = "select WeaponId, WeaponName, img, Description, quantity from tbl_Weapon where WeaponName like ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, "%" + search + "%"); 
                rs = stm.executeQuery();
                while (rs.next()) {
                    System.out.println("da tim duoc kq search name");
                    String id = rs.getString("WeaponId");
                    String name = rs.getString("WeaponName");
                    String des = rs.getString("Description");
                    int quantity = rs.getInt("quantity");
                    String image = rs.getString("img");
                    tbl_WeaponDTO dto = new tbl_WeaponDTO(id, name, des, quantity, image);
                    if (this.listsearchName == null) {
                        this.listsearchName = new ArrayList<>();
                    }
                    listsearchName.add(dto);
                }
            }
        } finally {
            closeConnect();
            System.out.println("Close connect r");
        }
    }

    public boolean addWeapon(String id, String name, String des, int quantity) throws Exception {
        boolean result = false;
        try {
            conn = MyConnection.makeConnection();
            if (conn != null) {
                String sql = "insert into tbl_Weapon(WeaponId,WeaponName,Description, img, quantity) values(?,?,?,?,?)";
                stm = conn.prepareStatement(sql);
                stm.setString(1, id);
                stm.setString(2, name);
                stm.setString(3, des);
                stm.setString(4, "ProjectImg/weapon.jpg");
                stm.setInt(5, quantity);
                System.out.println(id + "-" + name + "-" + des);
                int check = stm.executeUpdate();
                if (check > 0) {
                    result = true;
                }
            }
        } finally {
            closeConnect();
            System.out.println(result);
        }
        return result;
    }

    public boolean deleteWeapon(String id) throws Exception {
        boolean check = false;
        try{
            conn = MyConnection.makeConnection();
            if(conn != null){
                String sql = "delete tbl_Weapon where WeaponId = ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, id);
                if(stm.executeUpdate() > 0){
                    check = true;
                }
            }
        }finally{
            closeConnect();
        }
        return check;
    }
    public int getWeaponQuantity(String id) throws Exception{ 
        try{
            conn = MyConnection.makeConnection();
            if(conn != null){
                String sql = "select quantity from tbl_Weapon where WeaponId = ?";
                stm = conn.prepareStatement(sql); 
                stm.setString(1, id);
                rs = stm.executeQuery();
                if(rs.next()){
                    return rs.getInt("quantity");
                }
            }
        }finally{
            closeConnect();
        }
        return -1;
    }
    public boolean updateWeapon(String id,String name, String des, int number) throws Exception {
        boolean check = false;
        try{
            conn = MyConnection.makeConnection();
            if(conn != null){
                String sql = "update tbl_Weapon set WeaponName = ?, Description = ?, quantity = ? where WeaponId = ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, name);
                stm.setString(2, des);
                stm.setInt(3, number);
                stm.setString(4, id);
                if(stm.executeUpdate() > 0){
                    check = true;
                }
            }
        }finally{
            closeConnect();
        }
        return check;
    } 
      public boolean updateQuantity(String id, int quantity) throws Exception {
        boolean check = false;
        try{
            conn = MyConnection.makeConnection();
            if(conn != null){
                String sql = "update tbl_Weapon set quantity = ? where WeaponId = ?";
                stm = conn.prepareStatement(sql);
                stm.setInt(1, quantity);
                stm.setString(2, id);
                if(stm.executeUpdate() > 0){
                    check = true;
                }
            }
        }finally{
            closeConnect();
        }
        return check;
    } 
      
     private HashMap<String,String> listWeapon;

    public HashMap<String,String> getListWeapon() {
        return listWeapon;
    }
    
    public void infoListWeapon() throws SQLException, Exception{
        try{
             conn = MyConnection.makeConnection();
            if(conn != null){
                String sql = "select WeaponId,WeaponName from tbl_Weapon where quantity != ?";
                stm = conn.prepareStatement(sql); 
                stm.setInt(1, 0);
                rs = stm.executeQuery();
                while(rs.next()){
                    if(listWeapon == null) listWeapon = new HashMap<String,String>();
                    listWeapon.put(rs.getString("WeaponId"),rs.getString("WeaponName"));
                }
            }
        }finally{
            closeConnect();
        }
    } 
}
