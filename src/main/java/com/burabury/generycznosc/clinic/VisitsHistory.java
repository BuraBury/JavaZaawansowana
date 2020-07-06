package com.burabury.generycznosc.clinic;

import java.util.LinkedList;
import java.util.Queue;

class VisitsHistory {
    private final Queue<String> patients;

    protected VisitsHistory() {
        patients = new LinkedList<>();
    }

    protected void addToFiles(String name) {
        patients.add(name);
    }

    private Queue<String> makeCopyOfPatients() {
        Queue<String> copy = patients;
        return copy;
    }

    public Queue<String> showHistory() {
        return makeCopyOfPatients();
    }
}
