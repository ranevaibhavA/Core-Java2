package com.hefshine.Multithreading;

/*
9.	Prove following statement in your code.  While a thread executing static synchronized method, 
	the remaining threads are not allowed to execute any static synchronized method of that class simultaneously. 
	But remaining threads are allowed to execute the following methods simultaneously 
	1. Normal static methods 2. Synchronized instance methods 3. Normal instance methods.
*/
class demo1 {
	static synchronized void m1(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(Thread.currentThread().getName() + "Static Synchronized");
		}
	}

	// 1. Normal static methods
	public static void m2() {
		for (int i = 0; i < 3; i++) {
			System.out.println("M2 method from Demo1 class");
		}

	}

//Synchronized instance methods
	synchronized void m3() {
		for (int i = 0; i < 3; i++) {
			System.out.println("M3 method from Demo1 class");
		}
	}

	void m4() {
		for (int i = 0; i < 3; i++) {
			System.out.println("This is M4 method from demo1 class");
		}
	}

}

class Demo2 extends Thread {
	demo1 d1 = new demo1();

	@Override
	public void run() {
		demo1.m1(2);
		demo1.m2();
		d1.m3();
		d1.m4();

	}
}

class Demo3 extends Demo2 {

	@Override
	public void run() {
		demo1.m1(2);
		demo1.m2();
		d1.m3();
		d1.m4();

	}
}

public class ThreeThread_9th extends Demo3 {

	public static void main(String[] args) {
		Demo2 obj2 = new Demo2();
		obj2.start();
		Demo3 obj1 = new Demo3();
		obj1.start();

	}

}
