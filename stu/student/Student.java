package stu.student;

import dep.department.Department;

//Child  Class
public class Student extends Department {

	// Create a method
	public void studentName() {
		String name = "Vinothini Baskaran";
		System.out.println("The Student name is :" + name);
	}

	// Create a method
	public void studentDept() {
		String dept = "B.Tech IT";

		System.out.println("The Student Dept  is :" + dept);

	}

	// Create a method
	public void studentId() {
		int id = 15;
		System.out.println("The Student Id is :" + id);

	}

	public static void main(String[] args) {

		// Create an object for child class and access the parent class method ,grandparent class method
		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentId();
		stu.studentDept();
		
		if (1+1+1+1+1==5) {
			System.out.println("true");
		}
		
	}

}
