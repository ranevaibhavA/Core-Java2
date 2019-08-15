package comp_hef_controlstmt;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number,which You want to check");
num1=sc.nextInt();
if(num1%2==0) {
	System.out.println("Given Number is Even");
}
else
	System.out.println("Given number is ODD");
	}

}
