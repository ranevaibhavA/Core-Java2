package com.hefshine.StringCW;

import java.util.Scanner;
//11.Write a Java program to remove all extra blank spaces from a given string.
public class RemoveBlankspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=sc.nextLine();
		System.out.println("Given String is "+str1);
		char chararray[]=str1.toCharArray();
		for(int i=0;i<str1.length();i++) {
			
			if(chararray[i]==' ') {
				chararray[i]='@';
				
			}
		}
		for(int i=0;i<str1.length();i++) {

		System.out.print(chararray[i]);
		}

			
		//System.out.println(str.replaceAll(" ", "@"));		//this method change space into @
		
	}

}
