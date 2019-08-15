package com.hefshine.ExceptionHandling;
//4.	WAP to show unchecked exception and use multiple catch blocks.
//9.	WAP to show unchecked exception and use multiple catch blocks.
public class MultipleCatch_4th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		try {
			result = num1 / num2;
		} 
		catch (IllegalArgumentException e) 
		{
			System.out.println("IllegalArgumentException");
		}
		catch(NullPointerException e1) {
		System.out.println("NullPointerException");	
		}
		catch(IndexOutOfBoundsException e2) {
			System.out.println("IndexOutOfBoundsException");
		}
		catch(ArithmeticException e3) {
			System.out.println("ArithmeticException");
		}
		catch(Exception e4) {
			System.out.println("Exception");
		}
	}

}
