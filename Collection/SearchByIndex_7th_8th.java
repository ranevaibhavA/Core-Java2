package com.hefshine.Collection;

import java.util.ArrayList;
import java.util.Scanner;

//7.	WAP to get an element of a particular Index.
public class SearchByIndex_7th_8th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the capacity of arraylist");

		int initialcapacity = sc.nextInt();

		ArrayList araylist = new ArrayList();
		System.out.println("enter the element in arraylist");
		for (int i = 0; i < initialcapacity; i++) {
			String a = sc.next();
			araylist.add(a);
		}
//		araylist.toString();
		System.out.println("Enter the index ");
		int index = sc.nextInt();
		System.out.println(araylist.get(index));


	}

}
