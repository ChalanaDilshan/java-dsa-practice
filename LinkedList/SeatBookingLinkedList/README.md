#  Linked List Seat Booking System

A lightweight Java implementation of a train seat reservation system using the **Singly Linked List** data structure. This project demonstrates core concepts of node manipulation, list traversal, and basic algorithm logic.

## 📌 Features
* **Book a Seat:** Automatically finds the first available seat and assigns a passenger name.
* **Cancel Booking:** Removes a passenger from the list by their name and frees up the seat.
* **Availability Search:** Quickly identifies the next available seat number.
* **Display Status:** Lists all currently available seats or shows "None" if the train is full.

## 🛠️ Technical Overview

### Data Structure
The system uses a custom `Seat` class as a **Node**. Each node contains:
1.  `int seatNumber`: The ID of the seat.
2.  `String passengerName`: The name of the person (null if empty).
3.  `Seat next`: A reference to the next seat in the chain.

### Traversal Logic
Searching and displaying seats are handled via **Linear Traversal**. We use a temporary `current` pointer to navigate from the `head` to the end of the list without losing the entry point of the data structure.

### Sample Output

```text
Seat 1 booked for Chalana
Seat 2 booked for Amila
Seat 3 booked for Sithum
Seat 4 booked for Janith
Available seats: 
5 6 7 8 9 10 
Booking cancelled for: Sithum
First seat available at: 3
Available seats: 
3 5 6 7 8 9 10 
Seat 3 booked for Akarsha
Available seats: 
5 6 7 8 9 10
```
