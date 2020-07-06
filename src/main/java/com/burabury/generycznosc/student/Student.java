package com.burabury.generycznosc.student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String mainLanguage;
    public List<Integer> grades;

    public Student(String firstName, String lastName, String mainLanguage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mainLanguage = mainLanguage;
        grades = new ArrayList<>();
    }

    public List<Integer> addGrade(Integer grade) {
        if (grade >= 1 && grade <= 6) {
            grades.add(grade);
        } else {
            return null;
        }
        return grades;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + mainLanguage;
    }
}
