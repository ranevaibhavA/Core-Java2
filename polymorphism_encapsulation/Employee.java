package com.hefshine.polymorphism_encapsulation;
/*4.	Create one class Employee (emp_id, name, sal) 
 * with private access specifier and create getter and setter. Print the data by creating objects of the class.
*/public class Employee {
static int emp_id;
static String emp_name;
static float salary;
private int getEmp_id() {
	return emp_id;
}
private void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
private String getEmp_name() {
	return emp_name;
}
private void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
private float getSalary() {
	return salary;
}
private void setSalary(float salary) {
	this.salary = salary;
}
public static void main(String[] args) {
	Employee ob=new Employee();
	ob.setEmp_id(1002);
	ob.setEmp_name("John");
	ob.setSalary(60500);
	System.out.println( "Employee name "+emp_name+"\nEmployee Id "+emp_id+"\nemployee salary "+salary);
}
}
