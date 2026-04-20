/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayreversalmain;

/**
 *
 * @author chala
 */
public class ArrayReversal {
    public static void reverse(int[] arr,int start,int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
    
    public static void printarray(int[] arr){
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
