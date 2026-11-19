package com.vcube.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.vcube.model.Student;
import com.vcube.utility.DBConnection;

public class StudentDAO implements StudentDAOInterface {
Connection con = null;
	@Override
	public void insertStudent(Student s) {
		try {
			con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into student_jdbc values(?,?,?)");
			ps.setInt(1, s.getStdno());
			ps.setString(2, s.getStdname());
			ps.setInt(3, s.getMarks());
			int n = ps.executeUpdate();
			if (n > 0) {
				System.out.println(n + " row(s) affected");
			} else {
				System.out.println("something went wrong...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	@Override
	public void getAllStudents() {
		try {
			con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from student_jdbc");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3));
			} 
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
