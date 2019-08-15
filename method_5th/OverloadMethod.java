package comp.hef.method_5th;

import java.util.Scanner;

public class OverloadMethod {

	

	void m1() {
		System.out.println("hi");
	
	}
void m1(int b) {
	System.out.println("hello");
	
}
	void m1(int a,int b) {
		
		int result=a+b;
		System.out.println("Result of "+a+" and "+b+" is "+result);
	}
	
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		OverloadMethod ob=new OverloadMethod();
		ob.m1();
		ob.m1(2);
		System.out.println("ENter a number in a");
		int a=sc.nextInt();
		System.out.println("Enter second number in b");
		int b=sc.nextInt();
		
		
		
		ob.m1(a, b);
	}

}
