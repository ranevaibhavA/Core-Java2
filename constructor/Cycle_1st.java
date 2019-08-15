package comp.hef.constructor;
/*1.	Create a class Cycle with member variables: int accountNo, int noOfWheels. 
Create a default constructor with a SOP in it “I am default constructor”. 
Create another constructor which takes 2 arguments, 
calls the default constructor using this () and has a SOP in it “I am another constructor”. 
In main method, create an object of type Cycle by using default constructor. Note the output. 
Create another object of type Cycle by using the parameterized constructor.
Note the sequence of SOPs indicating that inner most constructors are called first.
*/
public class Cycle_1st {
int account_no;
int noOfWheels;
	Cycle_1st(){
		System.out.println("I am a Default constructor");
	}
	Cycle_1st(int account_no,int noOfWheels){
		this();											//calling default constructor
		System.out.println("I am a another constructor");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle_1st ob=new Cycle_1st();
		Cycle_1st ob1=new Cycle_1st(0, 0);
	}

}
