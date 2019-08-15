package com.hefshine.Array;

import java.util.Scanner;

public class Addition {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array");
	int size=sc.nextInt();
	int element[]=new int[size];
	int sum=0;
	System.out.println("Enter the elements ");
	for(int i=0;i<size;i++) {
		element[i]=sc.nextInt();
		
	}
	System.out.println("Entered elements ");
	for (int i=0;i<size;i++)						//display
	{
		System.out.println(element[i]);
	}
	for (int i=0;i<size;i++) {
		
		
		
		sum=sum+element[i];
		
	}
	System.out.println("Sum of all element is "+sum);
}
}
