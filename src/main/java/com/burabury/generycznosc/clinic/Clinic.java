package com.burabury.generycznosc.clinic;

import java.util.LinkedList;
import java.util.Queue;

public class Clinic {

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
        return name + " - really sick patient. PRIORITY";
    }

    public String handlePatient() {
        String name = queue.element();
        queue.remove(name);
        return name + " - patient is now in the Doc office";
    }

    public void showQueueSize() {
        int size = queue.size();
        System.out.println("\nSize of queue: " + size);
    }

    public void showQueueMembers() {
        System.out.println("\nPatients in queue: ");
        System.out.println(queue);
    }

}



