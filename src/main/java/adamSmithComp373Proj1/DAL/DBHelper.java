package adamSmithComp373Proj1.DAL;
import java.sql.*;

public class DBHelper {
    
    public static Connection formConnection(){  
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net:3306/sql3395846", "sql3395846", "IV4NBJnb8F");
        } catch(Exception e){
            System.out.println(e.toString());
        }
        return con;
    }
}

