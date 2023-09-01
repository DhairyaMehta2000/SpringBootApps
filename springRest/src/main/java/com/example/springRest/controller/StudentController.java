package com.example.springRest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springRest.entities.Student;
import com.example.springRest.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	@GetMapping("/")
	public String hello() {
		return "welcome to home page";
	}

	
	@GetMapping("/students")
		public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("students/{studentId}")
	public Student getStudentById(@PathVariable int studentId) {
		return studentService.getStudentById(studentId);
	}
	
	@PostMapping("students/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@PutMapping("students/updateStudent/{studentId}")
	public String updateAStudent(@RequestBody Student student, @PathVariable int studentId){
		return studentService.updateAStudent(student, studentId);
	}
	
	@DeleteMapping("students/{studentId}")
	public String deleteAStudent(@PathVariable int studentId){
		return studentService.deleteStudent(studentId);
		
	}
}
