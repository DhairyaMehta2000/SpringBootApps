package com.example.springJpaCourseExample.Entity;
import javax.persistence.*;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
@Id
private Long Id;
private String name;
private String subject;
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public Student(Long id, String name, String subject) {
	super();
	Id = id;
	this.name = name;
	this.subject = subject;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [Id=" + Id + ", name=" + name + ", subject=" + subject + "]";
}



}
