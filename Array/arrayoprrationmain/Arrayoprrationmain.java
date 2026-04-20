/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayoprrationmain;

/**
 *
 * @author miabd
 */
public class Arrayoprrationmain {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Arrayoprration Arayob=new Arrayoprration();
        Arayob.Insertatend(10);
        Arayob.Insertatend(30);
        Arayob.Insertatend(50);
        Arayob.printarray();
        Arayob.Insertatpossiyion(20, 1);
        Arayob.printarray();
        
        if(Arayob.Search(50)!=-1){
            System.out.println("value fount at index"+Arayob.Search(50));
        }else{
            System.out.println("error");
        }
        
        Arayob.Deleatbypossition(1);
         Arayob.printarray();
         
         
         Arayob.Deleatbyvalue(30);
          Arayob.printarray();
        
        
    }
}
