package com.hefshine.collectionforset;

import java.util.HashSet;
import java.util.Iterator;

//5.	WAP to add user defined objects of type Employee in a HashSet using duplicate Employee object.
public class UserdefineObject_5th {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDefinedObject_4th ob = new UserDefinedObject_4th();

		HashSet<Employee> emp = new HashSet<Employee>();

		Iterator<Employee> itr = emp.iterator();
		Employee e;

		emp.add(new Employee(101, "Pranav", 123456));
		emp.add(new Employee(102, "priya", 123456));
		emp.add(new Employee(103, "Mohit", 123456));
		emp.add(new Employee(104, "vivek", 123456));

		System.out.println("Employee record inserted");

		System.out.println("INSERTED RECORDS ARE ");
		itr = emp.iterator();
		while (itr.hasNext()) {
			Employee e1 = itr.next();
			System.out.println(e1);
		}
		
		//duplicate added
		System.out.println("INSERTING DUPLICATE OBJECT");
		emp.add(new Employee(101, "DIKSHA", 123456));
		System.out.println("AFTER INSERTION OF DULICATE OBJECT HS WILL BE");

		for (Employee ee : emp)
			System.out.println(ee);

	}

}
