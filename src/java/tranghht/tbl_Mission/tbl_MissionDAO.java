/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranghht.tbl_Mission;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tranghht.dbconn.MyConnection;

/**
 *
 * @author VS9 X64Bit
 */
public class tbl_MissionDAO implements Serializable{
    Connection conn = null;
    PreparedStatement stm = null;
    ResultSet rs = null;

    public tbl_MissionDAO() {
    }
    private void closeConnect() throws SQLException{
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
    public boolean addMission(String name, String id, String des, int number,String leader) throws SQLException, Exception{
        boolean result = false;
        try{
            conn = MyConnection.makeConnection();
            if(conn != null){
                String sql = "insert into tbl_Mission(MissionId, MissionName, MissionLeader, Participants, Status, Description) values(?,?,?,?,?,?)";
                stm = conn.prepareStatement(sql);
                stm.setString(1, id);
                stm.setString(2, name);
                stm.setString(3, leader);
                stm.setInt(4, number);
                stm.setString(5, "PROCESSING");
                stm.setString(6, des);
                if(stm.executeUpdate() > 0){
                    result = true;
                }
            }
        }finally{
            closeConnect();
        }
        return result;
    }
    public int checkLastId() throws SQLException, Exception{
        int i = -1;
        try{
            conn = MyConnection.makeConnection();
            if(conn != null){
                String sql = "select MissionId from tbl_Mission";
                stm = conn.prepareStatement(sql);
                rs = stm.executeQuery();
                int lastVar = -1;
                while(rs.next()){
                    if(Integer.parseInt(rs.getString(1).trim()) > lastVar){
                        i = Integer.parseInt(rs.getString(1).trim());
                        lastVar = Integer.parseInt(rs.getString(1).trim());
                    }
                }
            }
        }finally{
            closeConnect();
        }
        return i;
    }
    
    private List<tbl_MissionDTO> listMissionInfo;

    public List<tbl_MissionDTO> getListMissionInfo() {
        return listMissionInfo;
    }
    public void viewMissionWithLeadername(String leaderid) throws Exception{
        try{
            conn = MyConnection.makeConnection();
            if(conn != null){
                String sql = "select MissionName, Participants, Status, Description from tbl_Mission where MissionLeader = ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, leaderid);
                rs = stm.executeQuery(); 
                while(rs.next()){
                    tbl_MissionDTO dto = new tbl_MissionDTO(rs.getString("MissionName"), leaderid, rs.getString("Status").trim(), rs.getString("Description"), rs.getInt("Participants"));
                     if(listMissionInfo == null) listMissionInfo = new ArrayList();
                     listMissionInfo.add(dto);
                }
            }
        }finally{
            closeConnect();
        }
    }
    
    private tbl_MissionDTO missionInfo;

    public tbl_MissionDTO getMissionInfo() {
        return missionInfo;
    } 
     public void viewMissionWithID(String missionid) throws Exception{
        try{
            conn = MyConnection.makeConnection();
            if(conn != null){
                String sql = "select MissionName, MissionLeader, Participants, Description from tbl_Mission where MissionId = ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, missionid);
                rs = stm.executeQuery(); 
                if(rs.next()){
                    System.out.println("step 4");
                    missionInfo = new tbl_MissionDTO(missionid, rs.getString("MissionName"), rs.getString("MissionLeader"), rs.getInt("Participants"),rs.getString("Description"));
                }
            }
        }finally{
            closeConnect();
        }
    }
     public boolean updateStatus(String missionid, String status) throws SQLException, Exception {
        try {
            conn = MyConnection.makeConnection();
            if (conn != null) {
                String sql = "update tbl_Mission set Status = ? where MissionId = ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, status);
                stm.setString(2, missionid); 
                if (stm.executeUpdate() > 0) {
                    return true;
                }
            }
        } finally {
            closeConnect();
        }
        return false;
    }
}
