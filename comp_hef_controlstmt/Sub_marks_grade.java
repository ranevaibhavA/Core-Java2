package comp_hef_controlstmt;

import java.util.Scanner;

public class Sub_marks_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float phy,bio,chem,math,comp,obtain_marks,percentage;
char grade;
Scanner sc=new Scanner(System.in);

System.out.println("Enter the marks of physics ");
phy=sc.nextFloat();
System.out.println("Enter the marks of biology");
bio=sc.nextFloat();
System.out.println("Enter the marks of chemistry ");
chem=sc.nextFloat();
System.out.println("Enter the marks of Mathematic ");
math=sc.nextFloat();
System.out.println("Enter the marks of computer ");
comp=sc.nextFloat();

obtain_marks=phy+bio+chem+math+comp;
System.out.println(obtain_marks);
percentage=(obtain_marks*100)/500;           //calculate percentage
	System.out.println(percentage);
	//grade calculation
	if(percentage>=90) {
		System.out.println("You got A grade");
		
	}else if (percentage>=80) {
		
		System.out.println("You get B grade");
	}
	else if(percentage>=70) {
		System.out.println("You got C grade");
	}else 
		System.out.println("You are Fail");
	}

}
