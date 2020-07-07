package com.burabury.generycznosc.mapExercises.zadanie_1;

import java.util.HashMap;
import java.util.Map;

public class PersonMain {

    public static void main(String[] args) {

        Map<Long, String> personMap = new HashMap<>();


        personMap.put(1234L, "Ala".toLowerCase());
        personMap.put(345L, "Alina".toLowerCase());
        personMap.put(5L, "Alicja".toLowerCase());
        personMap.put(100L, "Marta".toLowerCase());
        personMap.put(74393L, "Dorota".toLowerCase());
        personMap.put(500L, "Bożena".toLowerCase());
        personMap.put(520L, "Bożena".toLowerCase());
        personMap.put(504L, "Bożena".toLowerCase());


        System.out.println(personMap.get(100L));

        for (String s : personMap.values()) {
            if (s.startsWith("a")) {
                System.out.printf("%s ", s);
            }
        }

        System.out.println();

        for (Map.Entry<Long, String> map : personMap.entrySet()) {
            if (map.getValue().equals("bożena")) {
                System.out.printf("%d ", map.getKey());
            }
        }


    }
}
