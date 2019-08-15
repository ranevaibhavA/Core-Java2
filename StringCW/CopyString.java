package com.hefshine.StringCW;

import java.util.Scanner;

//6.	Write a Java program to copy one string to another string.
public class CopyString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "henry";
		System.out.println(str1);
		String str2 = new String("peter");
		System.out.println(str2);
		System.out.println("String copying from " + str1 + " to " + str2 + ": " + (str2 = str1));
							//Assigning value of str1 to str2
		System.out.println(str2);
	}

}
