package com.vcube.dao;

import com.vcube.model.Student;

public interface StudentDAOInterface {
	public String insertStudent(Student s);
	public void getAllStudents();
	public String deleteStudentById(int stdno);
	public String getStudentById(int stdno);
	public String updateStudentById(int stdno, Student s);
}
