package org.example.Homework6.service;


import org.example.Homework6.data.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {

    private final List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
//        Long countMaxId = 0L;
//        for (Student student: students){
//                if (student.getStudentId() > countMaxId){
//                    countMaxId = student.getStudentId();
//            }
//        }
        Long countMaxId = getMaxId();
        countMaxId++;
        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        students.add(student);
    }
    @Override
    public Long getId(Student student) {
        return student.getStudentId();
    }

    @Override
    public Long getMaxId() {
        return getMaxId(students);
    }
}
