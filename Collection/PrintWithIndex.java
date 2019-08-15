package com.hefshine.Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


//6.WAP to print all the elements of an ArrayList using the position of the elements
public class PrintWithIndex {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter elements for array list: ");
		for(int i=0;i<=5;i++) {
			String s=sc.nextLine();
			al.add(s);
		}

			for(int i=0;i<=5;i++) {
		System.out.println("Element "+al.get(i)+" is at position "+i);
				
				
			}			 
			}
		}
		
