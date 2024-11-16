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
            
            input.nextLine();
        System.out.println("enter your undertone(warm, cool or neutral): " );
            String UserUndertone=input.nextLine();
            String size=getSize(shoulders, arms, bust);
        System.out.println("your size is: " +size);
            String result=Undertone(UserUndertone);
        System.out.println("the colors that suit you more: " +result);  
    }   
    public static String getSize(double shoulders,double arms,double bust) {
         if (shoulders>=49 && shoulders <= 51 && arms>=52 && arms<=54 && bust>=98 && bust<=102){
         return "XS";}
         else if (shoulders>=52 && shoulders <= 54 && arms>=55 && arms<=57 && bust>=103 && bust<=107){
          return "S";}
         else if (shoulders>=55 && shoulders <= 57 && arms>=58 && arms<=60 && bust>=108 && bust<=112){
             return "M"; }
         else if (shoulders>=58 && shoulders <= 60 && arms>=61 && arms<=63 && bust>=113 && bust<=117){
             return "L";}
         else if (shoulders>=61 && shoulders <= 63 && arms>=64 && arms<=66 && bust>=118 && bust<=122){
             return "XL";} 
         else if (shoulders>=64 && shoulders <= 66 && arms>=67 && arms<=69 && bust>=123 && bust<=125){
             return "XXL";}
         else if (shoulders>=67 && shoulders <= 69 && arms>=70 && arms<=72 && bust>=126 && bust<=128){
             return "XXXL";}
         else if (shoulders>=70&& shoulders <= 72 && arms>=73 && arms<=75 && bust>=129 && bust<=131){
             return "XXXXL";}
                  else{
                return "Sorry;we don’t have that size";
             }
    }  
    public static String Undertone(String UserUndertone){
        if(UserUndertone.equalsIgnoreCase("warm")){
            return "The warm colors suit you more";}
        else if(UserUndertone.equalsIgnoreCase("cool")){
            return "The cool colors suit you more";}
        else{
            return "you have neutral undertone, both warm and cool colors suit you";}
        }
    }




    

