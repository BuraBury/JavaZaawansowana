package com.burabury.generic.collections.map.exercise_2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String mainLanguage;
    private final List<Double> grades;

    public Student(String firstName, String lastName, String mainLanguage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mainLanguage = mainLanguage;
        grades = new ArrayList<>();
    }

    public List<Double> addGrade(Double grade) {
        if (grade >= 1 && grade <= 6) {
            grades.add(grade);
        } else {
            return null;
        }
        return grades;
    }

    @Override
    public String toString() {
        return "\n" + firstName + " " + lastName + " " + mainLanguage;
    }

    public List<Double> getGrades() {
        return grades;
    }
}
