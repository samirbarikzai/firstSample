package com.syntax.reviewclass2;

public class IfElseStatement {

	public static void main(String[] args) {
		
		
		//i am creating schedule
		// if its 7 oclock, i study Jaba
		// otherwise if 8 oclock, i study SDLC
		// otherwise if its 9 ocloc, i  do my home work
		// otherwise, it is not my study time
		
		int time= 7;
		
		if (time==7) {
			System.out.println(" i study Java");
		}else if (time==8) {
			System.out.println(" i study SDLC");
		}else if (time==9) {
			System.out.println(" i do my homework");
		}else {
			System.out.println(" its noy my study time");
		}
	}
}
