package adamSmithComp373Proj1.DomainTest;
import adamSmithComp373Proj1.Domain.Facility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class FacilityTest {
    /**
     * Rigorous Test.
     * 
     */
    
    Facility testFacility = new Facility(2);

    //Main Functionality Tests 2
    @Test
    void mainFunctionalities(){
        assertEquals("[Adam Test 1 - id: 1, Adam Set Test 1 - id: 2, Adam Unit Test 2 - id: 4]", testFacility.listFacilities().toString());
        testFacility.addNewFacility("Adam Test 3", "112 9th Avenue, New York, NY 10011", "8473901289", 12);
        assertEquals("[Adam Test 1 - id: 1, Adam Set Test 1 - id: 2, Adam Unit Test 2 - id: 4, Adam Test 3 - id: 14]", testFacility.listFacilities().toString());   
        Facility testFacility2  = new Facility(14);
        assertEquals(12, testFacility2.requestAvailableCapacity());
        testFacility2.removeFacility();
        assertEquals("[Adam Test 1 - id: 1, Adam Set Test 1 - id: 2, Adam Unit Test 2 - id: 4]", testFacility.listFacilities().toString());   
    }



        //Occupied Room Tests
        @Test
        void OccupiedRoomTests() {
            testFacility.addOccupiedRoom();
            assertEquals(1, testFacility.getOccupiedRooms());
            testFacility.addOccupiedRoom();
            assertEquals(2, testFacility.getOccupiedRooms());
            testFacility.addOccupiedRoom();
            assertEquals(3, testFacility.getOccupiedRooms());
            testFacility.addOccupiedRoom();
            assertEquals(3, testFacility.getOccupiedRooms());
            testFacility.voidOccupiedRoom();
            assertEquals(2, testFacility.getOccupiedRooms());
            testFacility.voidOccupiedRoom();
            assertEquals(1, testFacility.getOccupiedRooms());
            testFacility.voidOccupiedRoom();
            assertEquals(0, testFacility.getOccupiedRooms());
            testFacility.voidOccupiedRoom();
            assertEquals(0, testFacility.getOccupiedRooms());
        }

        //Get Set Tests
        @Test
        void getSetTests() {
            testFacility.setName("Adam Set Test 1");
            assertEquals("Adam Set Test 1", testFacility.getName());
            testFacility.setLocation("1111 W Sheridan Ave, Chicago, IL 60626");
            assertEquals("1111 W Sheridan Ave, Chicago, IL 60626", testFacility.getLocation());
            testFacility.setPhone("1111111111");
            assertEquals("1111111111", testFacility.getPhone());
            testFacility.setNumberOfRooms(3);
            assertEquals(3, testFacility.getNumberOfRooms());
        }

        



        //Second Round of Testing




        Facility UnitTestFac = new Facility(4);





        //Main Functionality Tests 2
        @Test
        void mainFunctionalities2(){
            assertEquals("[Adam Test 1 - id: 1, Adam Set Test 1 - id: 2, Adam Unit Test 2 - id: 4]", UnitTestFac.listFacilities().toString());
            UnitTestFac.addNewFacility("Adam Test 4", "112 9th Avenue, New York, NY 10011", "8473901289", 12);
            assertEquals("[Adam Test 1 - id: 1, Adam Set Test 1 - id: 2, Adam Unit Test 2 - id: 4, Adam Test 4 - id: 15]", UnitTestFac.listFacilities().toString());   
            Facility UnitTestFac2  = new Facility(15);
            assertEquals(12, UnitTestFac2.requestAvailableCapacity());
            UnitTestFac2.removeFacility();
            assertEquals("[Adam Test 1 - id: 1, Adam Set Test 1 - id: 2, Adam Unit Test 2 - id: 4]", testFacility.listFacilities().toString());   
        }
    
    


            //Occupied Room Tests 2
            @Test
            void OccupiedRoomTests2() {
                UnitTestFac.addOccupiedRoom();
                assertEquals(1, UnitTestFac.getOccupiedRooms());
                UnitTestFac.addOccupiedRoom();
                assertEquals(2, UnitTestFac.getOccupiedRooms());
                UnitTestFac.addOccupiedRoom();
                assertEquals(3, UnitTestFac.getOccupiedRooms());
                UnitTestFac.addOccupiedRoom();
                assertEquals(3, UnitTestFac.getOccupiedRooms());
                UnitTestFac.voidOccupiedRoom();
                assertEquals(2, UnitTestFac.getOccupiedRooms());
                UnitTestFac.voidOccupiedRoom();
                assertEquals(1, UnitTestFac.getOccupiedRooms());
                UnitTestFac.voidOccupiedRoom();
                assertEquals(0, UnitTestFac.getOccupiedRooms());
                UnitTestFac.voidOccupiedRoom();
                assertEquals(0, UnitTestFac.getOccupiedRooms());
            }
    
            //Get Set Tests 2
            @Test
            void getSetTests2() {
                UnitTestFac.setName("Adam Unit Test 2");
                assertEquals("Adam Unit Test 2", UnitTestFac.getName());
                UnitTestFac.setLocation("2222 W Sheridan Ave, Chicago, IL 60626");
                assertEquals("2222 W Sheridan Ave, Chicago, IL 60626", UnitTestFac.getLocation());
                UnitTestFac.setPhone("1111211111");
                assertEquals("1111211111", UnitTestFac.getPhone());
                UnitTestFac.setNumberOfRooms(3);
                assertEquals(3, UnitTestFac.getNumberOfRooms());
            }
    


    }

