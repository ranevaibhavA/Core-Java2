package com.hefshine.Collection;

import java.util.ArrayList;
import java.util.Scanner;

//4.	WAP to search the specified collection in this collection
public class SearchCollection_4th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the capacity of arraylist");
		
		int initialcapacity=sc.nextInt();

		ArrayList arlist=new ArrayList();

for(int i=0;i<initialcapacity;i++) {
	String a=sc.next();
	arlist.add(a);
}
ArrayList arlist1=new ArrayList();
arlist1.add("robust");
arlist1.add("secure");
System.out.println(arlist.containsAll(arlist1));
	}

}
