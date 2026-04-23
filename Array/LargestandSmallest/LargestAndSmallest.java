/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LargestandSmallest;

/**
 *
 * @author chala
 */
public class LargestAndSmallest {
    public static void findLargestAndSmallest(int[] arr){
        
        if(arr == null || arr.length == 0){
            System.out.println("Array is empty");
            return;
        }
        
        if(arr.length == 1){
            System.out.println("Array is too small - only one Element");
            return;
        }
        
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        
        for(int num:arr){
            if(num > largest){
                largest = num;
            }
            
            if(num < smallest){
                smallest = num;
            }
        }
        
        System.out.println("Largest: "+largest+" Smallest: "+smallest);
        
       
    }
}
