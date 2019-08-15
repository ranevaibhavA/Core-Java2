package com.hefshine.collectionforset;
//2.	WAP to convert a HashSet to an array.

import java.util.HashSet;
import java.util.Scanner;

public class HashsetToArray_2nd {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		HashSet hs = new HashSet();
		System.out.println("Enter the element in hashset");
		for(int i=0;i<3;i++) {
			hs.add(sc.next());
		}
		
		System.out.println("Converting hashset into array...");
		Object arr []=hs.toArray();
System.out.println("Array elements are ");
		for(int i=0;i<3;i++) {
			System.out.print(arr[i]+" ");
			
		}
		
		
		
		
	}
}