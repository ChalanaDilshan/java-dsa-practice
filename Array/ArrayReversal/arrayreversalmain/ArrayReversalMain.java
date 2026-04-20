/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayreversalmain;

/**
 *
 * @author chala
 */
public class ArrayReversalMain {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        
        System.out.println("Input: ");
        ArrayReversal.printarray(arr);
        
        ArrayReversal.reverse(arr, 0, arr.length-1);
        
        System.out.println("Output");
        ArrayReversal.printarray(arr);
    }
}
