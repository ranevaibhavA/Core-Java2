package com.hefshine.Array;
/*
4.Create class Dept(did, dname), class MyDate(day, month, year) 
Class Employee(emp_id, emp_name, salary, MyDate (object), dept(object)). 
Create array of Employee and display the array elements.

*/public class TestApp_4th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e[]=new Employee [2];			//creat employee datatype's array 
		e[0]=new Employee(01,"peter",20000,new MyDate(12,06,2019),new Dept(10,"Information tech"));
		e[0].disp();
		e[1]=new Employee(02,"John",70000,new MyDate(23,05,2018),new Dept(10,"Information tech"));
	e[1].disp();
	}
}
//e[0]=new Employee(01, "Sumit", "40000", new myDate(12,06,2019),new dept(10, "CSE"))	;
//return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", Salary=" + Salary + ", md=" + md + ", dpt="
//+ dpt + "]";