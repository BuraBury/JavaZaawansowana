package com.burabury.generycznosc.clinic;

import java.util.LinkedList;
import java.util.Queue;


public class Clinic {
    Visit visit = new Visit();

    private final Queue<String> queue;

    public Clinic() {
        queue = new LinkedList<>();
    }

    public Queue<String> registerPatient(String name) {
        queue.add(name);
        return queue;
    }

    public String priorityPatientToHandle(String name) {
        queue.remove(name);
        visit.addToFiles(name);
        return name;
    }

    public String handlePatient() {
        String name = queue.element();
        queue.remove(name);
        visit.addToFiles(name);

        return name;
    }

    public void showQueueSize() {
        int size = queue.size();
        System.out.printf("\n" +
                "Size of queue: %d%n", size);
    }

    public void showQueueMembers() {
        System.out.println("\n" +
                "Patients in queue: ");
        System.out.println(queue);
    }




}



