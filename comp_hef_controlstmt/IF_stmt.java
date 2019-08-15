package comp_hef_controlstmt;

import java.util.Scanner;

public class IF_stmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1,num2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st number"); 
num1=sc.nextInt();
System.out.println("Enter 2nd number");
num2=sc.nextInt();
if(num1>num2) {
	System.out.println("1st number is greater.which is:- "+num1);
	
}
if(num1<num2) {
	System.out.println("2nd number is greater.which is :- "+num2);
}
	}

}
