package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Malarvizhi");

	}
	public void studentDept() {
		
		System.out.println("Computer Science and Engineering");

	}
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("1535336");

	}
	
	public static void main(String[] args){
		Student s=new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
	}
	
	

}
