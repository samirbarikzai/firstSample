package com.syntax.reviewclass2;

import java.util.Scanner;

public class CalculatoreDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter in first number");
		int num1 = scan.nextInt();

		System.out.println("Enter in second number");
		int num2 = scan.nextInt();

		System.out.println((num1 + num2));

	}
}
