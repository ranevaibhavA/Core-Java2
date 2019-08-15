package com.hefshine.polymorphism_encapsulation;

import java.util.Scanner;

class Safari {
	
	void speed() {
		String speed="50/hr";
		System.out.println("Safari have "+speed+" Speed") ;
		
	}

public static class Safari_strom extends Safari{

	void speed() {										//same name method in diff class performing new task
														//updation purpose
		String speed="70/hr";
		System.out.println("Now safari strom give "+speed+" Speed");
	}

		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Safari_strom ob=new Safari_strom();
ob.speed();

	}

}
}
