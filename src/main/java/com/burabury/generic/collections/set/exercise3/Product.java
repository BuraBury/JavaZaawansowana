package com.burabury.generic.collections.set.exercise3;

import java.util.Comparator;
import java.util.TreeSet;

class Product implements Comparable<Product> {
    private final String name;
    private final int price;
    private final Category category;

    public Product(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }


    @Override
    public int compareTo(Product o) {
        return Comparator.comparing(Product::getName).thenComparing(Product::getCategory).thenComparing(Product::getPrice).compare(this, o);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}

enum Category {
    BOOK,
    MUSIC,
    ELECTRONICS;
}

class PriceProductComparator implements Comparator<Product> {

    TreeSet<Product> treeSet;

    public PriceProductComparator() {
        this.treeSet = new TreeSet<>();
    }

    @Override
    public int compare(Product o1, Product o2) {
        return Comparator.comparing(Product::getPrice).thenComparing(Product::getName).thenComparing(Product::getCategory).compare(o1, o2);
    }
}


