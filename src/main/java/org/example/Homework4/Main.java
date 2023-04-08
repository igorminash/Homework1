package org.example.Homework4;

import org.example.Homework4.data.Student;
import org.example.Homework4.data.Teacher;
import org.example.Homework4.view.StudentView;
import org.example.Homework4.view.TeacherView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherView teacherView = new TeacherView();
        teacherView.sendOnConsole(List.of(new Teacher("firstName", "secondName", "Patronymic", "date", 2L)));
        teacherView.sendOnConsole(List.of(new Teacher("firstName2", "secondName2", "Patronymic2", "date2", 3L)));

        StudentView studentView = new StudentView();
        studentView.sendOnConsole(List.of(new Student("firstName", "secondName", "patronymic","date3")));
    }
}
