package com.class19;

public class Task {
	
	/*ccreate a method createEmail().Based on provided users name,lastName and email type,
	 * your method should return complete email address.
	 * Example:johnsnow@gmail.com orjohnsnow@yahoo.com
	 */
	
	
		 String  emailAdress(String name, String lastName, String eMailType){
		        String emailAdress=name.toLowerCase()+""+lastName.toLowerCase()+"@"+eMailType.toLowerCase();
		        return emailAdress;
		    }
		    // isPrime method
		    boolean isPrime(int num) {
		        boolean isPrime=true;
		        for (int i = 2; i < num; i++) {
		            if(num%i==0) {
		                isPrime=false;
		                break;
		            }else {
		                isPrime=true;
		            }
		        }
		        return isPrime;
		    }
		
	}


