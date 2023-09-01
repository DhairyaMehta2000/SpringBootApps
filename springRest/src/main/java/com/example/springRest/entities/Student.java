package com.example.springRest.entities;

public class Student {
private String name;
private int Id;
private int rollno;
public String getName() {
	return name;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public void setName(String name) {
	this.name = name;
}


public Student(String name, int id, int rollno) {
	this.Id=id;
	this.name=name;
	this.rollno=rollno;
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [name=" + name + ", Id=" + Id + ", rollno=" + rollno + "]";
}



}