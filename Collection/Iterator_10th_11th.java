package com.hefshine.Collection;
//10.WAP to print all elements of ArrayList using iterator
//11.	WAP to iterate through all elements in an ArrayList using for loop
import java.util.ArrayList;

import java.util.Iterator;
import java.util.Scanner;

public class Iterator_10th_11th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList al = new ArrayList();
		System.out.println("enter the element in arraylist");
		for (int i = 0; i <= 5; i++) {
			String a = sc.next();
			al.add(a);
		}
		
	Iterator iterator=al.iterator();
	while(iterator.hasNext()) {
		System.out.print(iterator.next()+" ");
	}
System.out.println();
	System.out.println();
	}

}
