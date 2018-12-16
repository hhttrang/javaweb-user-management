/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranghht.tbl_User;

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
public class tbl_UserDAO implements Serializable {

    private Connection conn = null;
    private PreparedStatement stm = null;
    private ResultSet rs = null;

    public tbl_UserDAO() {
    }

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

    public int checkLogin(String username, String password) throws SQLException, Exception {
        int result = -1;
        try {
            conn = MyConnection.makeConnection();
            if (conn != null) {
                String sql = "select Role from tbl_User where Username = ? and Password = ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, username);
                stm.setString(2, password);
                rs = stm.executeQuery();
                if (rs.next()) {
                    if (rs.getBoolean("Role")) {
                        result = 1;
                    } else {
                        result = 0;
                    }
                }
            }
        } finally {
            closeConnection();
        }
        return result;
    }

    public boolean registAccount(String user, String pass, String full) throws SQLException, Exception {
        boolean result = false;
        try {
            conn = MyConnection.makeConnection();
            if (conn != null) {
                String sql = "insert into tbl_User(Username,Password,Role,Fullname,NumberMission) values(?,?,?,?,?)";
                stm = conn.prepareStatement(sql);
                stm.setString(1, user);
                stm.setString(2, pass);
                stm.setBoolean(3, false);
                stm.setString(4, full);
                int number = 0;
                stm.setInt(5, number);
                System.out.println(user + "-" + pass + "-" + full + "-" + number);
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

    private List<tbl_UserDTO> listsearchName;

    public List<tbl_UserDTO> getListsearchName() {
        return listsearchName;
    }

    public void findName(String search) throws Exception {
        try {
            conn = MyConnection.makeConnection();
            if (conn != null) {
                String sql = "select Username, Fullname,NumberMission, GundamId from tbl_User where Fullname like ? and Role != ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, "%" + search + "%");
                stm.setBoolean(2, true);
                rs = stm.executeQuery();
                System.out.println("da chay");
                while (rs.next()) {
                    System.out.println("da tim duoc kq search name");
                    String id = rs.getString("Username");
                    String name = rs.getString("Fullname");
                    int number = rs.getInt("NumberMission");
                    if (rs.getString("GundamId") == null) {
                        tbl_UserDTO dto = new tbl_UserDTO(id, name, number);
                        if (this.listsearchName == null) {
                            this.listsearchName = new ArrayList<>();
                        }
                        listsearchName.add(dto);
                    }
                }
            }
        } finally {
            closeConnection();
            System.out.println("Close connect r");
        }
    }
    private HashMap<String, String> listPilot;

    public HashMap<String, String> getListPilot() {
        return listPilot;
    }

    public void infoListPilot() throws SQLException, Exception {
        try {
            conn = MyConnection.makeConnection();
            if (conn != null) {
                String sql = "select Username, Fullname, GundamId from tbl_User where Role = ?";
                stm = conn.prepareStatement(sql);
                stm.setBoolean(1, false);
                rs = stm.executeQuery();
                while (rs.next()) {
                    if (rs.getString("GundamId") != null) {
                        if (listPilot == null) {
                            listPilot = new HashMap<String, String>();
                        }
                        listPilot.put(rs.getString("Username"), rs.getString("Fullname"));
                    }

                }
            }
        } finally {
            closeConnection();
        }
    }

    public boolean updateUserGundam(String id, String gundamid) throws Exception {
        boolean check = false;
        try {
            conn = MyConnection.makeConnection();
            if (conn != null) {
                String sql = "update tbl_User set GundamId = ? where Username = ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, gundamid);
                stm.setString(2, id);
                if (stm.executeUpdate() > 0) {
                    check = true;
                }
            }
        } finally {
            closeConnection();
        }
        return check;
    }

    public int getUserMissionNumber(String id) throws SQLException, Exception {
        try {
            conn = MyConnection.makeConnection();
            if (conn != null) {
                String sql = "select NumberMission from tbl_User where Username = ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, id);
                rs = stm.executeQuery();
                if (rs.next()) {
                    System.out.println("add>process 1");
                    return rs.getInt("NumberMission");
                }
            }
        } finally {
            closeConnection();
        }
        return -1;
    }

    public boolean addUserMissionNumber(String id, int number) throws SQLException, Exception {
        try {
            conn = MyConnection.makeConnection();
            if (conn != null) {
                String sql = "update tbl_User set NumberMission = ? where Username = ?";
                stm = conn.prepareStatement(sql);
                stm.setInt(1, number);
                stm.setString(2, id);
                if (stm.executeUpdate() > 0) {
                    System.out.println("add>process 2");
                    return true;
                }
            }
        } finally {
            closeConnection();
        }
        return false;
    }
}
