/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranghht.dbconn;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author VS9 X64Bit
 */
public class MyConnection implements Serializable{
    public static Connection makeConnection()throws Exception{
        Connection conn = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Project_PRJ321";
        conn = DriverManager.getConnection(url, "sa", "nagatoyuki");
        return conn;
    }
}
