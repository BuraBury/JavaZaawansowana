package com.burabury.generycznosc.clinic;

import java.util.Queue;

public class Clinic {

    private final Queue<String> queue;

    public Clinic(Queue<String> queue) {
        this.queue = queue;
    }

    private Queue<String> getQueue() {
        return queue;
    }

    public static Queue<String> registerPatient(Clinic clinic, String name) {
        clinic.getQueue().add(name);
        return clinic.getQueue();
    }

    public static String priorityPatientToHandle(Clinic clinic, String name) {
        clinic.getQueue().remove(name);
        return name + " - really sick patient. PRIORITY";
    }

    public static String handlePatient(Clinic clinic) {
        String name = clinic.getQueue().element();
        clinic.getQueue().remove(name);
        return name + " - patient is now in the Doc office";
    }

    public static void showQueueSize(Clinic clinic) {
        int size = clinic.getQueue().size();
        System.out.println("\nSize of queue: " + size);
    }

    public static void showQueueMembers(Clinic clinic) {
        System.out.println("\nPatients in queue: ");
        System.out.println(clinic.getQueue());
    }

}



