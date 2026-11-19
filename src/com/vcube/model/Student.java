package com.vcube.model;

public class Student {

	private int stdno;
	private String stdname;
	private int marks;
	
	public Student() {}
	
	public Student(int no, String name, int marks) {
		this.stdno = no;
		this.stdname = name;
		this.marks = marks;
	}

	public int getStdno() {
		return stdno;
	}

	public void setStdno(int stdno) {
		this.stdno = stdno;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public String toString() {
		return stdno+":"+stdname+":"+marks;
	}
}
