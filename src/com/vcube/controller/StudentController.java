package com.vcube.controller;

import com.vcube.dao.StudentDAO;
import com.vcube.model.Student;

public class StudentController {

	public static void main(String[] args) {
		StudentDAO sd = new StudentDAO();
		
		/*
		 * Student s = new Student(); s.setStdno(6); s.setStdname("krupa Rao");
		 * s.setMarks(100);
		 */
			/*
			 * String status = sd.insertStudent(s); if(status.equals("success")) {
			 * System.out.println("rows inserted successfully"); } else
			 * System.out.println("something went wrong");
			 */
		 
		//sd.deleteStudentById(4);
		  //sd.updateStudentById(6, s);
		//sd.getAllStudents();
		  sd.getStudentById(6);

	}

}
