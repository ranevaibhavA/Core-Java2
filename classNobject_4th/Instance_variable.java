package classNobject_4th;

import java.util.Scanner;

public class Instance_variable {
  Scanner sc=new Scanner(System.in);
  int a;
  int b;
  void IP() {
	  System.out.println("ENter 1st number");
	  a=sc.nextInt();
	  System.out.println("Enter 2nd number");
	  b=sc.nextInt();
  
  
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance_variable m1=new Instance_variable();
		m1.IP();
	/*	Instance_variable m2=new Instance_variable();
		int x=m2.Operation();
		System.out.println("Addition is "+x);
		*/
		
		int result=m1.a+m1.b;
		System.out.println("Addition is: "+result);
	
	}

}
