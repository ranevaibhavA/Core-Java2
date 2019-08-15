package com.hefshine.collectionQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

//4.	WAP to attempt to remove non-existing elements from a queue
public class RemoveNonExistingElement_4th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PriorityQueue pq = new PriorityQueue();
		System.out.println("ENter the element in Queue");
		for (int i = 0; i < 4; i++) {
			pq.offer(sc.next());

		}
		System.out.println("Enter element to remove");
		String element=sc.next();
		System.out.println(pq.remove(element));
		//System.out.println("If the element is not from list it give false");
		
		
	}

}
