package com.hefshine.collectionQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

//1.	Use 2 different method calls to add elements to a queue.
public class AddElementQueue_1st {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	PriorityQueue PQ=new PriorityQueue();
	System.out.println("ENter the element in Queue");
	for(int i=0;i<4;i++) {
		PQ.offer(sc.next());
		
	}
	PQ.add("byaddmethod");
	System.out.println("elements from Queue "+PQ);
	System.out.println("heterogenous allowed");
	
	}
}
