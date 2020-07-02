package com.burabury.enums.zadanie_2;


public class MainStrings {

    public static void main(String[] args) {


        System.out.println(StringOperation.UPPER_FIRST.of(StringOperation.REVERSE.of("Iksomreż")));
        System.out.println(StringOperation.TO_LOWER.of(StringOperation.REVERSE.of("Iksomreż")));
        System.out.println(StringOperation.TO_UPPER.of(StringOperation.REVERSE.of("Iksomreż")));


        

    }



}
