package com.hefshine.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//12.	WAP to show the usage of throw and throws for checked exceptions.
public class ThrowsChecked {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		m1();
	}

	static void m1() throws FileNotFoundException  {
		// TODO Auto-generated method stub
		 m2();					//if we forword exception to method then it gives exception to calling method								
		
	}

	static void m2() throws FileNotFoundException     {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("text.txt");			//if we dont provide throw then it give compiler exception
	    
		throw new FileNotFoundException();
	}

}
