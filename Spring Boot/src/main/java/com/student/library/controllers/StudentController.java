package com.student.library.controllers;

import com.student.library.models.StudentEntity;
import com.student.library.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/student/{id}")
    public StudentEntity getStudent(@PathVariable int id) {
        return studentRepository.getStudent(id);
    }

    @GetMapping("/students")
    public ArrayList<StudentEntity> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    @PostMapping("/student/new")
    public String addStudent(@RequestBody StudentEntity student) {
        studentRepository.addStudent(student);
        return "Student Created Successfully !";
    }

    @PutMapping("/student/{id}")
    public String putStudent(@PathVariable int id, @RequestBody StudentEntity student) {
        studentRepository.putStudent(id, student);
        return "All Student ";
    }

    @PatchMapping("/student/{id}")
    public String updateStudentDetails(@PathVariable int id, @RequestBody StudentEntity student) {
        if(studentRepository.getStudent(id) == null) {
            return "Student not found!";
        }
        studentRepository.updateStudent(id, student);
        return "Student Updated Successfully ";
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable int id) {
        if(studentRepository.getStudent(id) == null) {
            return "Student not exist ";
        }
        studentRepository.deleteStudent(id);
        return "Student Deleted Successfully !";
    }
    @GetMapping("/all-student")
    public String getAllStudent(){
        return "Name :Tushar & Sarthak";
    }

}
