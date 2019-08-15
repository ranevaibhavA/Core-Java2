package com.hefshine.Array;
/*
4.	Create class Dept(did, dname), class MyDate(day, month, year) 
Class Employee(emp_id, emp_name, salary, MyDate (object), dept(object)). 
Create array of Employee and display the array elements.

*/
public class Employee {
int emp_id;
String emp_name;
float Salary;
MyDate md;
Dept dpt;
public Employee(int emp_id,String emp_name, float Salary,MyDate md,Dept dpt)
 {
	// TODO Auto-generated constructor stub
//e[0]=new Employee(01,"peter","20000",new MyDate(12,06,2019),new Dept(10,"Information tech"));
 this.emp_id=emp_id;
 this.emp_name=emp_name;
 this.Salary=Salary;
 this.md=md;
 this.dpt=dpt;
 
 }

public void disp()
{
	System.out.println(dpt);
	System.out.println("Emp id ="+emp_id+" Emp name ="+emp_name+" Salary ="+Salary);
	System.out.println(md);
	
}




/*@Override
public String toString() {
	return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", Salary=" + Salary + ", md=" + md + ", dpt="
			+ dpt + "]";
}
*/
}
