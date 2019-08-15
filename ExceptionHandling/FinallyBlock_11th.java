package com.hefshine.ExceptionHandling;

import java.util.Scanner;

public class FinallyBlock_11th {
static int num1,num2,Div;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
num1=sc.nextInt();
num2=sc.nextInt();

	try {
		Div=num1/num2;
	}catch(ArithmeticException e)
	{
		System.out.println("Cannot divisible by 0");
		//System.exit(0);				//it exit the program by JVM...without excuting finally block
	}
	finally {
		System.out.println("Finally");
	}
	
	
	
	
	}

}
