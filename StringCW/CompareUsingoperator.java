package com.hefshine.StringCW;
//1.	Compare string using new operator when.
public class CompareUsingoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str1=new String("Hello");
			String str2=new String ("world");
			
		System.out.println(str1==str2);		//== operator compare reference of string it returns true or false value 
		
		
		System.out.println(str1.equals(str2));		// equals to method compare the content of that string
		if(str1.compareTo(str2)<0) {						//compare using lexographically and returns diff between both string
			 System.out.println(str1+" comes first");
		}else if(str1.compareTo(str2)>0){
		System.out.println(str2+" comes first");	
		}else System.out.println(str1+ " same as "+ str2);
					
		System.out.println(str1.equalsIgnoreCase(str2));	//compare with ignore of whether it is lowercsse or uppercase
	
	}

}
