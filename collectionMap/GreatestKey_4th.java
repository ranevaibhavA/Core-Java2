package com.hefshine.collectionMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

//4.	WAP to get the greatest key less than or equal to the given key
public class GreatestKey_4th {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the key and value in hashmap");
	TreeMap ts=new TreeMap();
	int key = 0;
	String value;
	for(int i=1;i<=5;i++) {
		 key=sc.nextInt();
		 value=sc.next();
		ts.put(key, value);
	
	}
System.out.println("Enter any key to compare");
int searchingkey=sc.nextInt();

System.out.println("It returns greatest key than given key "+ts.floorEntry(searchingkey));
}
}
