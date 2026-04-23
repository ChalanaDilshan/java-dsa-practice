/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayDuplicates;

/**
 *
 * @author chala
 */
import java.util.HashSet;

public class ArrayDuplicates {
    
    public static void printduplicates(int[] arr){
        
        System.out.println("Print Duplicates: ");
        
        HashSet<Integer> seen = new HashSet<>();
        
        HashSet<Integer> Duplicates = new HashSet<>();
        
        for(int num:arr){
            if(!seen.add(num)){
               if(Duplicates.add(num)){
                   System.out.print(num+" ");
               }
            }
        }
        
        System.out.println();
    }
    
    public static int[] removeDuplicates(int[] arr){
        
        if(arr.length <= 1){
            return arr.clone();
        }
        
        HashSet<Integer> seen = new HashSet<>();
        
        int[] temp = new int[arr.length];
        
        int k = 0;
        
        for(int num:arr){
            if(seen.add(num)){
                temp[k++] = num;
            }
        }
        
        int[] result = new int[k];
        
        System.arraycopy(temp, 0,result , 0, k);
        
        return result;
        
    }
    
    public static void printarray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
