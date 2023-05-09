package com.enesincekara.studentmanagementsystem.service;

import com.enesincekara.studentmanagementsystem.entity.Student;

import java.util.List;


public interface StudentService {
List<Student> getAllStudents();
Student getStudentById(Long id);

Student saveStudent(Student student);

Student updateStudent(Student student);

void deleteStudentById(Long id);

}
