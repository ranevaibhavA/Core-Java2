package com.hefshine.ExceptionHandling;

import java.util.Scanner;

//5.	WAP to check whether Unchecked Exception is propagated in calling stack
public class PropagatedStack_5th {
	
	int num1 ;
	
	int num2;
	
	int res = 0;

	void method1() {
		System.out.println("This is m1");
		method2();

	}

	void method2() {
		
		method3();

	}

	void method3() {
		
		method4();

	}

	void method4() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1");
		num1=sc.nextInt();
		num2=sc.nextInt();
	//	m5();
		try {
			
			m5();	
			System.out.println("result=" + res);
		
		} 
		
		catch (ArithmeticException e) 
		
		{
		
			System.out.println("Arithmetic Exception occurs");
		}
		
	}
	void m5() {
		res = num1 / num2;
		
	}
public static void main(String[] args) {
	PropagatedStack_5th ob=new PropagatedStack_5th();
	ob.method1();
}
}
