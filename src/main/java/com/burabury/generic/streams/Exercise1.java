package com.burabury.generic.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise1 {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        Stream<String> stream = Stream.of("First", "Second", "third", "fourth", "fifth");

        Set<String> collect = stream
                .filter(element -> element.length() > 5)
                .map(String::toUpperCase)
//              .map(element -> element.toUpperCase())
                .collect(Collectors.toSet());

        collect.forEach(System.out::println);
    }

    private static void ex1v2() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");

        Stream<String> stream = list.stream();

        Set<String> collect = stream
                .filter(element -> element.length() > 5)
                .map(String::toUpperCase)
//              .map(element -> element.toUpperCase())
                .collect(Collectors.toSet());

        for (String s : collect) {
            System.out.println(s);
        }
    }
}
