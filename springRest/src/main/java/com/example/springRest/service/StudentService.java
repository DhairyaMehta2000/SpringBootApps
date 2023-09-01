package com.example.springRest.service;

import java.util.List;
import java.util.Optional;

import com.example.springRest.entities.Student;

public interface StudentService {
	
public List<Student> getAllStudents();

public Student getStudentById(int studentId);

public Student addStudent(Student student);

public String updateAStudent(Student student,int studentId);

public String deleteStudent(int studentId);
}
