package adamSmithComp373Proj1.Domain;
import adamSmithComp373Proj1.DAL.FacilityDAO;

import java.sql.Connection;
import java.util.ArrayList;

public class Facility {
 
    //Required Class Attributes
    private Integer FacilityID;
    private String Name;
    private String Location;
    private Integer phoneNumber;
    private Integer numOfRooms;
    private FacilityDAO Connection  = new FacilityDAO();



    //Misc. Relevant Methods

    public ArrayList<String> listFacilities(){
        ArrayList<String> facilitiesList = Connection.listFacilities();
        return facilitiesList;
    }

    public ArrayList<String> getFacilityInformation(){
        ArrayList<String> facilityInfo = Connection.getFacilityDetails(this.FacilityID);
        return facilityInfo;
    }

    public Object requestAvailableCapacity(){

    }

    public void addNewFacility(String addName, String addLocation, Integer addPhone, Integer addNumOfRooms){
        Connection.addNewFacility(addName, addLocation, addPhone, addNumOfRooms);
        System.out.println(addName + " has been added to the list of facilities");
    }

    public void removeFacility(Integer RemovalID){
        Connection.removeFacility(RemovalID);
        System.out.println("Facility Number: " + RemovalID + " has been added to the list of facilities");
    }

    
    //Get functionalities
    
    public String getName(){
        return Connection.getName(this.FacilityID);
    }

    public String getLocation(){
        return Connection.getLocation(this.FacilityID);
    }

    public Integer getPhone(){
        return Connection.getPhone(this.FacilityID);
    }

    public Integer getNumberOfRooms(){
        return Connection.getNumberOfRooms(this.FacilityID);
    }



    //Set functionalities

    public void setName(){
        return Connection.setName(this.FacilityID);
    }

    public void setLocation(){
        return Connection.setLocation(this.FacilityID);
    }

    public void setPhone(){
        return Connection.setPhone(this.FacilityID);
    }

    public void setNumberOfRooms(){
        return Connection.setNumberOfRooms(this.FacilityID);
    }


}