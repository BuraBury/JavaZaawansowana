package com.burabury.generycznosc.zadanie4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringCollectionTest {

    @Test
    void shouldRemoveDuplicates() {
        List<String> list = new ArrayList<>();
        list.add("jeden");
        list.add("dwa");
        list.add("jeden");
        list.add("jeden");
        list.add("trzy");

        List<String> output = StringCollection.removeDuplicates(list);

        assertEquals(3, output.size());
        assertEquals("jeden", output.get(0));
        assertEquals("dwa", output.get(1));
        assertEquals("trzy", output.get(2));
    }

}