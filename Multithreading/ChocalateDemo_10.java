package com.hefshine.Multithreading;
/*
10.	A consumer threads consumes chocolates from a basket, producer thread produces fixed number of chocolates 
at a time. Write a program in which consumer thread checks for sufficient chocolates in basket, 
it waits for producer to produce if sufficient chocolates are not available in the basket and then consumes
 given number of chocolates.
 Producer thread will notify consumer thread after it finishes producing chocolates.
*/
class Chock
{   
	int ch=0;
	synchronized void produceChocalate(int n)
	{   
	if(ch>=20)
	   {
		 try
		 {
		  System.out.println(Thread.currentThread().getName()+" producer waiting");
		  wait();
		 }
		 catch(Exception e)
		 {
			System.out.println(e);
		 }
	   }//if
		try {
			Thread.currentThread().sleep(3000);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 ch=ch+n;
			 System.out.println(Thread.currentThread().getName()+" Produce chocalate "+ch);
			 notify();//it will notify to another thread in the queue
	}//produceChocalate
	

synchronized void consumeChocalate()
	{
		if(ch<20)
		{
			try
			{
			System.out.println(Thread.currentThread().getName()+" Consumer waiting");
		    wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			try {
				Thread.currentThread().sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}  
		    while(ch>7)
		    {
		    ch=ch-7;
			System.out.println(Thread.currentThread().getName()+" Remaining  chocalate after consuming"+ch);
		    }
		
			notify();
	}
}
class Producer extends Thread
{
	Chock cq;
	Producer(Chock cq)
	{
		this.cq=cq;
	}
	public void run()
	{   int c=10;
		int cnt=0;
		while(cnt<10)
		{
		cq.produceChocalate(c);
		cnt++;
		}		
	}
}
class Consumer extends Thread
{
	Chock cq;
	Producer p;
	Consumer(Chock cq,Producer p)
	{
		
		this.cq=cq;
		this.p=p;
	}
	public void run()
	{
		while(true)
		{
		cq.consumeChocalate();
		}
	}
}
public class ChocalateDemo_10 {
	
	public static void main(String[] args) {
		
		Chock ch=new Chock();
		
		Producer p=new Producer(ch);
		
		p.start();
		
		Consumer cm=new Consumer(ch,p);
		
		cm.start();

	}

}

