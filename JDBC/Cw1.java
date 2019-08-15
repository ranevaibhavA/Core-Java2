package com.hefshine.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Cw1 {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Step 1:	LOAD THE TYPE 4 DRIVER
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded successfully");
		
		//Step 2:  PROVIDE THE CONNECTION				url pattern/username/password
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","root"); 
		// the driver manager class  returns connection interface implementing class 
		// object but the parent interface is holding that object
		//Example1 ob = new Example1();
		//System.out.println(ob.getClass().getName());
		//returns -->projecttest.Example1
		
		System.out.println(con.getClass().getName());//should return connection
		//returns-->oracle.jdbc.driver.T4CConnection --internal implementation class
		System.out.println("conn"
				+ "ection established successfully");
		
		//Step 3: create the statement object using connection 
		Statement st=con.createStatement(); 
		System.out.println("statement created successfully");
		
		//Step 4: create query
		String s1="create table studata2(sid number,sname varchar2(20),smarks number)";//updation query
			int x=st.executeUpdate(s1);
			System.out.println("table created"+x);
			
			String s2="drop table studata2";
			st.executeUpdate(s2);
			
			System.out.println("table dropped");
			con.close();
			System.out.println("connection closed successfully");
			
	}

}
