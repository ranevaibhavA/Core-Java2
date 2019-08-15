package com.hefshine.StringCW;

import java.util.Scanner;

//3.	Write a Java program to concatenate two strings.
public class Concate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1=sc.next();
		System.out.println("Enter the second string");
		String str2=sc.next();
		System.out.println(str1.concat(str2));			//using concate method
		System.out.println(str1+str2);					//using + operator
	System.out.println(str1+str2);						//by + operator
	
	}

}
