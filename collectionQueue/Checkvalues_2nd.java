package com.hefshine.collectionQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

//2.	WAP to check if a queue has values
public class Checkvalues_2nd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue pq = new PriorityQueue();
		System.out.println("ENter the element in Queue");
		for (int i = 0; i < 4; i++) {
			pq.offer(sc.next());

		}
		System.out.println(pq);
		if(true==pq.isEmpty()) {
			System.out.println("Queue have no element");
		}else {
			System.out.println("Queue has some element");
		}
	}
}
