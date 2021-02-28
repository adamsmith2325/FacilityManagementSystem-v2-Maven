package adamSmithComp373Proj1.Domain;
import adamSmithComp373Proj1.DAL.FacilityDAO;

import java.util.ArrayList;

public class Facility {
    
    //Required Class Attributes
    private FacilityDAO Connection  = new FacilityDAO();
    private Integer FacilityID;
    private String Name = Connection.getName(this.FacilityID);
    private String Location = Connection.getLocation(this.FacilityID);
    private String phoneNumber = Connection.getPhone(this.FacilityID);
    private Integer numOfRooms = Connection.getNumberOfRooms(this.FacilityID);
    public Integer OccupiedRooms = Connection.getOccupiedRooms(this.FacilityID);


    public Facility(Integer ID){
        this.FacilityID = ID;
    }

    //Misc. Relevant Methods

    public ArrayList<String> listFacilities(){
        ArrayList<String> facilitiesList = Connection.listFacilities();
        return facilitiesList;
    }

    public ArrayList<String> getFacilityInformation(){
        ArrayList<String> facilityInfo = Connection.getFacilityDetails(this.FacilityID);
        return facilityInfo;
    }

    

    public Integer requestAvailableCapacity(){
        Integer Occupied = Connection.getOccupiedRooms(this.FacilityID);
        Integer totalRooms = Connection.getNumberOfRooms(this.FacilityID);
        Integer capacity = totalRooms - Occupied;
        
        return capacity;
    }




    public void addNewFacility(String addName, String addLocation, String addPhone, Integer addNumOfRooms){
        Connection.addNewFacility(addName, addLocation, addPhone, addNumOfRooms);
        System.out.println(addName + " has been added to the list of facilities");
    }

    public void removeFacility(){
        Connection.removeFacility(this.FacilityID);
    }

    
    //Get functionalities

    public String getName(){
        return Connection.getName(this.FacilityID);
    }

    public String getLocation(){
        return Connection.getLocation(this.FacilityID);
    }

    public String getPhone(){
        return Connection.getPhone(this.FacilityID);
    }

    public Integer getNumberOfRooms(){
        return Connection.getNumberOfRooms(this.FacilityID);
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

    public Integer getOccupiedRooms(){
        return Connection.getOccupiedRooms(this.FacilityID);
    }


    public void addOccupiedRoom(){
        if (Connection.getNumberOfRooms(this.FacilityID) - Connection.getOccupiedRooms(this.FacilityID) > 0){
        Connection.updateOccupiedRooms(1, this.FacilityID);
        } else {
            System.out.println("There is no more capacity");
        }
    }

    public void voidOccupiedRoom(){
        if ((Connection.getOccupiedRooms(this.FacilityID) == 0) || (Connection.getOccupiedRooms(this.FacilityID) < 0)){
            System.out.println("There are no occupied rooms, all rooms are available");
        } else {
            Connection.updateOccupiedRooms(-1, this.FacilityID);
        }
    }




    public static void main(String args[]){

    }




















}

