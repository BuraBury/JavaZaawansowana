package com.burabury.generic.collections.map.exercise_;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {


    public static void main(String[] args) {
        Map<Long, String> personMap = new HashMap<>();
        personMap.put(1L, "Anna");
        personMap.put(2L, "Andrzej");
        personMap.put(3L, "Kamil");
        personMap.put(4L, "Jan");
        personMap.put(5L, "Jan");

        personMap.remove(1L);


        for (String s : personMap.values()) {
            if (s.startsWith("A")) {
                System.out.println(s);
            }
        }
        System.out.println();

        for (Long l : personMap.keySet()) {
            System.out.println(l);
        }
        System.out.println();

        for (String s : personMap.values()) {
            System.out.println(s);
        }
        System.out.println();

        for (Map.Entry<Long, String> mapEntry : personMap.entrySet()) {
            if (mapEntry.getValue().equals("Jan")) {
                System.out.println(mapEntry.getKey());
            }
        }


    }
}
