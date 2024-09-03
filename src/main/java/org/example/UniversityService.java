package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class UniversityService {

    public static double calculateCourseAverageGrade(Course course) {
        return course.getStudents().stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0);
    }


    public static double calculateUniversityAverage(University university){
        return university.courses().stream()
                .flatMap(course -> course.getStudents().stream())
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0);
    }

    public static List<Student> getStudentsWithGrade(University university, int grade) {
        return university.courses().stream()
                .flatMap(course -> course.getStudents().stream())
                .filter(student -> student.getGrade() <= grade)
                .collect(Collectors.toList());
    }
}
