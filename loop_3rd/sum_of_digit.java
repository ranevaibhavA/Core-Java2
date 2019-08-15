package loop_3rd;

import java.util.Scanner;

public class sum_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter number to sum");
int a=sc.nextInt();
int sum=0;
while(a>0)
	{int b=a%10;
	 sum=sum+b;
	 a=a/10;
	}
System.out.println("sum of given number is"+sum);
	}
	

}
