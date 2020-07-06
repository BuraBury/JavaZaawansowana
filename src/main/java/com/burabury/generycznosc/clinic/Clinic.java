package com.burabury.generycznosc.clinic;

import java.util.LinkedList;
import java.util.Queue;


public class Clinic {
   protected final VisitsHistory visitsHistory = new VisitsHistory();

    private final Queue<String> queue;

    public Clinic() {
        queue = new LinkedList<>();
    }

    public void registerPatient(String name) {
        queue.add(name);
    }

    public String priorityPatientToHandle(String name) {
        queue.remove(name);
        visitsHistory.addToFiles(name);
        return name;
    }

    public String handlePatient() {
        String name = queue.element();
        queue.remove(name);
        visitsHistory.addToFiles(name);

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



