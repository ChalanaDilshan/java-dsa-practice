/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayoprrationmain;

/**
 *
 * @author miabd
 */
public class Arrayoprration {
    
    private int[] arr;
    private int size;
    private final int CAPACITY=10;
    
    public Arrayoprration(){
        size=0;
        arr=new int[CAPACITY];
    }
    
    
    
    public void printarray(){
        
        if(size==0){
            System.out.println("Array is emty");
            
        }
        
        System.out.println("\nArray");
        
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        
    }
    
    public boolean Insertatend(int value){
        if(size>=CAPACITY){
            System.out.println("Already full");
            return false;
        }
        
        arr[size]=value;
        size++;
        return true;
        
    }
    
    public boolean Insertatpossiyion(int value,int possition){
        if(size>=CAPACITY){
            System.out.println("Array is full");
            return false;
        }
        
        if(possition <0 || possition>size ){
            System.out.println("invalid possition ");
        }else{
            
            for(int i=size;i>possition;i-- ){
            arr[i]=arr[i-1];
            
        }
            arr[possition]=value;
            size++;
                
        }
        
        return true;
    }
    
    
    public int Search(int value){
        
           for(int i=0;i<size;i++){
           if(arr[i]==value){
               return i;
           }
        }
        return -1;
    }
    
    
          public boolean Deleatbypossition(int possition){
            if(possition <0 || possition>size ){
                System.out.println("invalid possition ");
            }
             for(int i=possition;i<size -1;i++){
                 
                 arr[i]=arr[i++];
             }
             size--;
      
           return false;
    }
    
    
    public boolean Deleatbyvalue(int value){
        
        int index =Search(value);
        
        if(index==-1){
            System.out.println("not found");
            return false;
        }
        
        return Deleatbypossition(index);
    }
    

    
    
}
