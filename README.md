# Fleet Tracker
---

#### Design Document

- Adam Bockhorst

- Ethan Finch

- Isaac Kwizera

- Steven Falconieri


## Introduction

An Airline’s Operations Control Center has the difficult task of not only keeping track of their fleets, but also monitoring the serviceability and maintenance status of each aircraft.  Fleet tracker is a web-based application that makes it easy for airlines to track the current status and availability of their fleet of aircraft.  The tool provides a dashboard view of the fleet, which indicates details for each aircraft such as, aircraft registration, location, and maintenance status/expected return to service.  For Airlines that use more than one operator or sub-contract service, Fleet Tracker can also support the use of 1 or more sub fleets. 

## Storyboard

![Picture5](https://user-images.githubusercontent.com/82166772/217597169-b7fde1f4-ee17-46a1-a8b5-c465cacbdb88.png)  

![Picture6](https://user-images.githubusercontent.com/82166772/217597195-fce1e5aa-fb67-44c3-aae7-916009e5de01.png)  

![Picture7](https://user-images.githubusercontent.com/82166772/217597226-3249c1aa-aa3b-4371-9052-434aab95decb.png)  

![Picture8](https://user-images.githubusercontent.com/82166772/217597246-b849f2b8-a409-468c-a3b8-d75a02c22e8d.png)  


## Functional Requirements  

#### Functional Requirement 1  

**Given**  A user wants to see an overview of the status of their aircraft


**When**   The user starts the application


**Then**  A dashboard view of aircrafts in the fleet will be displayed   

#### Functional Requirement 2  

**Given**  An aircraft is in work for maintenance, damaged, or AOG (awaiting parts)


**When**   The  aircraft is displayed on the dashboard


**Then**  The aircraft image will apear red  

#### Functional Requirement 3  

**Given**  A broken aircraft becomes serviceable again


**When**   The user clicks the “back in service” check box,


**Then**  The aircraft icon on the dashboard will turn green and the aircraft will disappear from the dashboard view 1 hour after becoming serviceable  

#### Functional Requirement 4  

**Given**  An aircraft is out of service


**When**   The user clicks the “back in service” check box


**Then**  The total down time for that aircraft is calculated  

#### Functional Requirement 5  

**Given**  A user wants to add or subtract an aircraft from a fleet


**When**   The user clicks the “add new tail” or “remove tail” buttons


**Then**   A pop-up window will appear which will allow the user to select a tail to remove or enter a new tail  

## Class Diagram

![image](https://user-images.githubusercontent.com/82166772/218315571-5186acbb-456b-4e46-b3a8-5a15de6fc77a.png)

![image](https://user-images.githubusercontent.com/82166772/218315576-01682ff5-c469-4630-bc6f-886326e44923.png)

![image](https://user-images.githubusercontent.com/82166772/218315587-b6e25953-0b9d-43dd-9c9c-2703ceb554f2.png)

![image](https://user-images.githubusercontent.com/82166772/218315595-dcdeece0-089e-4b38-8dd6-90e1342570e7.png)

### Class Diagram Description
**FleetTrackerMainPage class:** contains the architecture for the UI on the website  

**UI Class:** includes an overview for the flight status. The class also has three methods for getting the flights, delayed flights, and airline.  

**Fleet Overview Class:**  displays the fleet status and allows for flights to be added and removed  

**com.fleettracker.service Package:** has the FleettrackerDAO interface and two subclasses, AircraftTracker and FleetTrackerDAO. These two classes connect to the IEventAirlineDAO and FleetTrackerDAO interfaces.  

**airlineDAO class:** has two variables for getting the airline id and airline name. Also has two methods which are for getting the airline id and airline name  

**AircraftDAO class:** contains ID, name, aircraft registration, location, sub-contract service, sub fleet and carrier ID variables Also has 6 methods for getting airline name, registration service availability.


## Trello.com (scrumy.com doesn't exist anymore) link:  
https://trello.com/b/gv4Ihu1U/fleet-tracker

## Scrum Roles

- Scrum Master/Product Owner/Github admin:  Ethan Finch
- UI Developer: Steven Falconieri/Adam Bockhorst
- Business Logic and Persistence: Isaac Kwizera/Ethan Finch/Adam Bockhorst

## Weekly Meeting

Mondays at 5:30 PM on Teams.
