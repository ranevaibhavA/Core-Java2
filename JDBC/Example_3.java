package com.hefshine.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//3.	WAP using JDBC to select and print employee names along with their manager names.
public class Example_3 {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loading done");
		// "jdbc:oracle:thin:@localhost:1521:XE", "VAIBHAV", "root"
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "VAIBHAV", "root");
		System.out.println("Connection establish succesfully");

		Statement st = con.createStatement();
		String s1 = "Drop table employee1";
		st.executeQuery(s1);
		String s2 = "create table employee1(empID number,empname varchar2(20),managername varchar2(20))";
		st.executeQuery(s2);
		System.out.println("TABLE CREATED");
		String s3 = "desc employee1";
		//ResultSet rs = st.executeQuery(s3);
//		System.out.println("DISCRIPTION OF TABLE");
		String s4 = "insert into employee1(1,'vaibhav','man1')";
		ResultSet rs = st.executeQuery(s4);
		
	System.out.println("1 QUERY AFFECTED");
		String select = "select * from studata4";
		rs = st.executeQuery(select);
		System.out.println("TABLE SHOWN");
while(rs.next()) {
	System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3));
}

con.close();
System.out.println("CONNECTION CLOSED");		
		
	}
}
