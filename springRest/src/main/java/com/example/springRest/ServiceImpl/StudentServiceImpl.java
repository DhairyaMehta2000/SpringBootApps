package com.example.springRest.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.springRest.entities.Student;
import com.example.springRest.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	
	private List<Student> students = new ArrayList<Student>();
	
	public StudentServiceImpl() {
		students.add(new Student("Dhairya",1,1));
		students.add(new Student("Rishi",2,2));
	}
	
	@Override
	public List<Student> getAllStudents() {
		return students;

	}
	
	public Student getStudentById(@PathVariable("studentId")int studentId){
		Student student = students.stream().filter(s->s.getId()==studentId).findFirst().orElse(null);
		if(student!=null) {
			return student;
		}
		else {
			return null;
		}
		
	}

	@Override
	public Student addStudent(Student student) {
		students.add(student);
		return  student;
	}

	@Override
	public String updateAStudent(Student student,@PathVariable("studentId") int studentId) {
		Student student_to_update = students.stream().filter(s->s.getId()==studentId).findFirst().orElse(null);
		if(student_to_update!=null) {
			student_to_update.setId(student.getId());
			student_to_update.setName(student.getName());
			student_to_update.setRollno(student.getRollno());
		
		}
		else {
			return null;
		}
		return "Student with Id " +studentId + " updated";
		
	}
	
	
	@Override
	
	public String deleteStudent(@PathVariable("studentId") int studentId) {
		 students.removeIf(s->s.getId()==studentId);
		 return "Student with Id " +studentId + " removed";
		
	}

	

}
