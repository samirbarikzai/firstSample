package com.class16;

public class IQ3 {
	
	public static void main(String[] args) {
        // 3.Find out how many alpha characters present in a string?
        String str = "HGHGH78787*$&&$%";
        String num = str.replaceAll("[^A-z]", "");
        System.out.println(num);
        System.out.println(num.length());
    }
}


