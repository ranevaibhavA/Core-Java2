

package com.hefshine.Multithreading;

/*
10.	A consumer threads consumes chocolates from a basket, producer thread produces fixed number of chocolates 
at a time. Write a program in which consumer thread checks for sufficient chocolates in basket, 
it waits for producer to produce if sufficient chocolates are not available in the basket and then consumes
 given number of chocolates.
 Producer thread will notify consumer thread after it finishes producing chocolates.
*/
class chock {
	int ch = 0;

	synchronized void producechocolate(int n) {
		if (ch > 20) {
			try {
				System.out.println(Thread.currentThread().getName() + "Producer waiting");

				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ch = ch + n; // it will produce chocolate
		System.out.println(Thread.currentThread().getName() + "Produce chocolate");
		notify();
	}

	synchronized void consumeChocolate() {
		if (ch < 20) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		while (ch > 7) {
			ch = ch - 7;
			System.out.println(Thread.currentThread().getName() + "remaining chocolate after consuming " + ch);
		}
		notify();

	}// method

}// class chock

class producer extends Thread {

	chock cq;

	public producer(chock cq) {
		// TODO Auto-generated constructor stub

		this.cq = cq;
	}

	public void run() {
		int c = 10;
		int cnt = 0;
		while (cnt < 10) {
			cq.producechocolate(c);
			cnt++;
		} // while
	}// run method

}// class producer

class consumer extends Thread {
	chock cq;
	producer p;

	public consumer() {
		// TODO Auto-generated constructor stub
		this.cq = cq;
		this.p = p;

	}

	public void run() {
		while(true)							//for infinity
		{
			cq.consumeChocolate();
		}
	
	}//run method

}//class consumer

public class ChocolateDemoByme_10th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Chock ch=new Chock();
Producer p=new Producer(ch);

p.start();

Consumer cm=new Consumer(ch, p);

cm.start();

	}

}
