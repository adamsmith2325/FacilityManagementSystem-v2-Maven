package adamSmithComp373Proj1.DAL;
import java.sql.*;  




public class DBConnectionTest {
    
    
    
    public static void main(String args[]){  
        try{  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net:3306/sql3395846", "sql3395846", "IV4NBJnb8F");  
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from facilities");  
        while(rs.next())  
        System.out.println(rs.getInt(1) + " - " + rs.getString(2));  
        con.close();  
        }catch(Exception e){ System.out.println(e);}  
        }  
}