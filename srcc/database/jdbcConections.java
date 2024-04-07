package database;
import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;


public class jdbcConections {
    public static Connection getConnections(){
        Connection c=null;
        
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//            cac thong so 
            String url="jdbc:mysql://localhost:3306/phong_hop";
            String username="root";
            String password="123456789";
            
//           tao ket noi
            c = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    return c;
    }
    public static void closeConnection(Connection c){
        try {
            if(c!=null){
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
