package com.hefshine.collectionQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

//3.	WAP to create a Queue with Integer objects 
public class AddInteger_3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		System.out.println("Enter the Integer type element in Queue");
		for (int i = 0; i < 4; i++) {
			try{
				pq.offer(sc.nextInt());
			}catch(Exception e) {
				System.out.println("Enter only Integer value");
			}

		}
		System.out.println("Queue elements are " + pq);

	}

}
