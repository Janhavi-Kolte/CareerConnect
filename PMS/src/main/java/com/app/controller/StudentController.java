package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Student;
import com.app.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentService stuService;

	// to get list of all students
	@GetMapping("/students")
	public List<Student> listStudent() {
		return stuService.allStudent();
	}

	// get student by id

	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
		try {
			Student stu = stuService.getStudentById(id);
			return new ResponseEntity<Student>(stu, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);

		}
	}

	// to add student
	@PostMapping("/students/add")
	public void addStudent(@RequestBody Student stu) {
		stuService.addStudent(stu);
	}

	// update student details
	@PutMapping("/students/{id}")
	public ResponseEntity<?> updateStudent(@RequestBody Student stu, @PathVariable Long id) {
		try {
			Student student = stuService.updateStudent(stu);
			stuService.addStudent(student);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

		}
	}
	
	//delete student
	public void deleteStudent(@PathVariable Long id) {
		stuService.delteStudent(id);
	}

}
