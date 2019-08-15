package com.hefshine.StringCW;

import java.util.Scanner;

//7.WAP to split string into 2 tokens where string is “HELLO=WORLD”
public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter joined String ");
	
		String str1 = sc.next();
		String a[] = str1.split("="); 		// array of type string which split where the given symbol is present

		for(int i=0;i<a.length;i++) {
System.out.println((i+1)+"="+a[i]);	
}
}
}