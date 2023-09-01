package com.example.springJpaCourseExample.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springJpaCourseExample.Entity.Student;
import com.example.springJpaCourseExample.RepoImpl.StudentRepoImpl;

@RestController
public class StudentController {
	
	@Autowired
	 StudentRepoImpl studentRepoImpl;
	
	@GetMapping("/")
	public String home(){
		return "welcome to home page";
	}
	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentRepoImpl.getAll();
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student){
		return studentRepoImpl.addStudent(student);
	}
	@GetMapping("/students/{studentId}")
	public Student getStudentById(@PathVariable("studentId")long studentId){
		return studentRepoImpl.getStudentById(studentId);
	}
	@PutMapping("/students/{studentId}")
	public Student updateAStudent(@RequestBody Student student,@PathVariable("studentId")long studentId) {
		return studentRepoImpl.updateStudent(student,studentId);
	}
}
