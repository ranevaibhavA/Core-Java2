package com.hefshine.collectionMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

//2.	WAP to get a key-value mapping associated with the greatest key less than or equal to the given key
public class GreatestKeyLess {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key and value in hashmap");
		TreeMap tm=new TreeMap();
		int key = 0;
		String value;
		for(int i=1;i<=5;i++) {
			 key=sc.nextInt();
			 value=sc.next();
			tm.put(key, value);
		
		}
		
	System.out.println("Enter any key to compare");
	int searchingkey=sc.nextInt();
	System.out.println("It returns greatest key than given key "+tm.floorEntry(searchingkey));

	}
}
