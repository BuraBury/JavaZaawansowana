package com.burabury.objects.exercises.zadanie4;

public class DrzewoMain {
    public static void main(String[] args) {

        Drzewo modrzew = new Drzewo("modrzew", true, 3, "przekroj");
        Drzewo modrzew2 = new Drzewo("modrzew", true, 5, "przekroj");
        Drzewo buk = new Drzewo("buk", false, 2, "przekroj");
        DrzewoLisciaste dab = new DrzewoLisciaste("dab", false, 7, "przekrojowy", 5);
        DrzewoOwocowe jablon = new DrzewoOwocowe("jablon", false, 4, "przekroj", 2, "jabłko");

        Las las = new Las(modrzew, buk, dab, jablon, modrzew2);

        System.out.println(las.toString());

        System.out.printf("\nDoes larch equals another larch with different height?\n%s%n", modrzew.equals(modrzew2));
        System.out.printf("\nDoes larch equals apple tree?\n%s%n", dab.equals(jablon));
    }
}
