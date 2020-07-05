package com.burabury.streams;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise2 {

    private static void setStream() {
        Stream <String> stream = Stream.of("first", "second", "third", "fourth", "fifth");

        Set<String> collect = stream
                .filter(element -> element.length() > 7)
                .collect(Collectors.toSet());
        collect.forEach(System.out::println);
    }

    public static void main(String[] args) {
        setStream();
    }

}
