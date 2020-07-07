package com.burabury.generycznosc.klasyWewnetrzne;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    static List<String> collected = Stream.of("a", "b", "c")
            .collect(Collectors.toList());


    public static void main(String[] args) {
        System.out.println(collected);

    }
}
