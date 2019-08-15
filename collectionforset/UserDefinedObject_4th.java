package com.hefshine.collectionforset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;



//4.	WAP to add user defined objects of type Employee in a HashSet. Print the contents in the Set.
public class UserDefinedObject_4th {

		static Scanner sc = new Scanner(System.in);
		HashSet<Employee> emp = new HashSet<Employee>();

		Iterator<Employee> itr = emp.iterator();
		Employee e;

		void addEmployee() {

			System.out.println("Enter empId");
			int eid = sc.nextInt();
			System.out.println("Enter empName");
			String ename = sc.next();
			System.out.println("Enter emp salry");
			float sal = sc.nextFloat();

			e = new Employee(eid, ename, sal);
			emp.add(e);

			System.out.println("Employee record inserted");

		}

		public void displayData() {
			System.out.println("INSERTED RECORDS ARE ");

			itr = emp.iterator();
			while (itr.hasNext()) {
				Employee e1 = itr.next();
				System.out.println(e1);
			}

		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			UserDefinedObject_4th ob = new UserDefinedObject_4th();

			do {

				System.out.println("\n*****MENU*****");
				System.out.println("1.Add Employee");
				System.out.println("2.Display Employee");
				System.out.println("3.Exit");

				System.out.println("Enter ur choice");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					ob.addEmployee();
					break;

				case 2:
					ob.displayData();
					break;
				case 3:
					System.exit(0);

				default:
					System.out.println("Enter correct choice");
					break;
				}
			} while (true);
		}

	}


