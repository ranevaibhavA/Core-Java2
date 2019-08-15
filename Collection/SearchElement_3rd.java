package com.hefshine.Collection;

import java.util.ArrayList;
import java.util.Scanner;
//3.WAP to search an element from ArrayList
public class SearchElement_3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arraylist");
		int initialCapacity = sc.nextInt();

		ArrayList arraylist = new ArrayList(initialCapacity);
		System.out.println("Enter the element in array list");

		for (int i = 0; i <= initialCapacity; i++) {
			String obj = sc.nextLine();
			arraylist.add(obj);

		}
System.out.println("Enter the elemet you want to search");
String searchElement=sc.nextLine();

System.out.println(arraylist.contains(searchElement));	
	}

}
