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

insert image here

### Class Diagram Description
insert class diagram description here

## Trello.com link:  
https://trello.com/b/gv4Ihu1U/fleet-tracker

## Scrum Roles

- Scrum Master/Product Owner/Github admin:  Ethan Finch
- UI Developer: Steven Falconieri/Adam Bockhorst
- Business Logic and Persistence: Isaac Kwizera/Ethan Finch/Adam Bockhorst

## Weekly Meeting

Mondays at 5:30 PM on Teams.
