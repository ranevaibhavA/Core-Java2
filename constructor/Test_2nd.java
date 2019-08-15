package comp.hef.constructor;

import java.util.Scanner;

/*2.	Create a class Test with 2 constructors and 3 methods with zero, one and two parameters respectively. 
 * Methods should perform following programs:
a.	Even odd
b.	Factorial of a number using do-while loop.
c.	Find sum of all digits of a number
	*/
public class Test_2nd {

	static Scanner sc = new Scanner(System.in);

	Test_2nd() {

	}

	Test_2nd(int a) {

	}

	void method() {
		System.out.println("Enter a digit to check Even or odd");
		int a = sc.nextInt();
		if (a % 2 == 0)
			System.out.println("given number is even");
		else
			System.out.println("Given number is odd");

	}

	int method(int num) {
		int fact = 1;
		do {

			fact = fact * num; // fact =3*2*1
			num--;

		} while (num >= 1);
		return fact;

	}

	int add(int num) {
		// addition of 123 means 1+2+3=6
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_2nd ob = new Test_2nd();
		
		ob.method();								//odd even
		
		
		//Factorial
		System.out.println("Enter a number for factorial");
		int num = sc.nextInt();
		int fact = ob.method(num);
		System.out.println("factorial number of " + num + " is " + fact);

		
		//addition
		System.out.println("Enter number for addition");
		int num2 = sc.nextInt();

		int sum = ob.add(num2);
		System.out.println("addition of " + num2 + " is " + sum);

	}

}
