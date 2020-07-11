package com.burabury.generic.collections.map;

import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class exercise_countWords {

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        SortedMap<String, Integer> map = new TreeMap<>();

        for (String string : strings) {
            if (map.containsKey(string)) {
                map.replace(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }
        return map;
    }

    public static void printMap(Map<String, Integer> map) {
        map.forEach((word, value) -> System.out.println(word + " " + value));
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        String[] array = input.split(" ");

        printMap(wordCount(array));

    }
}
