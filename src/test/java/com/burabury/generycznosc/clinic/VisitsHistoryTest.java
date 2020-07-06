package com.burabury.generycznosc.clinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class VisitsHistoryTest {

    @Test
    void addToFiles() {
        //given
        Queue<String> patients = new LinkedList<>();
        String name = "ala";
        //when

        patients.add(name);

        //then
        assertEquals(patients.element(), name);
    }



}