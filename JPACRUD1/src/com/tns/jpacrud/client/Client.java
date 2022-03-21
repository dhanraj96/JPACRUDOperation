package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) 
	{
		// CRUD Operation Calling Activity
		
		Student student = new Student();
		
		StudentService service = new StudentServiceImpl();
		
		// Create Operation
		
		student.setStudentid(80);
		student.setName("Dhanraj");
		service.addStudent(student);

	}

}
