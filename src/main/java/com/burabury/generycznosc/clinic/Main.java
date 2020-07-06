package com.burabury.generycznosc.clinic;

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
        clinic.registerPatient("Jakub");
        clinic.registerPatient("Bercik");
        clinic.registerPatient("Paweł");
        clinic.registerPatient("Łukasz");
        clinic.registerPatient("Dyzio");
        clinic.registerPatient("Zyzio");

        try {
            System.out.println(clinic.priorityPatientToHandle("Dyzio"));
            System.out.println(clinic.handlePatient());
            System.out.println(clinic.handlePatient());
            System.out.println(clinic.handlePatient());
            System.out.println(clinic.handlePatient());
        } catch (NoSuchElementException e) {
            System.out.println("Brak kolejnego pacjenta w kolejce");
        }


        clinic.showQueueSize();
        clinic.showQueueMembers();

        System.out.println(clinic.visitsHistory.showHistory());


    }

}
