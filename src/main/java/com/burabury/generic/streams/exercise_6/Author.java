package com.burabury.generic.streams.exercise_6;

public class Author {
    private final String name;
    private final String surname;
    private final int yearOfBirth;

    public Author(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
