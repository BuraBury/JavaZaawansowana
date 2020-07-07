package com.burabury.generic.collections.map.exercise_2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Student student = new Student("paulina", "bury", "PL");
        student.addGrade(1.0);
        student.addGrade(3.5);
        student.addGrade(4.0);

        Student student1 = new Student("jakub", "jakubski", "ENG");
        student1.addGrade(2.0);
        student1.addGrade(5.0);
        student1.addGrade(4.5);

        Student student2 = new Student("pawel", "pawlowski", "DE");
        student2.addGrade(3.);
        student2.addGrade(3.);
        student2.addGrade(5.);

        Student student3 = new Student("jan", "kowalski", "ICL");
        student3.addGrade(3.);
        student3.addGrade(2.5);
        student3.addGrade(4.);

        Map<Student, List<Double>> studentsMap = new HashMap<>();
        studentsMap.put(student, student.getGrades());
        studentsMap.put(student1, student1.getGrades());
        studentsMap.put(student2, student2.getGrades());
        studentsMap.put(student3, student3.getGrades());

        System.out.println(studentsMap.toString());

        System.out.println(StudentService.calculateTotalAverage(studentsMap));

        System.out.println(StudentService.findBestStudent(studentsMap) + " = " + StudentService.calculateAverage_v2(student1));



    }
}
