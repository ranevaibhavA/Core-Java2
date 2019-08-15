package com.hefshine.inheritance;

public class Manager extends Member {
	String Department;

	void Dept() {
		super.Input();
		super.PrintSalary();
		System.out.println("Enter your department");
		Department = sc.next();

		// show data
		System.out.println("your name " + name + "\nAge " + age + "\nPhone number " + Phone_number + "\nAddress " + Address);
		System.out.println("Your department " + Department + "Salary" + Salary);
	}

}
