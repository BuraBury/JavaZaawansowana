package com.burabury.streams.exercise_6;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void createListOfBooks() {
        createListBooks().stream()
                .filter(authorOfBookAgePredicate(50))
                .forEach(System.out::println);
    }

    private static Predicate<Book> authorOfBookAgePredicate(int age) {
        LocalDate today = LocalDate.now();
        return book -> today.getYear() - book.getAuthor().getYearOfBirth() > age;
    }

    public static void returnBooksWithPriceLessThan50AndPagesOver300() {
        createListBooks().stream()
                .filter(book -> book.getPrice() < 50)
                .filter(book -> book.getPages() > 300)
                .forEach(System.out::println);
    }

    public static void returnBooksOfOneOfTwoGivenTypesTypeAndAuthorAgeOver30(BookType type1, BookType type2, int age) {
        createListBooks().stream()
                .filter(book -> book.getType().contains(type1) || book.getType().contains(type2))
                .filter(authorOfBookAgePredicate(30))
                .forEach(System.out::println);
    }

    private static void bookWithTitleWithMoreThanTwoWords() {
        createListBooks().stream()
                .filter(book -> book.getTitle().split("\\s+").length > 1)
                .forEach(System.out::println);
    }

    //Map, podpkt 2:
    public static void mapOfBooksWhereKeyIsType() {

        Map<BookType, List<Book>> result;

        createListBooks().stream()
                .map(book -> {
                    Map<BookType, List<Book>> bookByTypeMap = new HashMap<>();
                    for (BookType type : book.getType()) {
                        bookByTypeMap.put(type, Collections.singletonList(book));
                    }
                    return bookByTypeMap;
                })
                .reduce(
                        new HashMap<>(),
                        (fullMap, currentMap) -> mergeMaps(fullMap, currentMap));
    }

    private static Map<BookType, List<Book>> mergeMaps(Map<BookType, List<Book>> map1, Map<BookType, List<Book>> map2) {

        for (Map.Entry<BookType, List<Book>> mapEntry : map1.entrySet()) {
            BookType key = mapEntry.getKey();
            if (map2.containsKey(key)) {
                mapEntry.getValue().addAll(map2.get(key));
            }
        }
        return map1;
    }

    public static void createStringWithInfos() {
        createListBooks().stream()
                .map(book -> new StringBuilder(book.getAuthor().getName())

                        .append(" ")
                        .append(book.getAuthor().getSurname())
                        .append("")
                        .append(book.getTitle())
                        .append(" ")
                        .append(book.getPrice())
                        .append(" ")
                        .toString())
                .collect(Collectors.toSet());

    }

    public static void sortByTitles() {
        createListBooks().stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }


    public static List<Book> createListBooks() {
        return new ArrayList<>();
    }


    public static void main(String[] args) {



    }
}
