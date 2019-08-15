package com.hefshine.inheritance;

/*
Two classes 'Employee' and 'Manager' inherit the 'Member' class. The 'Employee' and 'Manager' classes 
have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number,
 address and salary to an employee and a manager by making an object of both of these classes and print the same.
*/
public class Employee extends Member {
	String Specialization;

	void Specialization() {
		super.Input();
		super.PrintSalary();

		System.out.println("Enter Speciliazation");
		Specialization = sc.next();
		System.out.println("your name " + name + "\nAge " + age + "\nPhone number " + Phone_number + "\nAddress " + Address);
		System.out.println("Salary "+Salary+"Specilization "+Specialization);
	}

}
