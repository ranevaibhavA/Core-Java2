package com.hefshine.StringCW;

import java.util.Scanner;

//9.Write a Java program to trim trailing white space characters in a string
public class Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence with white spaces");
		String str1=sc.nextLine();
		System.out.println("Trimmed sentence is "+str1.trim()+"addedword");
		
	}

}
