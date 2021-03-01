package adamSmithComp373Proj1.Domain;
import adamSmithComp373Proj1.Domain.*;
import adamSmithComp373Proj1.DAL.*;
import java.time.format.DateTimeFormatter;  
import java.sql.Date;
import java.time.LocalDate;

/*  */

public class FacilityUse {


   LocalDate today = LocalDate.now();

    private int useID;
    private static FacilityUseDAO Connection = new FacilityUseDAO();
    private Facility facility  = Connection.getFacility(this.useID);
    private Date dateStarted = Connection.getDateStarted(this.useID);
    private Date dateEnded  = Connection.getDateEnded(this.useID);
    private int roomID  = Connection.getRoomID(this.useID);
    

    public FacilityUse(Integer ID){
        this.useID = ID;
    }

    public Date getDateStarted() {

        return Connection.getDateStarted(this.useID);
    }

    public void setDateStarted(Date dateStarted) {

        this.dateStarted = dateStarted;
    }

    public Date getDateEnded() {

        return Connection.getDateEnded(this.useID);
    }

    public void setDateEnded(Date dateEnded) {
        Connection.setDateEnded(this.dateEnded);
    }

    public int getUseID() {
        
        return useID;
    }
    public void setUseID(int useID) {
        
        Connection.setUseID(this.useID);
    }

    public Facility getFacility() {

        return facility;
    }

    public void setFacility(Integer FacilityID) {
        Facility facility = new Facility(FacilityID);
        
        if ((Connection.getDateStarted(this.useID) <= today) && (Connection.getDateEnded(this.useID) >= today)){
            facility.addOccupiedRoom();
        }
        
        Connection.setFacility(FacilityID);
        
    }

    public int getRoomID(Integer roomID) {
        Connection.getRoomID(this.roomID);
        return roomID;
    }

    public void setRoomID(int facID) {
        Connection.setRoomID(this.useID);
    }

}
