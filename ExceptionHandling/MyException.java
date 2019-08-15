package com.hefshine.ExceptionHandling;

public class MyException extends Exception{

	public  MyException() {
		super();
		System.out.println("Divide by zero exception");
	}
}
