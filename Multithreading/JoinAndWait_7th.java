package com.hefshine.Multithreading;
//7.WAP to execute 2 threads main and child thread, 

//	displaying that main thread calls join() and wait() for the child thread to get
//	executed first and then gets completed.

public class JoinAndWait_7th extends Thread {
	public void run() {
		for (char i = 'a'; i < 'k'; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinAndWait_7th obj = new JoinAndWait_7th();
		obj.start();

		for (int i = 0; i < 11; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				obj.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}

}
