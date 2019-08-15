package com.hefshine.Multithreading;

//8.	If thread t1 is accessing static synchronized method m1, 
//can thread t2 access synchronized method m2 at same time.
class demo extends Thread {
	static synchronized void m1(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("static synchronize ");
		}
	}

	synchronized void m2() {
		System.out.println("This is synchronized method");
	}
}

class Thread1 extends Thread {
	public void run() {
		demo.m1(5);
	}
}

class Thread2 extends Thread {
	public void run() {
		demo.m1(9);
	}
}

public class StaticSynchronizedMethod_8th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();

		t1.start();
		t2.start();
	}

}
