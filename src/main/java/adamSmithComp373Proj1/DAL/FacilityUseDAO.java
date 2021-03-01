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

        this.dateStarted = dateStarted;
    }

    public Date getDateEnded() {

        return dateEnded;
    }

    public void setDateEnded(Date dateEnded) {

        this.dateEnded = dateEnded;
    }

    public int getUseID() {
        
        return useID;
    }
    public void setUseID(int useID) {
        
        this.useID = useID;
    }

    public Facility getFacility() {

        return facility;
    }

    public int getLocationID() {

        return locationID;
    }

    public void setLocationID(int locationID) {

        this.locationID = locationID;
    }

    public void setFacility(Integer facilityID) {

        this.facility = facility;
    }

    public int getRoomID() {

        return roomID;
    }

    public void setRoomID(int facID) {

        this.roomID = facID;
    }
}
