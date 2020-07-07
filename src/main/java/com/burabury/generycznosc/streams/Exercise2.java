package com.burabury.generycznosc.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class Exercise2 {

    private static void setStream() {
        Stream<String> stream = Stream.of("firssssst", "second", "third", "fourth", "fifth");

        Optional<String> collect = stream
                .filter(element -> element.length() >= 7)
                .findFirst();

        System.out.println(collect);


    }

    public static void main(String[] args) {
        setStream();
    }

}
