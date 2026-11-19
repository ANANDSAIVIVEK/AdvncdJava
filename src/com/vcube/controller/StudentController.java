package com.vcube.controller;

import com.vcube.dao.StudentDAO;
import com.vcube.model.Student;

public class StudentController {

	public static void main(String[] args) {
		StudentDAO sd = new StudentDAO();
		Student s = new Student();
		s.setStdno(5);
		s.setStdname("sai kumar");
		s.setMarks(100);
		sd.insertStudent(s);
		sd.getAllStudents();

	}

}
