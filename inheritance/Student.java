package com.hefshine.inheritance;

import java.util.Scanner;

//Student class has roll,name and Department object should have id and name. Assign and print individual 
//values in main method
class Student extends Department{
		
		static int a;
		static Scanner sc = new Scanner(System.in);
		static {
			System.out.println("enter a ");
			a= sc.nextInt();
		
		}
		
		Student(){
			
			super(a);
			System.out.println("student cons");
		}
		public static void main(String[] args) {
			Student st=new Student();
		
		}
	}

