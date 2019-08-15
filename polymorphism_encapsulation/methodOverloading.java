package com.hefshine.polymorphism_encapsulation;

import java.util.Scanner;

public class methodOverloading {
	static Scanner sc=new Scanner(System.in);
static int a;
static int b;
static int c;	
	void Add(int a,int b) {
		
		int res=a+b;
		System.out.println("(Method1)Addition of numbers "+res);
	}
	void Add(int a,int b,int c) {
		int res=a+b+c;
		System.out.println("(Method 2)Addition of 3 numbers "+res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
methodOverloading ob=new methodOverloading();
System.out.println("Enter a number");
a=sc.nextInt();
System.out.println("Enter 2nd number");
b=sc.nextInt();
ob.Add(a, b);										//same name with diff parameter
System.out.println("Enter third number");
c=sc.nextInt();
ob.Add(a, b, c);									//same name diff parameter Overloading
	}

}
