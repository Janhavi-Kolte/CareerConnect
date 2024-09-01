package com.app.service;

import java.util.List;

import com.app.entity.Certificate;
import com.app.entity.Student;

public interface StudentService {
	
	//student methods
	//list of all students
	public List<Student> allStudent();
	
	//to add student
	public Student addStudent(Student stu);
	
	//to update details of student
	public Student updateStudent(Student stu);
	
	//to get student details by id
	public Student getStudentById(Long id);
	
	//to search student by hall ticket no
	public Student searchByHallTicket(Long ticketNo);
	
	//student to add certificate
	public boolean addCertificate(Certificate cer);
	
	//student to update certificate details
	//public boolean updateCertificate(Certificate cer);
	
	//to delete student by id
	public void delteStudent(Long id);
	

}
