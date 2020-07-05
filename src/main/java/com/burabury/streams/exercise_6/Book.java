package com.burabury.streams.exercise_6;

import java.util.List;
import java.util.Set;

public class Book {

    private final Author author;
    private final Set<BookType> type;
    private final String title;
    private final int price;
    private final int pages;

    public int getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public Book(Author author, List<BookType> type, String title, int price, int pages) {
        this.author = author;
        this.type = (Set<BookType>) type;
        this.title = title;
        this.price = price;
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public Set<BookType> getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }
}

