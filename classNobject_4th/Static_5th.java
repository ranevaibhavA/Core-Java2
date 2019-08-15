package classNobject_4th;

import java.util.Scanner;

public class Static_5th {
Scanner sc=new Scanner(System.in);
	static int a,b;
	void IP(){
		System.out.println("enter 1st static variabel");
		a=sc.nextInt();
		System.out.println("Enter 2nd ststic variable");
		b=sc.nextInt();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_5th ob1=new Static_5th();
	
		ob1.IP();
		int result=ob1.a+ob1.b;
		
		System.out.println("addition is "+result);
	
	}

}