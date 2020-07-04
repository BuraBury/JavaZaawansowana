package com.burabury.generycznosc.zadanie4;

import java.util.ArrayList;
import java.util.List;

public class StringCollection {
    public static void main(String[] args) {

    }

    public static List<String> removeDuplicates(List<String> list) {

        List<String> toReturn = new ArrayList<>();
        for (String s : list) {
            if(!toReturn.contains(s)) {
                toReturn.add(s);
            }
        }
        return list;
    }


}
