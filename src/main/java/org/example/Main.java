package org.example;

import java.util.List;


import static org.example.UniversityService.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "John", "home", 3);
        Teacher teacher = new Teacher(1, "Jim", "CS");
        Course course = Course.builder()
                .id(1)
                .name("CS1").build();
        course.getStudents().add(student.withGrade(2));
        course.getStudents().add(student);
        course.getTeachers().add(teacher);
        System.out.println(course);
        Course course2 = Course.builder()
                .name("x")
                .id(1)
                .students(List.of(student.withGrade(1)))
                .build();
        University uni = University.builder()
                .name("a")
                .id(0)
                .courses(List.of(course,course2))
                .build();
        System.out.println(calculateUniversityAverage(uni));
        System.out.println(getStudentsWithGrade(uni,2));
    }
}