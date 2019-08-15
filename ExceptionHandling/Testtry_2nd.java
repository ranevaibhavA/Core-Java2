package com.hefshine.ExceptionHandling;
//2.	WAP to demonstrate runtime stack mechanism using Arithmetic Exception.
import java.util.Scanner;

public class Testtry_2nd {

	Scanner sc = new Scanner(System.in);
	int a,b,div,add,mult,div1;

	void Div() {
		System.out.println("Enter number");
		a = sc.nextInt();
		System.out.println("Enter 2nd number");
		b = sc.nextInt();
		try {
			add = a + b;
			div = a / b;
			mult = a * b;
		} catch (ArithmeticException e) {
			System.out.println("Enter a valid number for division");
			div1=a/b;
		}
System.out.println(add+"\n"+mult);
		System.out.println("STMT 5");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatch_3rd ob = new TryCatch_3rd();
		ob.Div();
	}
}
