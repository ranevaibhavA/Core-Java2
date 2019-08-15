package com.hefshine.collectionforset;

import java.util.HashSet;
import java.util.Scanner;

//3.	WAP to remove all of the elements from a HashSet.
public class RemoveHashset_3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashSet hs = new HashSet();
		System.out.println("Enter the element in hashset");
		for(int i=0;i<3;i++) {
			hs.add(sc.next());
		}
		System.out.println("before removing element"+hs);
	hs.removeAll(hs);
	System.out.println("After removing element"+hs);
	}

}
