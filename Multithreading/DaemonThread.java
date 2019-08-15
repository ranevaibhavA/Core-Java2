package com.hefshine.Multithreading;

//5.WAP to show example of daemon thread.
public class DaemonThread extends Thread {
	public void run() {
		//System.out.println("Child Thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThread ob = new DaemonThread();
		System.out.println("Is there child thread is daemon?? \n " + ob.isDaemon());
		ob.setDaemon(true);			//we can change child thread nature before it will start
									//after start we cannot change nature

		ob.start();
	
		System.out.println("now Is there child thread is daemon?? \n " + ob.isDaemon());

		System.out.println("is main method is alredy daemon??\n" + Thread.currentThread().isDaemon());
		
		// set nature of main method
		//Thread.currentThread().setDaemon(true); // we cannot change nature of main thread.if we run that it gives
												// IllegalstateException

		System.out.println("Can we change main method nature?\n" + Thread.currentThread().isDaemon());
	}

}
