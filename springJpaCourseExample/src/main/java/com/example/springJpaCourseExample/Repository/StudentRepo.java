package com.example.springJpaCourseExample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springJpaCourseExample.Entity.Student;
//@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}
