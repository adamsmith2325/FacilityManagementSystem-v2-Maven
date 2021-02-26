package adamSmithComp373Proj1.DAL;
import java.sql.*;

public class DBHelper {
    
    public static Statement formConnection(){  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/facilitymanagementsystem", "root", "root");  
        Statement stmt = con.createStatement();  
        return stmt;
    }
}