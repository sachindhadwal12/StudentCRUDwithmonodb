package com.stackroute.studentapp.controller;

import com.stackroute.studentapp.model.Student;
import com.stackroute.studentapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
@CrossOrigin(value = "*")

public class StudentController {
   @Autowired
    StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping("student")
    public ResponseEntity<Student> saveStudent(@RequestBody  Student student){
        return  new ResponseEntity<Student>(service.saveStudent(student), HttpStatus.CREATED);
    }

    @GetMapping("student")
    public List<Student> getAllStudent(){
        return service.getAllStudent();
    }

    @DeleteMapping("student/{id}")
    public ResponseEntity<Student> deletestudent(@PathVariable int id){
        service.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("student/{id}")
    public Optional<Student> getStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }
    @PutMapping("student/{id}")
    public ResponseEntity<Student> updateStudentById(@RequestBody Student student, @PathVariable int id){
        return  new ResponseEntity<Student>(service.updateStudent(student,id),HttpStatus.CREATED);
    }

}
