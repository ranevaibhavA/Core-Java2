package com.hefshine.abstraction_Interface;
/*
2.	Create an abstract class Machine with an implemented / concrete method rotate and an abstract method crush. 
Create a class Juicer which extends this abstract class Machine and implements method crush. 
Now, add another method filter in the class Juicer. In main method,
a.	Create an object of type Juicer and calls its crush, rotate and filter methods.
b.	Create an object of type Juicer with reference variable of Machine (Machine m = new Juicer). 
Check the methods available to m.

*/public abstract class Machine {
void rotate() {
	System.out.println("method of abstract class rotate");
}
abstract void Crush();
}

class Juicer extends Machine {
	


@Override
void Crush() {
	// TODO Auto-generated method stub
	System.out.println("in implemented crush method of Machine class");	
}
void Filter() {
	System.out.println("in filter method of Juicer class");
}
public static void main(String[] args) {
	Juicer objuicer=new Juicer();
	objuicer.Crush();
	objuicer.rotate();
	objuicer.Filter();

Machine m=new Juicer();
m.Crush();
m.rotate();
}
}