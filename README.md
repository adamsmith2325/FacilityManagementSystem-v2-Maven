# FMS-v2-Comp-373-Maven
 Teammates include: Adam Smith, Neha Patel, and Saira Bano


## Running Tests
In FacilityTest: Please update the Facility ID of the new facility created after every testing session. If you do not, those tests will fail as the added facility will be created under a different ID and will not fulfill the delete portion of the Main Functionalities Tests

## To access the database
Download MySQL Workbench, enter creds from the DBHelper class, then test and save the connection.

## Manual Testing and Running Locally
Please run all non-unit testing from the client interface App.java class


## Project Description:
Project 1: Facility Management System Design and Implementation

In this project, we will start providing an object domain model for Facility Management System by addressing the design and implementation using OOP. The aim is to have a domain model that is designed using OOP that will be used to study Object relationship and Dependency.

Based on the specification provided for a Facility Management System:

– Identify the main entitles of the problem domain.

– Identify their attributes.

– Identify their relationships.

– Identify their roles and responsibilities.

– Discover other objects that facilitate implementing responsibilities.

– Make available all client interfaces/services specified in the specification document (Facility, Facility Use, and Facility Maintenance Client Interfaces).

### Supporting Documents:
 - Requirement - Facility Management System Specification Document.
 
 - Object Modeling (http://www.ibm.com/developerworks/rational/library/content/RationalEdge/sep04/bell/.
 
 - A UML Modeling tool for documentation.
 
#### Project Expectation:
- Group (only two to three students in a group) executed project.

- Submission of Design and Code.

- (Optional) Submission of your DB table structure/model.


###### Project Submission and Grading:
- 20% of total grade.

- Submit the UML model of the Domain Model.

- Submit the location of your solution for the implementation.
   - Code structure using Layered Architectural Style.
   - Unit test as well as client tests that you used to test your system.
   
 - Submit both to TA and Instructor.

###### Project Due Date:
- Submission of Design and Implementation - EOD 03/01/2021.

###### Client Interfaces:

-  Facility:
  - public object listFacilities ()
  - public object getFacilityInformation()
  - public object requestAvailableCapacity() 
  - public object addNewFacility()
  - public void addFacilityDetail()
  - public object removeFacility()
- Facility Use: 
 - public object isInUseDuringInterval()
 - public object assignFacilityToUse()
 - public object vacateFacility()
 - public object listInspections()
 - public object listActualUsage() 
 - public object calcUsageRate()
- Facility Maintenance:
 - public object makeFacilityMaintRequest() 
 - public object scheduleMaintenance()
 - public object calcMaintenanceCostForFacility() 
 - public object calcProblemRateForFacility()
 - public object calcDownTimeForFacility()
 - public object listMaintRequests()
 - public object listMaintenance()
 - public object listFacilityProblems()
