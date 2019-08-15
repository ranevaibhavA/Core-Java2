package loop_3rd;

import java.util.Scanner;

public class Factorial_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int a=sc.nextInt();
int X=1;
for (int i=1;i<=a;i++)
{
	X=X*i;
	
	
}
System.out.println("factorial of "+a+" is "+X);
	}

}
