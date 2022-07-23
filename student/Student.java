package org.student;

import org.college.College;
import org.department.Department;

public class Student {

	public void studentName() {
		
		System.out.println("Student name is BhuviGokul");
	}
	
	public void studentDept() {
		
		System.out.println("Student department is Bio Tech");
	}
	
	public void studentID() {
		
		System.out.println("Student ID is 2205BT");
	}
	
	public static void main(String[] args) {
		
		College clg=new College();
		clg.collegeName();
		
		College clg1=new College();
		clg1.collegeCode();
		
		College clg2=new College();
		clg2.collegeRank();
		
		Department dept=new Department();
		dept.deptName();
		
		Student stu=new Student();
		stu.studentName();
		
		Student stu1=new Student();
		stu1.studentDept();
		
		Student stu2=new Student();
		stu2.studentID();
	}
	
}
