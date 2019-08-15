package comp.hef.method_5th;

import java.util.Scanner;

public class Assignvalue_3rd {
	Scanner sc=new Scanner(System.in);
	
			int x, y; 
			Assignvalue_3rd() 			//constructor
		    { 
		        
				System.out.println("Enter a number");
				x=sc.nextInt();
				
				
			System.out.println("Enter second number"); 
		        y=sc.nextInt(); 
		    } 
			 
			public static void main(String[] args) {
				 
				Assignvalue_3rd ob1 = new Assignvalue_3rd();    //creat constructor object 
				 
				  
		        System.out.println("ob1 object: "+ob1.x + " " + ob1.y); 	//accessing value of constructor
		 
		        Assignvalue_3rd ob2 = ob1; 		//changing value of ob1 to ob2
		        
		        
		        System.out.println("after copy object value in ob2 is "+ob2.x+" "+ob2.y); 
		        
		        
		        ob2.x = 100; 				//assigning new value to x
		 
		        System.out.println("reflected data "+ob1.x+" "+ob1.y); 
		        
		        
		        System.out.println(ob2.x+" "+ob2.y); 

			}

		
	}


