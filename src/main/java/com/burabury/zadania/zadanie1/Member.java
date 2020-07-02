package com.burabury.zadania.zadanie1;

public class Member {
    private final String name;
    private final String email;
    private final Integer id;

    private static Integer nextId = 1;

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
        this.id = nextId;
        nextId++;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
