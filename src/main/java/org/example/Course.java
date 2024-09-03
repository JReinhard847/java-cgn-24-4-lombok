package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
@AllArgsConstructor
@Builder
public class Course {
    int id;
    String name;
    @Builder.Default
    List<Teacher> teachers = new ArrayList<>();
    @Builder.Default
    List<Student> students = new ArrayList<>();
}
