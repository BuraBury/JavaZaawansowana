package com.burabury.generycznosc.zadanie4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyObjectTest {

    @Test
    void shouldRemoveDuplicates() {
        List<MyObject> input = new ArrayList<>();

        MyObject myA = new MyObject("a", 1);
        MyObject myB = new MyObject("b", 1);
        MyObject myC = new MyObject("c", 1);

        input.add(myA);
        input.add(myB);
        input.add(myB);
        input.add(myC);
        input.add(myC);

        assertEquals(5, input.size());

        List<MyObject> output = MyObject.removeDuplicates(input);

        assertEquals(3, output.size());

        assertEquals("a", output.get(0).getAnyString());

        assertEquals("b", output.get(1).getAnyString());

        assertEquals("c", output.get(2).getAnyString());

    }

}