# FMS-v2-Comp-373-Maven
 
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
o public object listFacilities ()
o public object getFacilityInformation()
o public object requestAvailableCapacity() o public object addNewFacility()
o public void addFacilityDetail()
o public object removeFacility()
- Facility Use: o public o public o public o public o public o public
object isInUseDuringInterval() object assignFacilityToUse() object vacateFacility()
object listInspections()
object listActualUsage() object calcUsageRate()
- Facility Maintenance:
o public object makeFacilityMaintRequest() o public object scheduleMaintenance()
o public object calcMaintenanceCostForFacility() o public object calcProblemRateForFacility()
o public object calcDownTimeForFacility()
o public object listMaintRequests()
o public object listMaintenance()
o public object listFacilityProblems()
