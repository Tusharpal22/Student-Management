package com.student.library.repository;

import com.student.library.models.StudentEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class StudentRepository {

    private HashMap<Integer, StudentEntity> studentMap;
    public StudentRepository() {
        studentMap = new HashMap<>();
    }

    public void addStudent(StudentEntity student) {
        studentMap.put(student.getId(), student);
    }

    public void putStudent(int id, StudentEntity student) {
        studentMap.replace(id, student);
    }

    public StudentEntity getStudent(int id) {
        return studentMap.get(id);
    }

    public ArrayList<StudentEntity> getAllStudents() {
        ArrayList<StudentEntity> students = new ArrayList<>();
        studentMap.forEach((id, student) -> students.add(student));
        return students;
    }

    public void updateStudent(int id, StudentEntity student) {
        StudentEntity s = studentMap.get(id);
        if (!s.getName().equals(student.getName())) {
            s.setName(student.getName());
        }
        if (!s.getCollege().equals(student.getCollege())) {
            s.setCollege(student.getCollege());
        }
        studentMap.replace(id, s);
    }

    public void deleteStudent(int id) {
        studentMap.remove(id);
    }
}
