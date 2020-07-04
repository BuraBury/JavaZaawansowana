package com.burabury.generycznosc;

import java.util.ArrayList;
import java.util.List;

public class Zajecia_04_07 {
    static void printNames(List<String> list) {
        for (Object o : list) {
            String name = (String) o;
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        String name = "Paulina";
        names.add(name);
        printNames(names);

    }
}
