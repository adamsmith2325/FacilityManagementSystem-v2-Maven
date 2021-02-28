package adamSmithComp373Proj1.DAL;
import java.sql.*;

public class DBHelper {
    
    public static Connection formConnection(){  
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/facilitymanagementsystem", "root", "root");
        } catch(Exception e){
            System.out.println(e.toString());
        }
        return con;
    }
}

