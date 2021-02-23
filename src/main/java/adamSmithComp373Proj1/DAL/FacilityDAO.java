package adamSmithComp373Proj1.DAL;
import java.sql.*;
import io.github.cdimascio.dotenv.Dotenv;
import java.util.ArrayList;


public class FacilityDAO {
    
    Dotenv dotenv = Dotenv.load();
    String  DBUser = dotenv.get("DATABASE_USERNAME");
    String  DBPass = dotenv.get("DATABASE_PASSWORD");
    


    public static Integer getFacilityID(String Name){
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/facilitymanagementsystem", "root", "root");  
            Statement stmt=con.createStatement();  
            
            String query = "select * from facilities where Name = " + "'" + Name + "'";
            
            ResultSet rs=stmt.executeQuery(query);  
            Integer facilityID = null;
            while(rs.next())  
                facilityID = rs.getInt(1);  
            con.close();   
            return facilityID;

        }catch(Exception e){ 
            System.out.println(e);
            return 999999;
            }  
        }

    


        public static String getFacilityName(Integer Id){
            try{  
                Class.forName("com.mysql.jdbc.Driver");  
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/facilitymanagementsystem", "root", "root");  
                Statement stmt=con.createStatement();  
                
                String query = "select * from facilities where idFacilities = " + Id;
                
                ResultSet rs=stmt.executeQuery(query);  
                String facilityName = null;
                while(rs.next())  
                    facilityName = rs.getString(2);  
                con.close();   
                return facilityName;
    
            }catch(Exception e){ 
                System.out.println(e);
                return e.toString();
                }  
            }


            public static ArrayList<String> listFacilities(){
                
                ArrayList<String> allFacilities = new ArrayList<String>();

                try{  
                    Class.forName("com.mysql.jdbc.Driver");  
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/facilitymanagementsystem", "root", "root");  
                    Statement stmt=con.createStatement();  
                    
                    String query = "select * from facilities";
                    
                    ResultSet rs=stmt.executeQuery(query);  
                    
                    while(rs.next())  
                        allFacilities.add(rs.getString(2));
                    con.close();   
                    return allFacilities;
        
                }catch(Exception e){ 
                    allFacilities.add("Error");
                    return allFacilities;
                    }  
                }




        public static void main(String args[]){
            System.out.println(getFacilityID("Test 2"));
            System.out.println(getFacilityName(3));
        }

    }

    