package adamSmithComp373Proj1.Domain;
import adamSmithComp373Proj1.DAL.FacilityDAO;

import java.sql.Connection;
import java.util.ArrayList;

public class Facility {
 
    private Integer FacilityID;
    private String Name;
    
    private FacilityDAO Connection  = new FacilityDAO();


    public ArrayList<String> listFacilities(){
        ArrayList<String> facilitiesList = Connection.listFacilities();
        return facilitiesList;
    }

    public ArrayList<String> getFacilityInformation(Integer SearchID){
        ArrayList<String> facilityInfo = Connection.getFacilityDetails(SearchID);
        return facilityInfo;
    }

    public Object requestAvailableCapacity(){

    }

    public Object addNewFacility(){
        
    }

    public Object removeFacility(){
        
    }


}


