package adamSmithComp373Proj1.Domain;
import adamSmithComp373Proj1.DAL.FacilityDAO;

import java.sql.Connection;
import java.util.ArrayList;

public class Facility {
 
    //Required Class Attributes
    private FacilityDAO Connection  = new FacilityDAO();
    private Integer FacilityID;
    private String Name = Connection.getName(this.FacilityID);
    private String Location = Connection.getLocation(this.FacilityID);
    private String phoneNumber = Connection.getPhone(this.FacilityID);
    private Integer numOfRooms = Connection.getNumberOfRooms(this.FacilityID);;
   
    private ArrayList<Integer> OccupiedRoomsList = ;


    //Misc. Relevant Methods

    public ArrayList<String> listFacilities(){
        ArrayList<String> facilitiesList = Connection.listFacilities();
        return facilitiesList;
    }

    public ArrayList<String> getFacilityInformation(){
        ArrayList<String> facilityInfo = Connection.getFacilityDetails(this.FacilityID);
        return facilityInfo;
    }

    public ArrayList<Integer> requestAvailableCapacity(){
        
        ArrayList<Integer> availableRooms;
        availableRooms = new ArrayList<Integer>();
        
        for(Integer i = 1; i < numOfRooms+1; i++){
            if(!OccupiedRoomsList.contains(i)){
                availableRooms.add(i);
            }
        }
        return availableRooms;
    }

    public void addNewFacility(String addName, String addLocation, String addPhone, Integer addNumOfRooms){
        Connection.addNewFacility(addName, addLocation, addPhone, addNumOfRooms);
        System.out.println(addName + " has been added to the list of facilities");
    }

    public void removeFacility(){
        Connection.removeFacility(this.FacilityID);
    }

    
    //Get functionalities
    public Integer getID(){
       return this.FacilityID;
    }


    public String getName(){
        return this.Name;
    }

    public String getLocation(){
        return this.Location;
    }

    public String getPhone(){
        return this.phoneNumber;
    }

    public Integer getNumberOfRooms(){
        return this.numOfRooms;
    }



    //Set functionalities

    public void setName(String newName){
        Connection.setName(this.FacilityID, newName);
    }

    public void setLocation(String newLocation){
        Connection.setLocation(this.FacilityID, newLocation);
    }

    public void setPhone(String newPhone){
        Connection.setPhone(this.FacilityID, newPhone);
    }

    public void setNumberOfRooms(Integer newRoomsNum){
        Connection.setNumberOfRooms(this.FacilityID,  newRoomsNum);
    }


    //Occupany Methods

    public void addFacilityUse(){
        //OccupiedRoomsList
    }

    public void voidFacilityUse(){
        //OccupiedRoomsList
    }
}