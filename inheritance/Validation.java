package com.hefshine.inheritance;

public class Validation {
	int RoollNo;
	String name;
	public int getRoollNo() {
		return RoollNo;
	}
	public void setRoollNo(int roollNo) {
		if(RoollNo >0)
		{
			this.RoollNo = roollNo;
		}
		else
		{
			System.out.println("Wrong input");
		}
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
