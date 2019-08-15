package loop_3rd;

import java.util.Scanner;

public class calculate_power_4th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
System.out.println("Enter the power of number");
int power=sc.nextInt();
int X=power;

int result=1;


	do
{

	result*=num;
	--power;
	
}while(power!=0);
	System.out.println("power of "+num+" is "+result);
	
	}

}
