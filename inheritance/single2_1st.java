package com.hefshine.inheritance;

import java.util.Scanner;

class Doctor{
	String D_name;
	int D_id;
	String S_name;
	int S_id;
	Scanner sc=new Scanner(System.in);
	void Doctor_detail() {
		System.out.println("Enter name");
		D_name=sc.next();
		System.out.println("Enter Doctor Id ");
		D_id=sc.nextInt();
		System.out.println("Doctr name"+D_name+"\nDoctor Id"+D_id);
	}
}
class Surgen extends Doctor{
	void Surgen_detail(){
		System.out.println("Enter name of surgen");
		S_name=sc.next();
	System.out.println("Enter surgen ID");
	S_id=sc.nextInt();
	System.out.println("name"+D_name+"\nSurgen ID is "+S_id);
	}
}
public class single2_1st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Surgen ob=new Surgen();
ob.Doctor_detail();
ob.Surgen_detail();
	}

}
