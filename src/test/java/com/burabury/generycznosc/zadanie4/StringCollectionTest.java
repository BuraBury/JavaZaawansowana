package com.burabury.generycznosc.zadanie4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringCollectionTest {

    @Test
    void shouldRemoveDuplicates() {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("aa");
        list.add("aa");
        list.add("bb");
        list.add("cc");

        List<String> output = StringCollection.removeDuplicates(list);

        assertEquals(3, output.size());
        assertEquals("aa", output.get(0));
        assertEquals("bb", output.get(1));
        assertEquals("cc", output.get(2));
    }

}