package com.burabury.generycznosc.clinic;

import com.burabury.generycznosc.clinic.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Visit<VisitMode> {
    static Scanner scanner = new Scanner(System.in);

    private  String patient;
    private  LocalDate visitDate;
    private  VisitMode mode;

    public Visit(String patient, LocalDate visitDate, VisitMode mode) {
        this.patient = patient;
        this.visitDate = visitDate;
        this.mode = mode;
    }
    public Visit(){

    }

    public Queue<String> visitorsHistory() {



        Queue<String> patients = new LinkedList<>();
        patients.add(null);

        return patients;
    }
}
