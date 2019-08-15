package com.hefshine.StringCW;

import java.util.Scanner;

//12.Write a Java program to toggle case of each character of a string.
public class Togglecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string ");
String str=sc.nextLine();
char c[]=str.toCharArray();
for(int i=0;i<str.length();i++) {
	if(c[i]>=65 && c[i]<=90) {
		c[i]=(char)(c[i]+32);							//change capital to small
	}else {
		c[i]=(char) (c[i]-32);
		
	}
}
for(int i=0;i<str.length();i++) {
	System.out.print(c[i]);
}
	}

}
