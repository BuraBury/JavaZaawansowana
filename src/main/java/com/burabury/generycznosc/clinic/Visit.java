package com.burabury.generycznosc.clinic;

import java.util.LinkedList;
import java.util.Queue;

public class Visit {
   private final Queue<String> patients = new LinkedList<>();

    public Queue<String> addToFiles(String name) {
        patients.add(name);
        return patients;
    }

    public void showHistory() {
        System.out.println(patients);
    }
}
