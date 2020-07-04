package com.burabury.generycznosc.zadanie4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringCollectionTest {

    @Test
    void shouldRemoveDuplicates() {
        List<MyObject> input = new ArrayList<>();
        MyObject myA = new MyObject("jeden", 1);
        input.add(myA);

        MyObject myB = new MyObject("dwa", 1);
        input.add(myB);
        input.add(myB);

        MyObject myC = new MyObject("trzy", 1);
        input.add(myC);
        input.add(myC);

        assertEquals(5, input.size());

        List<MyObject> output = MyObject.removeDuplicates(input);

        assertEquals(3, output.size());

        assertEquals("jeden", output.get(0).getAnyString());
        assertEquals(1, output.get(0).getAnyInt());

        assertEquals("dwa", output.get(1).getAnyString());
        assertEquals(1, output.get(1).getAnyInt());

        assertEquals("trzy", output.get(2).getAnyString());
        assertEquals(1, output.get(2).getAnyInt());
    }

}