package com.burabury.obiektowosc.zadania.zadanie3;

public class OsobaMain {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Paulina", "Bury", "1234567");
        Osoba osoba1 = new Osoba("Jakub", "Bury", "7654321");
        Osoba osoba2 = new Osoba("Jakub", "Bury", "7654321");

        Uczen uczen = new Uczen("Antek", "Buc", "1233445", "podstawowa");
        Uczen uczen1 = new Uczen("Antek", "Buc", "1233445", "Liceum");
        uczen.zmienSzkole("Liceum");

        UczenSzkoly uczenSzkoly = new UczenSzkoly("Jan", "Kowalski", "1234567", "zawodowa", "pierwsza");
        UczenSzkoly uczenSzkoly1 = new UczenSzkoly("Jan", "Kowalski", "1234567", "zawodowa", "pierwsza");
        uczenSzkoly1.zmienKlase("druga");


        System.out.println(
                osoba.przedstawSie() + " \n" +
                        osoba.toString() + " \n" +
                        osoba.equals(osoba1) + " \n" +
                        osoba1.equals(osoba2)
        );

        System.out.println();
        System.out.println(uczen.toString());
        System.out.println(uczen.equals(uczen1));

        System.out.println();
        System.out.println(uczenSzkoly.toString());
        System.out.println(uczenSzkoly.equals(uczenSzkoly1));


    }
}
