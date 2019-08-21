package com.utilities;

import java.util.List;

public class Exams {
	int id;
	String examname;
	Results result;
	Examiner examiner;
	public Examiner getExaminer() {
		return examiner;
	}
	public void setExaminer(Examiner examiner) {
		this.examiner = examiner;
	}
	List<Student> students;
	
	public Exams() {
		super();
	}
	public Exams(int id, String examname, Examiner examiner,List<Student> students) {
		super();
		this.id = id;
		this.examname = examname;
		this.students=students;
	}
	
	
	public Results getResult() {
		return result;
	}
	public void setResult(Results result) {
		this.result = result;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getExamname() {
		return examname;
	}
	public void setExamname(String examname) {
		this.examname = examname;
	}
	
}
