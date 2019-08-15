package classNobject_4th;

import java.util.Scanner;

public class Add_sum_usingMETHOD {
	


	int Add() {
		Scanner sc = new Scanner(System.in);
System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
	int result = num1 + num2;
	System.out.println("addition is "+result);
	return result;
	
	}
int Sub() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int num1=sc.nextInt();
	System.out.println("Enter second number");
	int num2=sc.nextInt();
	int result=num1-num2;
	System.out.println("substraction of given numbers is"+result);
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add_sum_usingMETHOD m1=new Add_sum_usingMETHOD();
		int r=m1.Add();
		System.out.println("method 1 o/p is "+ r);
		Add_sum_usingMETHOD m2=new Add_sum_usingMETHOD();
		int r2=m2.Sub();
		System.out.println("method 2nd O/P is"+r2);
		}
}