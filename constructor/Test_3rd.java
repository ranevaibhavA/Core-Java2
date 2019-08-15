package comp.hef.constructor;

public class Test_3rd {
//3.	Create a class Test, create 4 constructors explaining the concept of constructor overloading.
	
	 Test_3rd() {
	this(1);
		 System.out.println("hello,this constructor with no args");
	}
	Test_3rd(int num){
		this(1,2);
		System.out.println("Hey,this is Constructor with 1 args");
	}
	Test_3rd(int num1,int num2){
		this (1,2,3);
		System.out.println("hi,this is constructor with 2args");
	}
	Test_3rd(int num1,int num2,int num3){
		System.out.println("hey,this is 3 args wala constructor");
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test_3rd ob=new Test_3rd();
	}

}
