package intranet.chat;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnect {
    
            String url = "jdbc:mysql://localhost/alldata";
            String user = "root";
            String password = "";
            
       private Connection con = null;
       private PreparedStatement pre = null;
       private ResultSet rs = null;
            
            DBConnect(){
                
                try {
                    con = DriverManager.getConnection(url,user,password);
                    
                } catch (SQLException ex) {
                    
                }
                
            }

    public Connection getCon() {
        return con;
    }

    public PreparedStatement getPre() {
        return pre;
    }

    public ResultSet getRs() {
        return rs;
    }
            
            
            
            
            
            
            
                    
            
            
  

    
}
