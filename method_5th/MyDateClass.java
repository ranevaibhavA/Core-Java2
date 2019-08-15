package comp.hef.method_5th;

import java.util.Scanner;

public class MyDateClass {
int day,month,year;
Scanner sc=new Scanner(System.in);
void SetDate() {
	
	System.out.println("ENter day ");
	day=sc.nextInt();
	System.out.println("Enter month");
	month=sc.nextInt();
	System.out.println("Enter year");
	year=sc.nextInt();
	
	
	
}

void DisplayDate(){
	
	System.out.println("you have enter="+day+"/"+month+"/"+year);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDateClass ob= new MyDateClass();
		ob.SetDate();
		ob.DisplayDate();
		
	}
	}