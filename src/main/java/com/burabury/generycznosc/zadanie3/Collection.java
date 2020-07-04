package com.burabury.generycznosc.zadanie3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Collection {
    public static void main(String[] args) {

        System.out.println(oddRandomNumber());
    }


    public static List<Integer> oddRandomNumber() {
        List<Integer> oddNumbers = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i <= 20; i++) {
            oddNumbers.add(random.nextInt(20));
        }

        removeEvenNumbersRemoveIf(oddNumbers);
        return oddNumbers;


    }

    public static List<Integer> removeEvenNumbers(List<Integer> numbers) {

        for (Iterator<Integer> it = numbers.iterator(); it.hasNext(); ) {
            Integer element = it.next();
            if (element % 2 == 0) {
                it.remove();
            }
        }
        return numbers;
    }

    public static List<Integer> removeEvenNumbersRemoveIf(List<Integer> numbers) {
        numbers.removeIf(element -> element % 2 == 0);
        return numbers;
    }

    public static List<Integer> removeEvenNumbersBadSolution(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                //i--; jest to rozwiazanie ale nieladne
            }
        }
        return numbers;
    }

}

