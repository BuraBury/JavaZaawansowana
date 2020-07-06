package com.burabury.generycznosc.clinic;

import java.util.LinkedList;
import java.util.Queue;

import static com.burabury.generycznosc.clinic.Clinic.*;

/*
* @registerPatient() - this method will add new element (String type) to the Queue
* @priorityPatientToHandle() - this method get element (String type) from the Queue, no matter if it is the first one to get
* @handlePatient() - this method removes handled patients one after another from the Queue
* @showQueueSize() - method prints actual Queue size
* @showQueueMembers() - method prints actual Queue members (String type)
 */


public class Main {
    public static void main(String[] args) {

        Queue<String> kolejka = new LinkedList<>();
        Clinic clinic = new Clinic(kolejka);

        registerPatient(clinic, "Paulina");
        registerPatient(clinic, "Jakub");
        registerPatient(clinic, "Bercik");
        registerPatient(clinic, "Paweł");
        registerPatient(clinic, "Łukasz");
        registerPatient(clinic, "Dyzio");
        registerPatient(clinic, "Zyzio");

        System.out.println(handlePatient(clinic));
        System.out.println(handlePatient(clinic));
        System.out.println(handlePatient(clinic));

        System.out.println(priorityPatientToHandle(clinic, "Dyzio"));

        showQueueSize(clinic);
        showQueueMembers(clinic);


    }

}
