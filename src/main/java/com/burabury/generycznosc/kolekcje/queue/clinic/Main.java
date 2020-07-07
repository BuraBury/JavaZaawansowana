package com.burabury.generycznosc.kolekcje.queue.clinic;

/*
 * @registerPatient() - this method will add new element (String type) to the Queue
 * @priorityPatientToHandle() - this method get element (String type) from the Queue, no matter if it is the first one to get
 * @handlePatient() - this method removes handled patients one after another from the Queue
 * @showQueueSize() - method prints actual Queue size
 * @showQueueMembers() - method prints actual Queue members (String type)
 */

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        Clinic clinic = new Clinic();


        clinic.registerPatient("Paulina");
        clinic.registerPatient("Bercik");
        clinic.registerPatient("Paweł");
        clinic.registerPatient("Łukasz");
        clinic.registerPatient("Dyzio");
        clinic.registerPatient("Zyzio");


        try {
            clinic.priorityPatientToHandle("Dyzio");
            clinic.handlePatient();
            clinic.handlePatient();
            clinic.handlePatient();
            clinic.handlePatient();
        } catch (NoSuchElementException e) {
            System.out.println("There's no one left in the queue");
        }


        clinic.showQueueSize();
        clinic.showQueueMembers();

        System.out.println(clinic.visitsHistory.showHistory());


    }

}
