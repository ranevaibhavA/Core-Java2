package com.hefshine.Collection;

import java.util.LinkedList;
import java.util.Scanner;

//13.	WAP to insert the specified element at the specified position in the linked list.
public class AddAtPosition {
public static void main(String[] args) {
	LinkedList linkl = new LinkedList();
	Scanner sc = new Scanner(System.in);

	linkl.addFirst("11");
	System.out.println("Enter 4 elements in linklist");
	for (int i = 1; i <= 5; i++) {
		String e = sc.nextLine();
		linkl.add(e);
	}
	System.out.println("Before added"+linkl);
linkl.add(3, "added");
System.out.println(linkl);
}
}
