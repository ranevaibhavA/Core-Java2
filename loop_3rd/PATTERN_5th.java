package loop_3rd;

import java.util.Scanner;

public class PATTERN_5th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter how many rows you want to print:- ");
int strt=sc.nextInt();
int i,a;
for(i=strt;i>=1;i--) {
	for(a=1;a<=i;a++)
	{
		System.out.print(" * ");
}System.out.println();
	}

}}