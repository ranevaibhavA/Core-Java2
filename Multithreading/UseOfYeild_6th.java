package com.hefshine.Multithreading;


class Thread2nd extends UseOfYeild_6th {
	
	public void run() {
	//	t=Thread.currentThread();
			for (int i = 0; i < 11; i++) {
			System.out.println(i);
		
		}
	
	}
}

public class UseOfYeild_6th extends Thread{
	public void run() {
		
		for (char i = 60; i < 70; i++) {
	Thread.yield();
			System.out.println(i);
		}
	}

public static void main(String[] args) {
	UseOfYeild_6th ob=new UseOfYeild_6th();
	Thread2nd ob1=new Thread2nd();
	ob.start();
	ob1.start();
}
}
