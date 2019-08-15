package com.hefshine.Collection;
//12.	WAP to iterate a linked list in reverse order.
import java.util.LinkedList;
import java.util.Scanner;

public class Iterate_Reverse_12th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linklist = new LinkedList();
		Scanner sc = new Scanner(System.in);

		linklist.addFirst("first");
		System.out.println("Enter 4 elements in linklist");
		for (int i = 1; i <= 5; i++) {
			String e = sc.nextLine();
			linklist.add(e);
		}
		System.out.print(linklist + " ");
		System.out.println();
		System.out.println("Reverse linklist is ");
		//System.out.println(linklist.get(3));
		for (int i = 5; i >=0; i--) {
			System.out.print(linklist.get(i)+" ");
		}
	}

}
