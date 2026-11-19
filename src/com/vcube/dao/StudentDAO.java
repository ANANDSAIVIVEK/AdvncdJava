package com.vcube.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class StudentDAO {

	public static void main(String[] args) {
		try {
			// 1.Driver loading/Register (database specific different syntax for different database)
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Establish Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vcubesql", "root","root");
			// 3. create statements
			Statement st = con.createStatement();
			// 4. Result
			int n = st.executeUpdate("insert into student_jdbc values(2,'sai',100)");
			if(n>0) {
				System.out.println(n+" rows affected");
			}
			else {
				System.out.println("Something went wrong...");
			}
			// 5.Connection close

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
