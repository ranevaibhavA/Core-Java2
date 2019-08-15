package com.hefshine.StringCW;

import java.util.Scanner;

//10.Write a Java program to find reverse of a string.
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String ");
String str1=sc.next();

char s[]=str1.toCharArray();				//create array of given string 

for(int i=s.length-1;i>=0;i--) {				//loop to reverse the array...
	System.out.print(s[i]);
}
	}

}
