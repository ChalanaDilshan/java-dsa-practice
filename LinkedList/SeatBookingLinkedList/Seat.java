/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeatBookingLinkedList;

/**
 *
 * @author chala
 */
public class Seat {
    int seatNumber;
    String passengerName;
    Seat next;
    
    Seat(int seatNumber){
        this.seatNumber = seatNumber;
        this.passengerName = null;
        this.next = null;
    }
}
