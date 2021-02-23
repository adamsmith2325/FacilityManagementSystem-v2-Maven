package Domain;

import adamSmithComp373Proj1.DAL.FacilityDAO;
import java.util.ArrayList;

public class Facility {
 
    Integer id;
    String Name;



    public ArrayList<String> listFacilities(){
        FacilityDAO Connection  = new FacilityDAO();
        ArrayList<String> facilitiesList = Connection.listFacilities();
        return facilitiesList;
    }

    public Object getFacilityInformation(){

    }

    public Object requestAvailableCapacity(){

    }

    public Object addNewFacility(){

    }

    public Object removeFacility(){
        
    }

}

