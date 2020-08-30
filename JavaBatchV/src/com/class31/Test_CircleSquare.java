package com.class31;

public class Test_CircleSquare {

	public static void main(String[] args) {
		Circle obj1=new Circle();
		System.out.println("Area of circle= "+obj1.calculateArea(1, 1));
		System.out.println("perimiter of circle= "+obj1.calculatePerimiter(1, 1));
		System.out.println("-------------------------------------------------");
		Square obj2=new Square();
		System.out.println("Area of Square= "+obj2.calculateArea(10, 10));
		System.out.println("perimiter of square= "+obj2.calculatePerimiter(1, 1));
	}
}

