package com.hefshine.Multithreading;
//2.	WAP to show use of sleep method.

public class SleepMethod_2 extends Thread {
	public void run() {
		for (char i = 'a'; i < 'k'; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepMethod_2 obj = new SleepMethod_2();
		obj.start();

	}

}
