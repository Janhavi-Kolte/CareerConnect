package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Certificate;
import com.app.entity.Student;
import com.app.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository stuRepo;
	
	//to list all the students
	@Override
	public List<Student> allStudent() {
		
		return stuRepo.findAll();
	}

	//to add student
	@Override
	public Student addStudent(Student stu) {
		
		return null;
	}

	//to update details of student
	@Override
	public Student updateStudent(Student stu) {
		// TODO Auto-generated method stub
		return stuRepo.save(stu);
	}

	//to get student details by id
	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return stuRepo.findById(id).get();
	}

	//to search student by hall ticket no
	@Override
	public Student searchByHallTicket(Long ticketNo) {
		// TODO Auto-generated method stub
		return null;
	}

	//student to add certificate
	@Override
	public boolean addCertificate(Certificate cer) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * @Override public boolean updateCertificate(Certificate cer) { // TODO
	 * Auto-generated method stub return false; }
	 */

	//to delete student by id
	@Override
	public void delteStudent(Long id) {
		// TODO Auto-generated method stub
		stuRepo.deleteById(id);
	}

}
