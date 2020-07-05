package com.burabury.streams.exercise_6;

import java.util.List;

public class Book {

    private Author author;
    private List<BookType> type;
    private String title;

    public Book(Author author, List<BookType> type, String title) {
        this.author = author;
        this.type = type;
        this.title = title;
    }
}

