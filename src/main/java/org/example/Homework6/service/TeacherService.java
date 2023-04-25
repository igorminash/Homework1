package org.example.Homework6.service;



import org.example.Homework6.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher>{
    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
//        Long countMaxId = 0L;
//        for (Teacher teacher: teachers){
//            if (teacher.getTeacherId() > countMaxId){
//                countMaxId = teacher.getTeacherId();
//            }
//        }
        Long countMaxId = getMaxId();
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        teachers.add(teacher);
    }

    @Override
    public Long getId(Teacher teacher) {
        return teacher.getTeacherId();
    }

    @Override
    public Long getMaxId() {
        return getMaxId(teachers);
    }
}
