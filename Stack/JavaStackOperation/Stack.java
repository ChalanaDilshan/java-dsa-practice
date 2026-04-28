/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaStackOperation;

/**
 *
 * @author chala
 */
public class Stack {
    private int[] arr;
    private int capacity;
    private int top;
    
    Stack(int size){
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    
    public boolean isFull(){
        return top == capacity - 1;
    }
    
    public void push(int value){
        if(isFull()){
            System.out.println("Stack Overflow! Cannot insert elements!");
            return;
        }
        
        arr[++top] = value;
        
        System.out.println("Pushed: "+value);
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow! Cannot remove elements..");
            return -1;
        }
        
        int popped = arr[top--];
        
        System.out.println("Popped: "+popped);
        
        return popped;
    }
    
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
            return -1;
        }
                
        return arr[top];
    }
    
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return;
        }
        
        System.out.println("\nStack Elements: (bottom -> top)");
        
        for(int i = 0; i <= top; i++){
            System.out.println(arr[i]);
        }
        
    }
}
