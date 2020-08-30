package com.syntax.classreview3;

import java.util.Scanner;

public class Task1 {
	//Write a program with one int value for salary and four String values for different cars

    //If you make over 50000 a year, you may buy a brand new car otherwise you should buy a used car.
      //For those you can afford a new car there are different price ranges

    //I want anything under 70k to be Audi A5

    //I want anything under 80k to be Mercedes-Benz

    //I want anything under 90k to be Jaguar

    //I want anything under 100k to be Tesla

   // And if you make less than 60k output to read "Save up money and wait until next year"
public static void main(String[] args) {
	 Scanner scan=new Scanner("System.in");
     System.out.println(" How much is your salary");
     int salary=scan.nextInt();
     int isSalary= 10000;
     String isMercedes, isAudi,isJaguar,isTesla;
     
     if (isSalary>50000) {
   	  System.out.println(" Buy a brand new car");
     } if (isSalary>= 60000 && isSalary<= 70000) {
     	  System.out.println(" buy Audi");
     	  
       }else if(isSalary>=70001 && isSalary<=80000) {
     	  System.out.println("buy Mercedes");
     	  
       }else if(isSalary>= 80001 && isSalary>=90000) {
     	  System.out.println(" buy Jaguar");
     	  
       }else if(isSalary>=90001 && isSalary>=100000) {
     	  System.out.println("Buy Tesla");
     	  
       }else if(isSalary<=60000) {
     	  System.out.println(" Save up money and wit untill next year");
     	  
       }else {
    	   System.out.println(" keep riding on bike");
       }
     }
}
