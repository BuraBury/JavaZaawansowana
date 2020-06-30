package com.burabury.enums_and_exceptions.zadanie_3;

public enum Print {
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE;


    public void Times(String s) {
        for (int i = 0; i < ordinal() + 1; i++) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Print.ONE.Times("Hello");
    }

}
