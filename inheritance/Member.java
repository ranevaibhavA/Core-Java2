package com.hefshine.inheritance;

import java.util.Scanner;

/*
2.	Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherit the 'Member' class. The 'Employee' and 'Manager' classes 
have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number,
 address and salary to an employee and a manager by making an object of both of these classes and print the same.

*/
public class Member {
	String name;
	int age;
	long Phone_number;
	String Address;
	int Salary;
	Scanner sc = new Scanner(System.in);

	void PrintSalary() {
		System.out.println("Enter the salary");
		Salary = sc.nextInt();
		

	}

	void Input() {
		System.out.println("Enter the name ");
		name = sc.next();
	
		System.out.println("Enter age");
		age = sc.nextInt();
		
		System.out.println("Enter Phone number");
		Phone_number = sc.nextLong();
		
		
		System.out.println("Enter the address");
		Address = sc.next();

	}

}
