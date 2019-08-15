package user_ip;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int principal;
		double rate;
		int time;
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("enter ur principal amount");
		principal=sc.nextInt();
		System.out.println("Enter rate of interest");
		rate=sc.nextDouble();
		System.out.println("Enter the time");
		time=sc.nextInt();
		double interest=(principal*rate*time)/100;
		System.out.println("interest for given principal,rate,time is:- "+interest);
		
	}

}
