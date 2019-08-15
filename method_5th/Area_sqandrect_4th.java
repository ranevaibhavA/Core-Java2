package comp.hef.method_5th;

import java.util.Scanner;

public class Area_sqandrect_4th {
		int area=0;
		
		void area(int side)
		{
			area=side*side;
			System.out.println("the area of square: "+area);
		}
		
		void area(int length,int breadth) 
		{
			area=length*breadth;
			System.out.println("the area of rectangle: "+area);
		}

		public static void main(String[] args) {
			Area_sqandrect_4th ob = new Area_sqandrect_4th();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter the side of a square: ");
			int side=sc.nextInt();									//get input for 1st method
			ob.area(side);
			
			System.out.println("enter the length of a rectangle: ");
			int length=sc.nextInt();						//get ip for 2nd method	
			
			System.out.println("enter the breadth of a rectangle: ");
			int breadth=sc.nextInt();						//get Ip for 2nd method
			ob.area(length, breadth);								//call the method with args
			

		}

	}
