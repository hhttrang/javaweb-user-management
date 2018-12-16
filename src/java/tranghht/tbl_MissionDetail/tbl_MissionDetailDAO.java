/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranghht.tbl_MissionDetail;

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
public class tbl_MissionDetailDAO implements Serializable {

    Connection conn = null;
    PreparedStatement stm = null;
    ResultSet rs = null;

    public tbl_MissionDetailDAO() {
    }

    private void closeConnect() throws SQLException {
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

    public boolean addMissionDetail(String id, List<String> PilotList) throws SQLException, Exception {
        try {
            conn = MyConnection.makeConnection();
            if (conn != null) {
                String sql = "insert into tbl_MissionDetail(MissionId, OwnStatus, PilotId) values(?,?,?)";
                for (int i = 0; i < PilotList.size(); i++) {
                    stm = conn.prepareStatement(sql);
                    stm.setString(1, id);
                    stm.setString(2, "PROCESSING");
                    stm.setString(3, PilotList.get(i));
                    if (stm.executeUpdate() <= 0) {
                        return false;
                    }
                }
            }
        } finally {
            closeConnect();
        }
        return true;
    }

    private List<tbl_MissionDetailDTO> listMissionDetailInfo;

    public List<tbl_MissionDetailDTO> getListMissionDetailInfo() {
        return listMissionDetailInfo;
    }

    public void viewMissioninfo(String pilotId) throws Exception {
        try {
            conn = MyConnection.makeConnection();
            if (conn != null) {
                String sql = "select MissionId, OwnStatus from tbl_MissionDetail where PilotId = ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, pilotId);
                rs = stm.executeQuery();
                while (rs.next()) {
                    System.out.println("step 2");
                    tbl_MissionDetailDTO dto = new tbl_MissionDetailDTO(pilotId, rs.getString("MissionId"), rs.getString("OwnStatus"));
                    if (listMissionDetailInfo == null) {
                        listMissionDetailInfo = new ArrayList();
                    }
                    listMissionDetailInfo.add(dto);
                }
            }
        } finally {
            closeConnect();
        }
    }

    public void viewMissioninfo(String pilotId, String ownstatus) throws Exception {
        try {
            conn = MyConnection.makeConnection();
            if (conn != null) {
                String sql = "select MissionId from tbl_MissionDetail where OwnStatus = ? and PilotId = ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, ownstatus);
                stm.setString(2, pilotId);
                rs = stm.executeQuery();
                while (rs.next()) {
                    System.out.println("step 2");
                    tbl_MissionDetailDTO dto = new tbl_MissionDetailDTO(pilotId, rs.getString("MissionId"), ownstatus);
                    if (listMissionDetailInfo == null) {
                        listMissionDetailInfo = new ArrayList();
                    }
                    listMissionDetailInfo.add(dto);
                }
            }
        } finally {
            closeConnect();
        }
    }

    public boolean updateStatus(String missionid, String pilotid, String status) throws SQLException, Exception {
        try {
            conn = MyConnection.makeConnection();
            if (conn != null) {
                String sql = "update tbl_MissionDetail set OwnStatus = ? where MissionId = ? and PilotId = ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, status);
                stm.setString(2, missionid);
                stm.setString(3, pilotid);
                if (stm.executeUpdate() > 0) {
                    return true;
                }
            }
        } finally {
            closeConnect();
        }
        return false;
    }
    
    
    public boolean checkMissionFinish(String missionId) throws Exception{
        try {
            conn = MyConnection.makeConnection();
            if (conn != null) {
                String sql = "select OwnStatus from tbl_MissionDetail where MissionId = ? and OwnStatus = ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, missionId); 
                stm.setString(2, "PROCESSING");
                rs = stm.executeQuery();
                if(rs.next()) {
                    System.out.println("mission chua xong");
                    return false;
                }
            }
        } finally {
            closeConnect();
        } 
        return true;
    }
    private List<String> listStatus;

    public List<String> getListStatus() {
        return listStatus;
    }
    public void showListStatus(String missiionId) throws SQLException, Exception{
        try {
            conn = MyConnection.makeConnection();
            if (conn != null) {
                String sql = "select OwnStatus from tbl_MissionDetail where MissionId = ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, missiionId); 
                rs = stm.executeQuery();
                while (rs.next()) {
                    
                    if (listStatus == null) {
                        listStatus = new ArrayList();
                    }
                    System.out.println("get MissionDetail status process: get OwnStatus = " + rs.getString("OwnStatus"));
                    listStatus.add(rs.getString("OwnStatus"));
                }
            }
        } finally {
            closeConnect();
        } 
    }
}
