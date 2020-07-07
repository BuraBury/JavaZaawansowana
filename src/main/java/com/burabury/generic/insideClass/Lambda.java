package com.burabury.generic.insideClass;

import java.util.function.BinaryOperator;

public class Lambda {

    private static void calculator(BinaryOperator<Long> o, Long a, Long b) {
        System.out.println(o.apply(a, b));
    }

    public static void lambdaPlay() {
        BinaryOperator<Long> add = Long::sum;
        BinaryOperator<Long> multiply = (a, b) -> a * b;
        BinaryOperator<Long> divide = (a, b) -> a / b;
        BinaryOperator<Long> subtract = (a, b) -> a - b;

        Long a = 10L;
        Long b = 5L;

        calculator(add, a, b);
        calculator(subtract, a, b);
        calculator(divide, a, b);
        calculator(multiply, a, b);

    }

    public static void main(String[] args) {

        lambdaPlay();




    }

}

