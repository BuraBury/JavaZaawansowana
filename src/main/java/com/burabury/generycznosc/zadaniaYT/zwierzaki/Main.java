package com.burabury.generycznosc.zadaniaYT.zwierzaki;

public class Main {
    public static void main(String[] args) {
        Kot kot = new Kot(5, 10);
        Pies pies = new Pies(5, 15);

        System.out.println(kot.compareTo(pies));
        System.out.println(pies.compareTo(kot));
    }
}
