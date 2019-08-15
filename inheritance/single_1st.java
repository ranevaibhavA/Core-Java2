package com.hefshine.inheritance;

import java.util.Scanner;

class operation {
	Scanner sc = new Scanner(System.in);
	int num1, num2, num3, result;

	void input() {
		System.out.println("Enter a number");
		num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		num2 = sc.nextInt();
		System.out.println("Enter 3rd number");
		num3 = sc.nextInt();

	}

}

public class single_1st extends operation {

	int Addition() {
		result = num1 + num2 + num3;

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		single_1st ob = new single_1st();
		ob.input();
		int result = ob.Addition();
		System.out.println("addition of 3 numbers is " + result);
	}

}
