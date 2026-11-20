package com.vcube.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.vcube.model.Student;
import com.vcube.utility.DBConnection;

public class StudentDAO implements StudentDAOInterface {
Connection con = null;
String status = "fail";
	@Override
	public String insertStudent(Student s) {
		try {
			con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into student_jdbc values(?,?,?)");
			ps.setInt(1, s.getStdno());
			ps.setString(2, s.getStdname());
			ps.setInt(3, s.getMarks());
			int n = ps.executeUpdate();
			if (n > 0) {
				status = "success";
			} 
		} catch (Exception e) {
			System.out.println(e);
		}
return status;
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
	@Override
	public String deleteStudentById(int stdno) {
		try {
			con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from student_jdbc where stdno = ?");
			ps.setInt(1, stdno);
			int n =ps.executeUpdate();
			if(n>0) {
				status = "success";
			}
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		return status;
	}
	@Override
	public String getStudentById(int stdno) {
		try {
			con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from student_jdbc where stdno = ?");
			ps.setInt(1, stdno);
			ResultSet rs =ps.executeQuery();
			int count = 0;
			while(rs.next()) {
				count++;
			}
			if(count>0) status = "success";
			else System.out.println("failed");
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		return status;
		
	}
	@Override
	public String updateStudentById(int stdno, Student s) {
		try {
			con = DBConnection.getConnection();
			String st = this.getStudentById(stdno);
			if(st.equals("success")) {
			PreparedStatement ps = con.prepareStatement("update student_jdbc set stdname = ?, marks = ? where stdno = ?");
			ps.setString(1, s.getStdname());
			ps.setInt(2, s.getMarks());
			ps.setInt(3, stdno);
			int n =ps.executeUpdate();
			if(n>0) {
				status = "success";
			}
		}
			
			
			
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		return status;
	}

}
