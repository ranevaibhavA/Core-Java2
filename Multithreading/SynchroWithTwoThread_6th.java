package com.hefshine.Multithreading;
/*6.Show example of synchronized method in which two threads are trying to update same thread.*/


class Sender {

	void send(String msg) {
		System.out.println("\nSending.... " + msg);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(msg + "\nMassage sent successfully\n");
	}
}

class ThreadSend extends Thread {

	String msg;
	Sender sender;

	public ThreadSend(String msg, Sender sender) {
		this.msg = msg;
		this.sender = sender;
	}

	@Override
	public void run() {
		synchronized (sender) {
			sender.send(msg);
		}
	}
}

public class SynchroWithTwoThread_6th {
	
	public static void main(String[] args) {
		Sender sn = new Sender();
		ThreadSend ts = new ThreadSend("\nHiii, How are you? ", sn);
		System.out.println(ts.getName() + " Executed");
		ts.start();
		ThreadSend ts1 = new ThreadSend("\nI am Fine. ", sn);
		System.out.println(ts1.getName() + " Executed");
		ts1.start();
	}


}
