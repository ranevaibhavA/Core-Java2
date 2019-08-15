package com.hefshine.Collection;

import java.util.ArrayList;
import java.util.Scanner;

//5.	WAP to retrieve an element (at a specified index) from a given ArrayList
public class RetriveElement_5th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the capacity of arraylist");
		
		int initialcapacity=sc.nextInt();

		ArrayList arlist=new ArrayList();		
System.out.println("enter the element in arraylist");
for(int i=0;i<initialcapacity;i++) {
	String a=sc.next();
	arlist.add(a);
}

System.out.println("Enter index you want to get element");
int index=sc.nextInt();

System.out.println("Element at "+index+" is "+arlist.get(index));

	}

}
