package com.class17;

public class ObjectOfphoneClass {
	
	
	public static void main(String[] args) {
        
	    
	    Phone phone1=new Phone();
	    phone1.brand="Apple";
	    phone1.name="IPhone";
	    phone1.model="Iphonexr ";
	    phone1.memory=256;
	    
	    System.out.println("I have "+phone1.name+" "+phone1.model+" "+" and i love it");
	    phone1.call();
	    phone1.checkMails();
	    }
	}


