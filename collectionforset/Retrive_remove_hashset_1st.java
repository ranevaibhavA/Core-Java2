package com.hefshine.collectionforset;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

//1.	WAP to retrieve and remove the lowest element 
//		of a TreeSet using a single method call. Repeat the same using 2 different method calls.
public class Retrive_remove_hashset_1st {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element in set");
		TreeSet ts = new TreeSet();
		for (int i = 0; i < 5; i++) {
			ts.add(sc.next());
		}
	System.out.println("Removing element is "+ts.pollFirst());
	System.out.println(ts.pollFirst());

	System.out.println(ts.pollFirst());
	}
}
