package com.burabury.generycznosc.student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.burabury.generycznosc.student.StudentService.calculateAverage;

public class Main {
    public static void main(String[] args) {
        Map<Student, List<Integer>> map = new HashMap<>();

        Student student = new Student("paulina", "bury", "polish");
        Student student1 = new Student("jakub", "jakubski", "english");
        Student student2 = new Student("pawel", "pawlowski", "german");
        Student student3 = new Student("jan", "kowalski", "icelandic");


        student.addGrade(1);
        student.addGrade(3);
        student.addGrade(4);

        student1.addGrade(2);
        student1.addGrade(5);
        student1.addGrade(4);

        student2.addGrade(3);
        student2.addGrade(3);
        student2.addGrade(7);

        student3.addGrade(3);
        student3.addGrade(2);
        student3.addGrade(4);


        map.put(student, student.grades);
        map.put(student1, student1.grades);
        map.put(student2, student2.grades);
        map.put(student3, student3.grades);

        System.out.println(map.toString());

        System.out.println(calculateAverage(student.grades));


    }
}
