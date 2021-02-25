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
       Facility facility = new Facility();

        System.out.println("Hello World!");
        System.out.println(facility.listFacilities());
        System.out.println(facility.getFacilityInformation(3));

        
    }
}
