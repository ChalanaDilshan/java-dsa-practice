/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linkedlistapplication;

/**
 *
 * @author chala
 */
public class LinkedListApplication {

    private Node head;
    
    LinkedListApplication(){
        this.head = null;
    }
    
    public void insertElement(int data){
        
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }
        
        Node current = head;
        
        while(current.next!=null){
            current = current.next;
        }
        
        current.next = newNode;
        
    }
    
    public void insertElementAtStart(int data){
        
        Node newNode = new Node(data);
        
        newNode.next = head;
        
        head = newNode;
        
    }
    
    public void displayList(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        
        Node current = head;
        
        System.out.println("\nLinked List Elements: ");
        
        while(current!=null){
            System.out.print(current.data+" -> ");
            
            current = current.next;
        }
        
        System.out.print(" Null");
    }
    
    public boolean find(int data){
        Node current = head;
        
        while(current!=null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }
        
        return false;
    }
    
    public void delete(int data){
        if(head == null){
            System.out.println("List is Empty! Nothing to delete");
            return;
        }
        
        if(head.data == data){
            head = head.next;
            
            System.out.println(data+" deleted successfully..");
            return;
        }
        
        Node current = head;
        Node prev = null;
        
        while(current!=null && current.data!=data){
            prev = current;
            
            current = current.next;
        }
        
        if(current == null){
            System.out.println(data+" not found in the list");
            return;
        }
        
        prev.next  = current.next;
        
        System.out.println(data+" deleted successfully..");
    }
    
    public static void main(String[] args){
        LinkedListApplication list = new LinkedListApplication();
        
        list.insertElement(10);
        list.insertElement(20);
        list.insertElement(30);
        
        list.displayList();
        
        list.insertElementAtStart(40);
        
        list.displayList();
        
        System.out.println("Is 20 present ?"+list.find(20));
        System.out.println("Is 50 present ?"+list.find(50));
        
        list.delete(5);
        list.delete(20);
        
        list.displayList();
    }
}
