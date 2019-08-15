package com.hefshine.ExceptionHandling;
//6.WAP to check whether checked Exception is propagated in calling stack 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Propagation_Checked_6th {
	
	void m1() 
	{

		m2();

	}

	void m2() 
	{
		m3();

	}

	void m3()
	{
		// TODO Auto-generated method stub
		m4();

	}
void m4() {
	try {
		FileInputStream file=new FileInputStream("file.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  	//it throws Compile time exception so it cannot handle

}
	void m5() 
	{
		m4();  
	}
public static void main(String[] args) {
	Propagation_Checked_6th ob=new Propagation_Checked_6th();
	ob.m1();

}
}