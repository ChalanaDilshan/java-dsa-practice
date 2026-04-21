/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.twodimentionalarray3;

/**
 *
 * @author chala
 */

import java.util.Scanner;

public class TwoDimentionalArray3Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[3][3];
        
        System.out.println("Enter 9 elements for 3*3 Matrix: ");
        
        for(int i = 0; i < 3; i++){   //control rows
            for(int j = 0; j < 3; j++){  //control columns
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Entered Matrix: ");
        displaymatrix(arr);
        System.out.println("\nTotal Sum: "+totalsum(arr));
        printrowsums(arr);
        printcolumnsums(arr);
        findmaxmin(arr);
        printdiagonals(arr);
        
        sc.close();
    }
    
    public static void displaymatrix(int[][] m){
        for(int[] row: m){
            for(int value: row){
                System.out.print(value+ "\t");
            }
            System.out.println();
        }
    }
    
    public static int totalsum(int[][] m){
        int sum = 0;
        
        for(int[] row: m){
            for(int val: row){
                sum = sum + val;
            }
        }
        
        return sum;
    }
    
    public static void printrowsums(int[][] m){
        System.out.println("\nRow Sums: ");
        
        for(int i = 0; i < m.length; i++){
            
            int sum = 0;
            
            for(int j = 0; j < m[i].length; j++){
                sum += m[i][j];
            }
            
            System.out.print(sum+" ");
            
        }
        
        System.out.println();
    }
    
    public static void printcolumnsums(int[][] m){
        System.out.println("Print Column Sums: ");
        
        for(int i = 0; i < m.length; i++){
            
            int sum = 0;
            
            for(int j = 0; j <m[i].length; j++){
                sum += m[j][i];
            }
            
            System.out.print(sum+" ");
        }
        
        System.out.println();
    
    }
    
    public static void findmaxmin(int[][] m){
        int max  = m[0][0];
        int min = m[0][0];
        
        for(int[] row : m ){
            for(int value: row){
                if(value > max) max = value;
                if(value < min) min = value;
            }
        }
        
        System.out.println("Maximum: "+max+ "| Minimum: "+min);
    }
    
    public static void printdiagonals(int[][] m){
        System.out.println("Main diagonal Elements: ");
        
        int mainsum = 0;
        
        for(int i = 0; i <m.length; i++){
            System.out.print(m[i][i]+" ");
            
            mainsum += m[i][i];
        }
        System.out.println("(Sum  "+mainsum+" )");
        
        System.out.println("Antidiagonal Element: ");
        System.out.println();
        
        int antisum = 0;
        
        for(int i = 0;i < m.length; i++){
            System.out.print(m[i][m.length - 1 - i]+" ");
            
            antisum += m[i][m.length - 1 - i];
        }
        
        System.out.println("(Sum = "+antisum+") ");
    }
}
