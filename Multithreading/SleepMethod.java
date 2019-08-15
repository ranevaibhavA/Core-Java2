package com.hefshine.Multithreading;

public class SleepMethod extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child thread");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SleepMethod ob = new SleepMethod();

		ob.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
	System.out.println(ob.getName());
	ob.setName("child thread");
	System.out.println("thread name "+ob.getName());
		System.out.println(Thread.currentThread());
	try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
