package com.hefshine.inheritance;
/* Let class 'Square' inherit the 'Rectangle' class with its constructor 
having a parameter for its side (suppose s) 
calling the constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.
*/
public class Square extends Rectangle {
int side;
	public Square(int side) {
	// TODO Auto-generated constructor stub

		super(12,12);
		super.Area();
		super.Perimeter();
		this.side=side;
		
}
	void Area() {
		area=side*side;
		System.out.println("area of square is "+area);
	}
	void Perimeter() {
		int perimeter=4*(side);
		System.out.println("Perimeter if Square is "+perimeter);
	}
public static void main(String[] args) {
	Square square=new Square(9);
	square.Area();
	square.Perimeter();
	
}
}
