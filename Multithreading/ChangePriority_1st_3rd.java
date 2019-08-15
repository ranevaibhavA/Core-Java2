package com.hefshine.Multithreading;
//1.	Change priorities of thread. Check what values are for MIN_PRIORITY, NORM_PRIORITY and MAX_PRIORITY.
class class1 extends ChangePriority_1st_3rd {
	public void run() {
		System.out.println("another thread");
	}
}

public class ChangePriority_1st_3rd extends Thread {
	public void run() {

		// System.out.println(Thread.currentThread().getPriority());

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangePriority_1st_3rd ob = new ChangePriority_1st_3rd();
		class1 ob1 = new class1();

		System.out.println("Main method");
		System.out.println("main method thread priority "+Thread.currentThread().getPriority());		//it returns main thread priority
				
				
		ob.setPriority(MAX_PRIORITY);								//it set maximum(10) Priority to ob named thread
		System.out.println("max priority of main class "+ob.getPriority());
		
		
		ob.setPriority(MIN_PRIORITY);								//it set minimum(1) Priority to ob named thread
		System.out.println("min priority of main class "+ob.getPriority());
		
		ob.setPriority(NORM_PRIORITY);								//it set normal(5) Priority to ob named thread
		System.out.println("normal priority of main class "+ob.getPriority());
		
		
//		ob.start();
//		ob1.start();
//	
	}

}
