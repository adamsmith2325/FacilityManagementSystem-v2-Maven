package adamSmithComp373Proj1.DAL;

import java.sql.*;


public class FacilityUseDAO {

    private static DBHelper DB = new DBHelper();

    private static Connection con = DB.formConnection();

    public Date getDateStarted(Integer SearchID) {
        Date returnString = null;
        try{
            Statement stmt=con.createStatement();
            String query = "select dateStarted from uses where useID = "+ SearchID;

            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                returnString = rs.getDate(1);
            }

            }catch(Exception e){
                System.out.println(e.toString());
            }

            return returnString;

    }

    public void setDateStarted(Date dateStarted) {
        try{ 
            Statement stmt=con.createStatement();      
            String query = "UPDATE facilities " + "Update date = " + "'" +  dateStarted + "'";
            Integer rs=stmt.executeUpdate(query);
            System.out.println("Facility " +  "date has been updated");
        }catch(Exception e){ 
            System.out.println(e.toString());
        }
    }

    public Date getDateEnded() {
        Date returnString = null;
        try{
            Statement stmt=con.createStatement();
            String query = "select dateEnded from uses where useID = "+ getDateEnded();

            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                returnString = rs.getDate(1);
            }

            }catch(Exception e){
                System.out.println(e.toString());
            }

            return returnString;
    }

    public void setDateEnded(Date dateEnded) {
        try{ 
            Statement stmt=con.createStatement();      
            String query = "UPDATE facilities " + "Update date = ";
            Integer rs=stmt.executeUpdate(query);
            System.out.println("Facility " +  "date has been updated");
        }catch(Exception e){ 
            System.out.println(e.toString());
        }
    }

    public int getUseID() {
        Integer returnInt = null;
        try{
            Statement stmt=con.createStatement();
            String query = "get useID = "+ getUseID();

            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                returnInt = rs.getInt(1);
            }

            }catch(Exception e){
                System.out.println(e.toString());
            }

            return returnInt;
    }
    public void setUseID(int useID) {

        try{ 
            Statement stmt=con.createStatement();      
            String query = "UPDATE facilities " + "Update USEID = " + "'" +  useID ;
            Integer rs=stmt.executeUpdate(query);
            System.out.println("Facility " +  "date has been updated");
        }catch(Exception e){ 
            System.out.println(e.toString());
        }
    }

    public Integer getFacility() {

        Integer returnInt = null;
        try{
            Statement stmt=con.createStatement();
            String query = "get Facility = "+ getFacility();

            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                returnInt = rs.getInt(1);
            }

            }catch(Exception e){
                System.out.println(e.toString());
            }

            return returnInt;
    }


    public void setFacility(Integer facilityID) {

        try{ 
            Statement stmt=con.createStatement();      
            String query = "UPDATE facilities " + "Set Facility = " + "'" +  facilityID + "'";
            Integer rs=stmt.executeUpdate(query);
            System.out.println("Facility has been set");
        }catch(Exception e){ 
            System.out.println(e.toString());
        }
    }

    public int getRoomID() {

        return roomID;
    }

    public void setRoomID(int facID) {
        try{ 
            Statement stmt=con.createStatement();      
            String query = "UPDATE facilities " + "Room number set = " + "'" +  facID + "'" ;
            Integer rs=stmt.executeUpdate(query);
            System.out.println("Facility " +  "Room number set");
        }catch(Exception e){ 
            System.out.println(e.toString());
        }
    }

	public Date dateEnded(int useID) {
		return null;
	}
}
