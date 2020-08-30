package com.class17;

public class Phone {

	// Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with
	// specific attributes and behaviours.

	// Create a Dog Class and create 3 different objects of it: Husky, Bulldog,
	// Labrador with specific attributes and behaviours.

	 String brand, name, model, color; 
	    boolean touchScreen; 
	    int storage, memory;
	    
	    void call() {
	        System.out.println("I can make call on my "+name);
	    }
	    void checkMails() {
	        System.out.println("I can check my emails from my "+name);
	    }
	    void surfInternet() {
	        System.out.println("I can surf internet in my "+name);
	    }
	    
	    public static void main(String[] args) {
	        
	    
	    Phone phone1=new Phone();
	    phone1.brand="Apple";
	    phone1.name="IPhone";
	    phone1.model="Iphone11 Pro Max";
	    phone1.memory=256;
	    
	    System.out.println("I have "+phone1.name+" "+phone1.model+" "+" and i love it");
	    phone1.call();
	    phone1.checkMails();
	    }
}