package com.hefshine.Multithreading;
//8.	WAP to execute 2  threads main and child thread, displaying that child thread calls join() 
//and waits for the main thread to get executed first and then gets completed.
public class JoinAndWait_8th extends Thread{
	public static Thread t; 
	public void run() {
		for (char i = 'a'; i < 'k'; i++) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	JoinAndWait_8th obj=new JoinAndWait_8th();
	obj.start();
		for (int i = 1; i < 10; i++) {
			t=Thread.currentThread();
			
			System.out.println(i);
		}
		}

}
