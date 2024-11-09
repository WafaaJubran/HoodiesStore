/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hoodiesstore;

import java.util.Scanner;

/**
 *
 * @author بشرى
 */
public class HoodiesStore {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your measures for:shoulders , arms and bust:");
        System.out.println("enter the shoulders measurement: " );
            double shoulders=input.nextDouble();
        System.out.println("enter the arms measurement: " );
            double arms=input.nextDouble();
        System.out.println("enter the bust measurement: " );
            double bust=input.nextDouble();
         String size=getSize(shoulders, arms, bust);
            System.out.println("your size is: " +size);
            
    }   
    public static String getSize(double shoulders,double arms,double bust) {
         if (shoulders == 49 && arms==54 && bust==100){
         return "XS";}
         else if (shoulders == 51 && arms==54.5 && bust==104 ){
          return "S";}
         else if (shoulders == 53 && arms==55 && bust==108 ){
             return "M"; }
         else if (shoulders == 55 && arms==55.5 && bust==114){
             return "L";}
         else if (shoulders == 57 && arms==56 && bust==120 ){
             return "XL";} 
                  else{
                return "Sorry;we don’t have that size";
             }
    }    }



    

