package com.hefshine.inheritance;

import java.util.Scanner;

//4.WAP to have Department class created with id, name. Student class has roll, 
//name and Department object should have id and name. Assign and print individual values in main method
public class Department {
int id;
String name;
Scanner sc=new Scanner(System.in);

public Department(int a) {
	// TODO Auto-generated constructor stub

System.out.println("Department constructor");
System.out.println(a);
}
}