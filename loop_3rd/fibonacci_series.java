package loop_3rd;

import java.util.Scanner;

public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the terms you want to print:-");
int n=sc.nextInt();
int a=1;
int num1=11;
int num2=12;
System.out.println("first "+ n + " terms");
 for (a = 1 ; a <= n ; ++a ) { 
	 System.out.println(num1+" ");
	 
	 int sum=num1+num2;
	 num1=num2;
	 num2=sum;
 }
	
	}

}