/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayDuplicates;

/**
 *
 * @author chala
 */
public class ArrayDuplicatesMain {
    public static void main(String[] args){
        
        int[] arr = {7,8,9,4,5,6,8,9,9,1,2,3,3,2,1,1};
        
        System.out.println("Original Array: ");
        ArrayDuplicates.printarray(arr);
        ArrayDuplicates.printduplicates(arr);
        
        int[] removed = ArrayDuplicates.removeDuplicates(arr);
        
        System.out.println("Without Duplicates:");
        ArrayDuplicates.printarray(removed);
    }
}
