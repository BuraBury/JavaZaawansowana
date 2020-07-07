package com.burabury.generycznosc.streams;

import java.util.*;
import java.util.stream.Stream;

public class Exercise4 {

    public static void main(String[] args) {
        setStream();
    }

    private static void setStream() {
        //pierwszy sposob
        List<Integer> list = Arrays.asList(1, 26, 30, 2, 45);
        OptionalInt a = Stream.of(1, 26, 30, 2, 45).mapToInt(x -> x).max();

        //drugi sposob
        Integer b = Stream.of(1, 26, 30, 2, 45)
                .reduce(Integer.MIN_VALUE, Math::max);

        //trzeci sposob
        Integer maxValue = list.stream().max(Integer::compare).get();

        //czwarty sposob
        Integer c = Collections.max(Arrays.asList(1, 26, 30, 2, 45));

        System.out.println(maxValue);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
