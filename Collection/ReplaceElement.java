package com.hefshine.Collection;
//8.	WAP to set or replace an element using set().

import java.util.ArrayList;

import java.util.Scanner;

public class ReplaceElement {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter elements for array list: ");
		for(int i=0;i<=5;i++) {
			String s=sc.nextLine();
			al.add(s);
		}
		System.out.println("Before replcing object: "+al);
		
		System.out.println("Enter the element to set the index: ");
		String s1=sc.nextLine();
		System.out.println("Enter the index to set new element: ");
		int b=sc.nextInt();
		
		al.set(b,s1);
		System.out.println("After replcing object: "+al);
		

	}

}
