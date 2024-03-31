***Hotel Management System***
This repository contains Java code for a simple hotel management system. It includes classes for managing clients, reservations, and rooms, as well as saving client, reservation, and room information to text files.
Classes
Client: Represents a hotel client with attributes like last name, first name, age, address, contact, and ID number.
Reservation: Manages reservations with details such as reservation number, client information, room number, date, duration, price, and payment method.
Room: Defines room properties like number, type, state, bed count, price, and amenities (Wi-Fi, TV, AC).
Saving Information
SaveClient: Saves client information to "clientInfo.txt".
SaveReservation: Writes reservation details to "ReservationInfo.txt".
SaveRoomInfo: Handles saving room information to "infoRooms.txt".
User Interface
AddRoomWindow: GUI for adding a new room with fields for room number, bed count, price, type, and amenities.
CreditCardPayment: Allows users to make credit card payments for reservations.
LabeledTextField: Custom panel for labeled text fields used in various GUI components.
Functionality
ReservationDateWindow: Manages reservation dates and durations.
SearchRoom: Searches for available rooms based on user criteria.
RoomResultWindow: Displays available rooms matching specified criteria.
File Structure
Data_Base: Contains text files for storing client, reservation, and room information.
tempInfoRooms.txt: Temporary file for room information updates.
How to Use
Clone the repository.
Compile and run the Java files.
Interact with the GUI components to manage clients, reservations, and rooms.
Feel free to explore the code and enhance the hotel management system as needed.
