package com.hefshine.Multithreading;

public class ImplementRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	for(int i=0;i<5;i++) {
		System.out.println("child thread ");
	}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ImplementRunnable ob=new ImplementRunnable();
Thread t=new Thread(ob);
t.start();
for(int i=0;i<5;i++) {
	System.out.println("main thread ");
}

	}

	

	
}
