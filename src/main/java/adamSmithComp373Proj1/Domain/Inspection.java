package adamSmithComp373Proj1.Domain;
import adamSmithComp373Proj1.DAL.InspectionDAO;
import adamSmithComp373Proj1.Domain.Facility;

public enum Type{TYPE, TYPE2, TYPE3}

public class Inspection {
    
    private InspectionDAO Conn = new InspectionDAO();
    private Integer InspectionID;
    private String Name = Conn.getName();
    private Type InsType = Conn.getType();
    private String Details = Conn.getDetails();
    private Integer facility = Conn.getFacility().getID();
    private Integer Room = Conn.getRoom();
    


    
    public addInspection(){
        
    }



    public String getName(){
        return this.Name;
    }

    public Type getType(){
        return this.InsType;
    }

    public String getDetails(){
        return this.Details;
    }

    public Integer getFacility(){
        return this.facility;
    }

    public Integer getRoom(){
        return this.Room;
    }

    public void setName(){

    }

    public void setType(){
        
    }

    public void setDetails(){
        
    }

    public void setFacility(){
        
    }

    public void setRoom(){
        
    }


}
