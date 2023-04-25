package org.example.Homework6.data;
import java.util.Comparator;

public class Teacher extends User{

//    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, String dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }
    public Teacher(String firstName, String secondName, String patronymic, String dateOfBirth, Long teacherId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.id = teacherId;
    }

    public Long getTeacherId() {
        return id;
    }

    public void setTeacherId(Long teacherId) {
        this.id = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + id +
                '}';
    }
    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}