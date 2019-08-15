package com.hefshine.inheritance;

/*
3.	Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print 
the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used 
to initialize length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor 
having a parameter for its side (suppose s) 
calling the constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.
*/
public class Rectangle {
	int length;
	int breadth;
	int area;
	int perimeter;

	public Rectangle(int length,int breadth) {
		// TODO Auto-generated constructor stub

		this.length = length;
		this.breadth = breadth;
	}

	void Area() {
		area = length * breadth;
		System.out.println("Area of rectangle"+area);
	}

	void Perimeter() {
		perimeter = 2 * (length * breadth);
	System.out.println("Perimeter of Rectangle is "+perimeter);
	}
}
