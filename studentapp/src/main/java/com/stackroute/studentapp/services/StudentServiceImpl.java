package com.stackroute.studentapp.services;

import com.stackroute.studentapp.model.Student;
import com.stackroute.studentapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
   @Autowired
    StudentRepository repository;

    @Autowired
    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Student> getAllStudent() {
        return repository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(int id) {
        return repository.findById(id);
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save( student);
    }

    @Override
    public void deleteStudent(int id) {
        repository.deleteById(id);
    }

    @Override
    public Student updateStudent(Student student, int id) {
        return repository.save(student);
    }
}
