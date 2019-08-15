package com.hefshine.abstraction_Interface;

import java.util.Scanner;

abstract class abstractclss {

	abstract void add();

}

public class Implement_1st extends abstractclss {

	@Override
	void add() {
		// TODO Auto-generated method stub
		int num1, num2, res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		num2 = sc.nextInt();
		res = num1 + num2;
		System.out.println("Addition of given numbers is " + res);
	}

	public static void main(String[] args) {
		Implement_1st ob = new Implement_1st();
		ob.add();
	}
}
