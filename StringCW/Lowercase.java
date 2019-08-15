package com.hefshine.StringCW;
//5.	Write a Java program to convert lowercase string to uppercase.
import java.util.Scanner;

public class Lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	String str = sc.next();
	char[] strarray = str.toCharArray();
	for (int i = 0; i < str.length(); i++) {

		if (strarray[i] >= 'A' && strarray[i] <= 'Z') {				//for lowercase
			strarray[i] = (char) (strarray[i] + 32);
		} else if (strarray[i] >= 'a' && strarray[i] <= 'z') {		//for Uppercase
			strarray[i] = (char) (strarray[i] - 32);				//using ascii value -32 it retuns capital value
		}
	}
	System.out.println("Conversion");
	for (int i = 0; i < strarray.length; i++) {
		System.out.print(strarray[i]);
	}

//	System.out.println("lowercase String-"+str.toLowerCase());
//	System.out.println("Uppercase String-"+str.toUpperCase());
	
	
	}

}
