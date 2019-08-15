package com.hefshine.polymorphism_encapsulation;

public class ConstruOverload {
	public ConstruOverload() {
		// TODO Auto-generated constructor stub
	System.out.println("thjis is default constructor");
												//same constructor name but diff parameter
	}
ConstruOverload(int a){
	System.out.println("this is parameterised constructor ");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstruOverload ob=new ConstruOverload();
ConstruOverload ob1=new ConstruOverload(1);

	}

}
