package com.hefshine.inheritance;

import java.util.Scanner;

class Teacher{
	String name;
	String sub;
	int mo_no;
	Scanner sc=new Scanner(System.in);
	void detail() {
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter mobile number");
		mo_no=sc.nextInt();
	}
}
public class SubTeacher extends Teacher{
void Specialization() {
	System.out.println("enter subject");
	sub=sc.next();
	System.out.println("Name="+name+"\nMobile number "+mo_no+"\nSubject "+sub);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SubTeacher ob=new SubTeacher();
ob.detail();
ob.Specialization();
	}

}
