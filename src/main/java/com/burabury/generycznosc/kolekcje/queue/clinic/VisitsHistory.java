package com.burabury.generycznosc.kolekcje.queue.clinic;

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

    private Queue<String> makeCopyOfPatientsData() {
        Queue<String> copy = patients;
        return copy;
    }

    public Queue<String> showHistory() {
        return makeCopyOfPatientsData();
    }
}
