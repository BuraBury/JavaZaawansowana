package com.burabury.generic.streams;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise5 {
    public static void main(String[] args) {
        setStream();
    }

    private static void setStream() {

        Set<String> collect = Stream.of(1, 26, 30, 2, 45)
                .filter(element -> element >= 26)
                .map(String::valueOf)
                .collect(Collectors.toSet());

        System.out.println(collect);


    }
}
