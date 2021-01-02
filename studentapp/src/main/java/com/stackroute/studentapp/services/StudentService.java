package com.stackroute.studentapp.services;

import com.stackroute.studentapp.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudent();

    Optional<Student> getStudentById(int id);

    Student saveStudent(Student student);

    void deleteStudent(int id);

    Student updateStudent(Student student, int id);
}