package com.class15;

public class StringMainpulations {
	public static void main(String[] args) {
		
		//String class comes in java lang package
		//first way using String literal
		//tow  ways to create a string 
		String str="Hello";
		//second wa using new keyword -creating a string object
		String str1=new String("hello");
		System.out.println(str);
		System.out.println(str1);
		
		/*1.find the number of characters inside the string
		 * .lenght
		 */
	
	int length=str.length();
	System.out.println(length);
	//case conversion methods /functions
	
	System.out.println(str.toLowerCase());//hello
	System.out.println(str);//hello
	//System.out.println(str.toLowerCase().toUpperCase();//HELLO
	
	//verify if there if the string is Empty
	String myString="";
	boolean isEmpty=myString.isEmpty();
	System.out.println(isEmpty);
	
	String myString1=null;//no value at all
	System.out.println(myString1.isEmpty());
	
	//how to verify existence of characters in the string
	String a="Good evening students";
	boolean exist=a.contains("Students");
	System.out.println(exist);
	System.out.println(a.startsWith("Good"));
	System.out.println(a.endsWith("student"));
	
	
	}

}
