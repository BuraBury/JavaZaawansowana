package com.burabury.generycznosc.zadanie3;

import java.util.*;

/*
 *** @oddRandomNumbers() - method fills list with randmo Integers from 0 to 10
 *** @printList() - method prints list no matter what ListType it is
 *** @removeEvenNumbersFromList() - method returns list with odd numbers only
 *** @removeOddNumbersFromList() - method returns list with even numbers only
 *** @removeDuplicates() - method return SetOfNumbers based on given ListOfRandomNumbers (Set is always without duplicates)
*/

public class CollectionRunner {

    static Random random = new Random();

    public static List<Integer> oddRandomNumbers() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 20; i++) {
            list.add(random.nextInt(10));
        }
        return list;
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
        Set<Integer> setWithoutDuplicates = new HashSet<>(listOfNumbers);
        return setWithoutDuplicates;
    }


    public static void main(String[] args) {
        List<Integer> listWithRandomValuesFrom0to10 = oddRandomNumbers();
        List<Integer> listWithRandomValuesFrom0To10_ex2 = oddRandomNumbers();
        printList(listWithRandomValuesFrom0to10);
        printList(listWithRandomValuesFrom0To10_ex2);
        System.out.println(removeEvenNumbersFromList(listWithRandomValuesFrom0to10)); //contains only odd numbers
        System.out.println(removeOddNumbersFromList(listWithRandomValuesFrom0To10_ex2)); //contains only even numbers
        System.out.println(removeDuplicatesFromList(listWithRandomValuesFrom0To10_ex2));

    }
}