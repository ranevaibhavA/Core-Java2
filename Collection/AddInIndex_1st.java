package com.hefshine.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class AddInIndex_1st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of arraylist");
int initialCapacity=sc.nextInt();
		ArrayList arraylist=new ArrayList(initialCapacity);
		System.out.println("Enter the element in array list");
		
		for(int i=0;i<=initialCapacity;i++) {
			String obj=sc.nextLine();
			arraylist.add(obj);
			
		}
//		arraylist.toString();							//it gives already comma cause to string method has syntax 
		System.out.println("Arraylist is "+arraylist);
	arraylist.add(3, "Salena");
	System.out.println("Updated list is "+arraylist);
	
	}

}
