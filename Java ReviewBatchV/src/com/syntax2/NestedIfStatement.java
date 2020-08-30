package com.syntax.reviewclass2;

public class NestedIfStatement {

public static void main(String[] args) {
	
	/* i want to eat
	 * if i have money
	 * if restuaant is near by
	 * i will eat in the restaurant
	 * otherwise
	 * i will not eat outside
	 * 
	 * Find if the number is 2 dogit, 3 digit or 4 didgit
	 * 
	 */
	// it will only execute if both conditions are true
	
	boolean hasMoney=true;
	boolean isRestNear=true;
	
	if (hasMoney==true) {
		if(isRestNear) {
			System.out.println(" i will eat in the restaurant");
		}else {
			System.out.println(" can not walk distance");
		}
	}
	
	
	
}
}
