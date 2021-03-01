package adamSmithComp373Proj1;

import adamSmithComp373Proj1.Domain.*;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
       Facility facility = new Facility(1);
        System.out.println(facility.getFacilityInformation());
        System.out.println(facility.getName());
        System.out.println(facility.getLocation());
        //System.out.println("Hello World!");
        System.out.println(facility.getOccupiedRooms());
        System.out.println(facility.listFacilities());
        //facility.addNewFacility("Interface Insert Test", "6533 N Newgard Avenue, Chicago, IL 60626", "9062039222", 15);\
        //System.out.println(facility.getNumberOfRooms());
        System.out.println(facility.requestAvailableCapacity());
        //facility.addOccupiedRoom();
        //facility.addOccupiedRoom();
        //facility.addOccupiedRoom();
        //facility.addOccupiedRoom();
        //facility.voidOccupiedRoom();
        //facility.voidOccupiedRoom();
        //facility.voidOccupiedRoom();
        //FacilityMaintainence main = new FacilityMaintainence();    
    }
}
