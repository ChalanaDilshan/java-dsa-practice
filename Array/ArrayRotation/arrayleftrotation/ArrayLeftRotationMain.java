/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayleftrotation;

/**
 *
 * @author chala
 */
public class ArrayLeftRotationMain {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        
        System.out.println("Input");
        ArrayLeftRotation.printarray(arr);
        
        System.out.println("Output");
        ArrayLeftRotation.leftrotate(arr,3 );
    }
}
