package com.hefshine.StringCW;
//4.	Write a Java program to compare two strings
import java.util.Scanner;

public class Compare3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter first string ");
String str1=sc.next();
System.out.println("Enter second character");
String str2=sc.next();
if((str1.compareTo(str2)<0) || (str1.compareTo(str2)>0)) {
	System.out.println("Strings are not same");
	
}else System.out.println("Strings are same");


	}

}
