package com.burabury.enums.zadanie_3;

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
        Print.THREE.Times("Hello");
    }

}
