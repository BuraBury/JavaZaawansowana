package com.burabury.generycznosc.student;

import java.util.List;
import java.util.Map;

public class StudentService {

    public static double calculateAverage(List<Integer> grades) {
        double sum = grades.stream().mapToDouble(grade -> grade).sum();
        return sum/grades.size();
    }

    public static double calculateTotalAverage(Map<Student, List<Integer>> studentToGrades) {



        return 0.0;
    }

}
