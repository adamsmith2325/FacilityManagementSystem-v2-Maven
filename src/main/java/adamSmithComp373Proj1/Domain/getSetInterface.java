package adamSmithComp373Proj1.Domain;

public interface getSetInterface {
    


//Get functionalities
public Integer getID(){
    return this.FacilityID;
 }


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


}
