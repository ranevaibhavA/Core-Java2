package com.hefshine.ExceptionHandling;

public class ThrowsUnchecked {

	public static void main(String[] args) throws ArithmeticException {

		method1();

	}

	static void method1()  {
		// TODO Auto-generated method stub
		method2();
	}

	
	static void method2()  {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		int c = 0;
		c = a / b;
		throw new ArithmeticException();
	}

}
