package com.burabury.generic.collections.map.exercise_2;

import java.util.*;

public class StudentService {

    public static double calculateAverage_v2(Student student) {

        List<Double> grades = student.getGrades();

        double sum = grades.stream().mapToDouble(grade -> grade).sum();
        return sum / grades.size();
    }

    public static double calculateAverage(List<Double> grades) {

        double sum = grades.stream().mapToDouble(grade -> grade).sum();
        return sum / grades.size();
    }


    static Map<Student, List<Double>> calculateTotalAverage(Map<Student, List<Double>> studentToGrades) {

        Map<Student, List<Double>> studentWithAverageGrades = new HashMap<>();
        for (Map.Entry<Student, List<Double>> entry : studentToGrades.entrySet()) {
            List<Double> averageGrades = new ArrayList<>();
            averageGrades.add(calculateAverage(entry.getValue()));
            studentWithAverageGrades.put(entry.getKey(), averageGrades);
        }
        return studentWithAverageGrades;
    }

    static Map<Set<Student>, List<Double>> calculateTotalAverage_v2(Map<Student, List<Double>> students) {
        List<Double> list = new ArrayList<>();
        Set<Student> studentsInfo = students.keySet();

        for (Map.Entry<Student, List<Double>> entry : students.entrySet()) {
            list.add(calculateAverage(entry.getValue()));
        }

        Map<Set<Student>, List<Double>> map = new HashMap<>();
        map.put(studentsInfo, list);


        return map;
    }


    public static Student findBestStudent(Map<Student, List<Double>> students) {

        Map<Student, List<Double>> studentWithAverageGrade = calculateTotalAverage(students);
        Double maxAverage = 0.;

        for (Map.Entry<Student, List<Double>> entry : studentWithAverageGrade.entrySet()) {
            List<Double> averageGrades = entry.getValue();
            Double averageGrade = averageGrades.get(0);
            if (averageGrade > maxAverage) {
                maxAverage = averageGrade;
            }
        }

        for (Map.Entry<Student, List<Double>> entry : studentWithAverageGrade.entrySet()) {
            if (entry.getValue().get(0).equals(maxAverage)) {
                return entry.getKey();
            }
        }

        return null;
    }


}
