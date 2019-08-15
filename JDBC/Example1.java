package com.hefshine.JDBC;

import java.sql.*;
//2.	WAP to enter and display data of students using database connections.
public class Example1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step 1: LOAD THE TYPE 4 DRIVER
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded successfully");

		// Step 2: PROVIDE THE CONNECTION url pattern/username/password
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "VAIBHAV", "root");
		// the driver manager class returns connection interface implementing class
		// object but the parent interface is holding that object
		// Example1 ob = new Example1();
		// System.out.println(ob.getClass().getName());
		// returns -->projecttest.Example1

		System.out.println(con.getClass().getName());// should return connection
		// returns-->oracle.jdbc.driver.T4CConnection --internal implementation class
		System.out.println("connection established successfully");

		// Step 3: create the statement object using connection
		Statement st1 = con.createStatement();
		System.out.println("statement created successfully");
		String s2 = "drop table studata4";
		st1.executeUpdate(s2);

		// Step 4: create query
		String s1 = "create table studata4(sid number,sname varchar2(20),smarks number)";// updation query
		int x = st1.executeUpdate(s1);
		System.out.println("table created" + x);

		String s3 = "insert into studata4 values (101,'vishwajit',99)";
		String s4 = "insert into studata4 values (102,'sumit',80)";
		ResultSet rs = st1.executeQuery(s3);
		rs=st1.executeQuery(s4);
		String select = "select * from studata4";
		rs = st1.executeQuery(select);

		System.out.println("id" + " 	name" + "    marks");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));

		}
//		String s2 = "drop table studata3";
//		st.executeUpdate(s2);

		// System.out.println("table dropped");
		con.close();
		System.out.println("connection closed successfully");

	}

}
