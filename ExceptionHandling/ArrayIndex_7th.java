package com.hefshine.ExceptionHandling;
//6.	 7.	WAP to show the scenario in which ArrayInexOutOfBound Exception is generated and handle this exception.
public class ArrayIndex_7th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array=new int[5];
		try
{
	
	array[6]=10;

}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array size less than you enter");
		}

	}

}
