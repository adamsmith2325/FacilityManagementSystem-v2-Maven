package adamSmithComp373Proj1.DAL;
import io.github.cdimascio.dotenv.Dotenv;
import java.sql.*;  




public class DBConnectionTest {
    
    Dotenv dotenv = Dotenv.load();
    String DBUser = dotenv.get("DATABASE_USERNAME");
    String DBPass = dotenv.get("DATABASE_PASSWORD");
    
    
    
    
    public static void main(String args[]){  
        try{  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/facilitymanagementsystem", "root", "root");  
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from facilities");  
        while(rs.next())  
        System.out.println(rs.getInt(1) + " - " + rs.getString(2));  
        con.close();  
        }catch(Exception e){ System.out.println(e);}  
        }  
}