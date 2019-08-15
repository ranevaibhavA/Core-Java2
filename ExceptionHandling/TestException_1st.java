package com.hefshine.ExceptionHandling;

import java.util.Scanner;
//1.	WAP to demonstrate runtime stack mechanism using Arithmetic Exception.
public class TestException_1st {

	void div(int a, int b) {

		int c = a / b;
System.out.println("Div is "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value of a");

		int a = sc.nextInt();

		System.out.println("Enter value of b");

		int b = sc.nextInt();

		TestException_1st ob = new TestException_1st();

		ob.div(a, b);
	}

}
