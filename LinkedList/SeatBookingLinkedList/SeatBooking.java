/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeatBookingLinkedList;

/**
 *
 * @author chala
 */
public class SeatBooking {
    private Seat head;
    
    public SeatBooking(int totalSeats){
        head = new Seat(1);
        Seat current = head;
        
        for(int i = 2; i <= totalSeats; i++){
            current.next = new Seat(i);
            current = current.next;
        }
    }
    
    public void bookSeat(String name){
        
        Seat current = head;
        
        while(current != null){
            if(current.passengerName == null){
                current.passengerName = name;
                System.out.println("Seat "+current.seatNumber+" booked for "+name);
                return;
            }
            
            current = current.next;
        }
        
        System.out.println("No Available Seats!");
    }
    
    public void cancelBooking(String name){
        
        Seat current = head;
        
        while(current != null){
            if(name.equals(current.passengerName)){
                current.passengerName = null;
                System.out.println("Booking cancelled for: "+name);
                return;
            }
            
            current = current.next;
        }
        
        System.out.println("Passenger not found!");
    }
    
    public void searchAvailableSeat(){
        
        Seat current = head;
        
        while(current != null){
            if(current.passengerName == null){
                System.out.println("First seat available at: "+current.seatNumber);
                return;
            }
            
            current = current.next; 
        }
        
        System.out.println("No seats available");
    }
    
    public void displayAvailableSeats(){
        System.out.println("Available sheets: ");
        Seat current = head;
        boolean found = false;
        
        while(current != null){
            if(current.passengerName == null){
                System.out.print(current.seatNumber+" ");
                found = true;
            }
            
            current = current.next;
        }
        
        if(!found){
            System.out.println("No Available seats");
        }
        
        System.out.println();
    }
    
    public static void main(String[] args){
        SeatBooking train = new SeatBooking(10);
        
        train.bookSeat("Chalana");
        train.bookSeat("Amila");
        train.bookSeat("Sithum");
        train.bookSeat("Janith");
        
        train.displayAvailableSeats();
        
        train.cancelBooking("Sithum");
        train.searchAvailableSeat();
        
        train.displayAvailableSeats();
        
        train.bookSeat("Akarsha");
        train.displayAvailableSeats();
    }
}
