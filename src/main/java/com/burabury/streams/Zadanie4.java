package com.burabury.streams;

import java.util.Arrays;
import java.util.List;

public class Zadanie4 {

    public static void main(String[] args) {
        setStream();
    }

    private static void setStream() {
        List<Integer> list = Arrays.asList(1, 26, 30, 2, 45);

        Integer maxValue = list.stream().max(Integer::compare).get();

        System.out.println(maxValue);

    }
}
