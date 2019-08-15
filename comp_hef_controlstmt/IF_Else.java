package comp_hef_controlstmt;

import java.util.Scanner;

public class IF_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int value1,value2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:-");
value1=sc.nextInt();
System.out.println("Enter the second value:-");
value2=sc.nextInt();
if(value1>value2) {
	System.out.println("First value is greater than second");
}
else
	System.out.println("second value is greater");

	}

}
