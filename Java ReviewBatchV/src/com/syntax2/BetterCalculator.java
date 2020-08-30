package com.syntax.reviewclass2;

import java.util.Scanner;

public class BetterCalculator {

	public static void main(String[] args) {
		// int a=10;
		// int b=12;
		//int a==b
		
		// String name1="John";
		// String name2= "Smith";
		
		// System.out.println( name1.equals(name2));
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" Enter in First Number");
		int num1=scan.nextInt();
		
	
		System.out.println(" Enter in Second Number");
		int num2=scan.nextInt();
		
		System.out.println(" Enter in Operator");
		String operator=scan.next();
		
		if(operator.equals("+")) {
			System.out.println(num1+num2);
		}else if (operator.contentEquals("-")) {
			System.out.println(num1-num2);
		}else if(operator.contentEquals("/")) {
			System.out.println(num1/num2);
		}else if(operator.contentEquals("*")) {
			System.out.println(num1*num2);
		}else {
			System.out.println(" Invalid operator or number entered");
		}
		
	}
}
