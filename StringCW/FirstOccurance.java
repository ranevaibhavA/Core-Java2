package com.hefshine.StringCW;

import java.util.Scanner;

//8.Write a Java program to find first occurrence of a character in a given string.
public class FirstOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str1=sc.next();
		System.out.println("Enter the character to get occurance");
		char ch=sc.next().charAt(0);
		int indexof=0;
for(int i=0;i<str1.length();i++) {
	if(str1.charAt(i)==ch) {
		indexof=i;
		break;
	}
}
		
		
		
		System.out.println("First Occurance of the "+ch+" is at index "+indexof);
		
	}

}
