package org.department;

import org.college.College;

public class Department extends College {

	public void deptName()
	{
	
	System.out.println("CSE");
	
	}
	
	public static void main(String[] args)
	{
	
	Department d=new Department();
	d.deptName();
	d.collegeCode();
	d.collegeName();
	d.collegeRank();
	
	}

}
