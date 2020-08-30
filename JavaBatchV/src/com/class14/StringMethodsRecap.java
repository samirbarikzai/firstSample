package com.class14;

public class StringMethodsRecap {

	public static void main(String[] args) {

		//.replace
		String str="your Syntax Technologies. is your place to study";
		System.out.println(str.replace('y', 'i'));
		
		System.out.println("**************");
		System.out.println(str.replace("your", "My"));
		
		System.out.println("**************");

		//.replaceAll
		String str2="Video provides a powerful way to help you prove your point. "
				+ "When you click Online Video, you can paste in the embed "
				+ "code for the video you want to add. ";
		System.out.println(str2.replaceAll("to(.*)", ""));
		
		System.out.println("**************");

		String str3="23423Hell3049o^&*^&*$%$";
		System.out.println(str3.replaceAll("[0-9]", ""));
		System.out.println(str3.replaceAll("[^a-zA-Z^]", ""));
		
		System.out.println("**************");
		System.out.println(str2.replaceFirst(" ", ""));
		System.out.println(str3.replaceAll("\\w", ""));
		
		
	}

}
