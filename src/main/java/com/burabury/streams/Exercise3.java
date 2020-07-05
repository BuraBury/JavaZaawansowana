package com.burabury.streams;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise3 {

    public static void main(String[] args) {
        setStream();
    }

    private static void setStream() {
        Stream <Integer> stream = Stream.of(1, 26, 30, 2, 45);

        Set<Integer> collect = stream
                .filter(element -> element % 2 == 0)
                .collect(Collectors.toSet());

        collect.forEach(System.out::println);
    }
}
