package adamSmithComp373Proj1.Domain;
import adamSmithComp373Proj1.DAL.InspectionDAO;
import adamSmithComp373Proj1.Domain.Facility;

public enum Type{TYPE, TYPE2, TYPE3}

public class FacilityInspection{

    //attributes needed
    private int inspectionID;
    private int facilityID;
    private String inspection_type;
    private String inspection_detail;
    private Facility facility;


//Still need to edit
    public Facility getFacility() {
        return facility;
    }
    public void setFacility(Facility facility) {
        this.facility = facility;
    }
    public int getFacilityID() {
        return facilityID;
    }
    public void setFacilityID(int facilityID) {
        this.facilityID = facilityID;
    }
    public String getInspection_type() {
        return inspection_type;
    }
    public void setInspection_type(String inspection_type) {
        this.inspection_type = inspection_type;
    }
    public String getInspection_detail() {
        return inspection_detail;
    }
    public void setInspection_detail(String inspection_detail) {
        this.inspection_detail = inspection_detail;
    }
    public int getInspectionID() {
        return inspectionID;
    }
    public void setInspectionID(int inspectionID) {
        this.inspectionID = inspectionID;
    }
}
