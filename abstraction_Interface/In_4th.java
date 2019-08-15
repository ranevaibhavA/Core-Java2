package com.hefshine.abstraction_Interface;

interface Interfce1{
	void  method1();//by default public and abstract
	default void method2() {
		System.out.println("in method m2");
	}
	static void method3() {
		System.out.println("in static method");
	}	
}
public class In_4th implements Interfce1{

	@Override
	public
	 void method1() {
		// TODO Auto-generated method stub
		System.out.println("in method 1");
		
	}
	public void method2() {
		System.out.println("overriding method 2");
	}
	
	static void method3() {
		System.out.println("in method 3");
	}
	public static void main(String[] args)
	{
		In_4th ob = new In_4th();
		ob.method1();
		ob.method2();
		In_4th.method3(); //class
		Interfce1.method3(); //interfa
		
		    
	}
	

}
