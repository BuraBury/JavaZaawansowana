package com.burabury.generycznosc.clinic;

import java.util.LinkedList;
import java.util.Queue;

import static com.burabury.generycznosc.clinic.Clinic.*;


public class Main {
    public static void main(String[] args) {

        Queue<String> kolejka = new LinkedList<>();
        Clinic clinic = new Clinic(kolejka);

        clinic.registerPatient("Paulina");
        clinic.registerPatient("Jakub");
        clinic.registerPatient("Bercik");
        clinic.registerPatient("Paweł");
        clinic.registerPatient("Rysio");
        clinic.registerPatient("Dyzio");

        System.out.println(handlePatient(clinic));
        System.out.println(handlePatient(clinic));
        System.out.println(handlePatient(clinic));

        System.out.println(priorityPatient(clinic, "Dyzio"));

        showQueueSize(clinic);
        showQueueMembers(clinic);


    }

}
