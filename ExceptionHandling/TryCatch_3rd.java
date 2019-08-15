package com.hefshine.ExceptionHandling;
//3.	WAP to demonstrate runtime stack mechanism using Arithmetic Exception and handle it using try catch.
import java.util.Scanner;

public class TryCatch_3rd {
	Scanner sc=new Scanner(System.in);
	int a,b,div;
	void Div() {
		System.out.println("Enter number");
		a=sc.nextInt();
		System.out.println("Enter 2nd number");
		b=sc.nextInt();
		try {
			div=a/b;
			
		}
		catch(ArithmeticException e){
			System.out.println("Enter a valid number for division");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TryCatch_3rd ob=new TryCatch_3rd();
ob.Div();
	}

}
