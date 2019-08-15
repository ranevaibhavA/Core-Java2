package com.hefshine.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

import javax.annotation.processing.FilerException;

//10.WAP to show checked exception and use multiple catch block with Exception handler.
public class CheckedMultipleCatch_10 {

	void m1() 
	{
		// TODO Auto-generated method stub
		try {
			FileInputStream file=new FileInputStream("file.txt");  	//it throws Compile time exception.
		} 
		/*catch(FilerException e1) {	//cannot acess multiple catch blocks 
			System.out.println("FilerException");
		}
		*/
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not found exception");
			e.printStackTrace();
		}  
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
