package com.burabury.klasyWewnetrzne;


//lambda to sposob wyrazenia interface funkcjonalnego

import java.util.function.BiFunction;

public class Lambda {
    @FunctionalInterface
    interface MathOperation<TYPE> {
        TYPE calculate(TYPE a, TYPE b);
    }

    private static void calculate(MathOperation<Long> o, Long a, Long b) {
        System.out.println(o.calculate(a, b));
    }

    public static void lambdaPlay() {

        BiFunction<Long, Long, Long> add = (a, b) -> a + b;
        BiFunction<Long, Long, Long> multiply = (a, b) -> a * b;
        BiFunction<Long, Long, Long> divide = (a, b) -> a / b;
        BiFunction<Long, Long, Long> subtract = (a, b) -> a - b;

    }

    public static void main(String[] args) {



    }

}

