package com.hefshine.Array;
/*
4.	Create class Dept(did, dname), class MyDate(day, month, year) 
Class Employee(emp_id, emp_name, salary, MyDate (object), dept(object)).
 Create array of Employee and display the array elements.

*/
public class Dept {
int d_id;
String D_name;
public Dept(int d_id,String D_name) {
	// TODO Auto-generated constructor stub
this.d_id=d_id;
this.D_name=D_name;


}
@Override
public String toString() {
	return "Dept [d_id=" + d_id + ", D_name=" + D_name + "]";
}
}
