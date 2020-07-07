package com.burabury.generycznosc.typyGeneryczne.zadanie2;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, Integer> pair = new Pair<>(1, 2);
        Triple<String, Integer, Integer> triple = new Triple<>("jeden", 2, 3);
        FiveElements<Integer, String, Integer, Integer, Integer> fiveElements = new FiveElements<>(1, "dwa", 3, 4, 5);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(triple.getFirst());
        System.out.println(triple.getSecond());
        System.out.println(triple.getThird());
        System.out.println(fiveElements.getFourth());
        System.out.println(fiveElements.getSecond());
    }
}
