package com.hefshine.Multithreading;

public class Extendsthread extends Thread {

	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("Child class ");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Extendsthread extendob = new Extendsthread();
		extendob.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("main thread ");

		}

	}

}
