package com.burabury.generycznosc.kolekcje.sets.exercise3;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise3 {

    public static  void main(String[] args) {
        Product comic = new Product("Tytus Romek i Atomek", 20, Category.BOOK);
        Product comic2 = new Product("Tytus Romek i Atomek", 30, Category.BOOK);
        Product laptop = new Product("Lenovo Legion", 3000, Category.ELECTRONICS);
        Product laptop2 = new Product("Asus Zenbook", 4000, Category.ELECTRONICS);
        Product album = new Product("Smells like teen spirit", 45, Category.MUSIC);

        Set<Product> productSet = new HashSet<>();
        productSet.add(comic);
        productSet.add(comic2);
        productSet.add(laptop);
        productSet.add(laptop2);
        productSet.add(album);



        PriceProductComparator priceProductComparator = new PriceProductComparator();
        Set<Product> productsSetByComparator = new TreeSet<>(new PriceProductComparator());

        productsSetByComparator.add(comic);
        productsSetByComparator.add(comic2);
        productsSetByComparator.add(laptop);
        productsSetByComparator.add(laptop2);
        productsSetByComparator.add(album);

        System.out.println(comic.equals(comic2));
        System.out.println(priceProductComparator.compare(laptop, laptop2));


        System.out.println((((TreeSet<Product>) productsSetByComparator).first()));
        System.out.println((((TreeSet<Product>) productsSetByComparator).last()));






    }


}
