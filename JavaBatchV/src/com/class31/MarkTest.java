package com.class31;

public class MarkTest {
		public MarkTest() {
			// TODO Auto-generated constructor stub
		}
		public static void main(String[] args) {
			A obj = new A(90, 85, 75);
			System.out.println("Percentage for Student A= " + obj.getPercentage());
			System.out.println("----------------");
			B obj2 = new B(89, 90, 84, 79);
			int result = obj2.getPercentage();
			System.out.println("Percentage for student B= " + result);
		}
	}

