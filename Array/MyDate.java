package com.hefshine.Array;
/*
4.	Create class Dept(did, dname), class MyDate(day, month, year) 
Class Employee(emp_id, emp_name, salary, MyDate (object), dept(object)). 
Create array of Employee and display the array elements.

*/
public class MyDate {
int day;
int month,year;
public MyDate(int day,int month,int year) {
	// TODO Auto-generated constructor stub
this.day=day;
this.month=month;
this.year=year;

}
@Override
public String toString() {
	return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
}
}
