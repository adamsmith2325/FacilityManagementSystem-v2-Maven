package adamSmithComp373Proj1.DAL;
import adamSmithComp373Proj1.Domain.Facility;
import adamSmithComp373Proj1.Domain.Type;
import java.sql.*;

public class InspectionDAO {
    
    private static DBHelper DB = new DBHelper();

    private static Connection con = DB.formConnection();


    public int getInspectionID() {
        Integer returnInt = null;
        try{
            Statement stmt=con.createStatement();
            String query = "get Inspection ID = "+ getInspectionID();

            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                returnInt = rs.getInt(1);
            }

            }catch(Exception e){
                System.out.println(e.toString());
            }

            return returnInt;
    }
    public void addInspectionID(int inspectionID) {
        try{
            Statement stmt=con.createStatement();
            String query = "UPDATE facilities " + "Update inspection ID = " + "'" +  inspectionID + "'";
            Integer rs=stmt.executeUpdate(query);
            System.out.println("Facility " +  "Inspection ID has been updated");
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }

    public String getName() {
        return this.Name;
    }
    public Type getType() {
        return this.InsType;
    }
    public String getDetails() {
        return this.Details;
    }
    public int getFacility() {
        Integer returnInt = null;
        try{
            Statement stmt=con.createStatement();
            String query = "get Facility = "+ getFacility();

            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                returnInt = rs.getInt(1);
            }

            }catch(Exception e){
                System.out.println(e.toString());
            }

            return returnInt;
    }

    public Integer getRoom(){
        Integer returnInt = null;
        try{
            Statement stmt=con.createStatement();
            String query = "get useID = "+ getRoom();

            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                returnInt = rs.getInt(1);
            }

            }catch(Exception e){
                System.out.println(e.toString());
            }

            return returnInt;
    }
    public void setRoom(int InspectionID){
        try{
            Statement stmt=con.createStatement();
            String query = "UPDATE facilities " + "Update inspection ID = " + "'" +  InspectionID; + "'";
            Integer rs=stmt.executeUpdate(query);
            System.out.println("Facility " +  "Inspection ID has been updated");
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }

    public void setFacility(Facility facility) {
        try{
            Statement stmt=con.createStatement();
            String query = "UPDATE facilities " + "'" +  facility ;
            Integer rs=stmt.executeUpdate(query);
            System.out.println("Facility has been updated");
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }

    public void setFacility(Integer FacilityID) {

        try{
            Statement stmt=con.createStatement();
            String query = "UPDATE facilities " + "'" +  FacilityID ;
            Integer rs=stmt.executeUpdate(query);
            System.out.println("Facility has been updated");
        }catch(Exception e){
            System.out.println(e.toString());
        }

    }

    public void setType(String InsType) {
        try{
            Statement stmt=con.createStatement();
            String query = "UPDATE Inspection Type " + "'" +  InsType ;
            Integer rs=stmt.executeUpdate(query);
            System.out.println("Inspection type has been updated");
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    public void setDetails(String insDetails) {
        try{
            Statement stmt=con.createStatement();
            String query = "UPDATE Inspection Details " + "'" +  insDetails ;
            Integer rs=stmt.executeUpdate(query);
            System.out.println("Inspection details have been updated");
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }

	public int getInspectionID(Integer inspectionID) {
		Integer returnInt = null;
        try{
            Statement stmt=con.createStatement();
            String query = "get Inspection ID = "+ getInspectionID();

            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                returnInt = rs.getInt(1);
            }

            }catch(Exception e){
                System.out.println(e.toString());
            }

            return returnInt;
	}

	public Object addInspectionID(Integer inspectionID) {
		return null;
	}

	public void setInspection(Type insType) {
        try{
            Statement stmt=con.createStatement();
            String query = "UPDATE Inspection Type " + "'" +  insType ;
            Integer rs=stmt.executeUpdate(query);
            System.out.println("Inspection Type has been updated");
        }catch(Exception e){
            System.out.println(e.toString());
        }
	}

	public int getFacility(Integer inspectionID) {
		Integer returnInt = null;
        try{
            Statement stmt=con.createStatement();
            String query = "get Facility = "+ getFacility();

            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                returnInt = rs.getInt(1);
            }

            }catch(Exception e){
                System.out.println(e.toString());
            }

            return returnInt;
	}



}
