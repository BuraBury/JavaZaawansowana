package com.burabury.generycznosc.kolekcje.collectionRunner;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 *** @oddRandomNumbers() - method fills list with randmo Integers from 0 to 10
 *** @printList() - method prints list no matter what ListType it is
 *** @removeEvenNumbersFromList() - method returns list with odd numbers only
 *** @removeOddNumbersFromList() - method returns list with even numbers only
 *** @removeDuplicates() - method return SetOfNumbers based on given ListOfRandomNumbers (Set is always without duplicates)
 */

public class CollectionRunner {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    static Random random = new Random();

    public static List<Integer> oddRandomNumbers() {
        return IntStream.rangeClosed(0, 20).mapToObj(i -> random.nextInt(11)).collect(Collectors.toList());
    }

    public static TreeSet<Integer> oddRandomNumbersToTreeSet() {
        return IntStream.rangeClosed(0, 20).mapToObj(i -> random.nextInt(11)).collect(Collectors.toCollection(TreeSet::new));
    }

    public static void printList(List<?> list) {
        System.out.println(list);
    }

    public static List<Integer> removeEvenNumbersFromList(List<Integer> listOfNumbers) {
        listOfNumbers.removeIf(number -> number % 2 == 0);
        return listOfNumbers;
    }

    public static List<Integer> removeOddNumbersFromList(List<Integer> listOfNumbers) {
        listOfNumbers.removeIf(number -> number % 2 != 0);
        return listOfNumbers;
    }

    public static Set<Integer> removeDuplicatesFromList(List<Integer> listOfNumbers) {
        return new HashSet<>(listOfNumbers);
    }


    public static void main(String[] args) {
        List<Integer> listWithRandomValuesFrom0to10 = oddRandomNumbers();
        List<Integer> listWithRandomValuesFrom0To10_ex2 = oddRandomNumbers();


        printList(listWithRandomValuesFrom0to10);
        printList(listWithRandomValuesFrom0To10_ex2);

        System.out.println(removeEvenNumbersFromList(listWithRandomValuesFrom0to10)); //contains only odd numbers
        System.out.println(removeOddNumbersFromList(listWithRandomValuesFrom0To10_ex2)); //contains only even numbers

        System.out.println(removeDuplicatesFromList(listWithRandomValuesFrom0to10));
        System.out.println(removeDuplicatesFromList(listWithRandomValuesFrom0To10_ex2));


        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);

        List<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        System.out.println(a.equals(b));
        System.out.println("\n");


        TreeSet<Integer> treeSet = oddRandomNumbersToTreeSet();
        System.out.println(treeSet);
        System.out.println(treeSet.floor(100));
        System.out.println(treeSet.ceiling(-2));
        System.out.println(treeSet.higher(8));
    }
}