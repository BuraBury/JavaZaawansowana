package com.burabury.objects.animals;

public class MainZwierzeta {
    public static void main(String[] args) {

        Zwierze zwierze = new Zwierze();
        Object objektoweZwierze = zwierze;
        Object objektoweZwierze2 = new Zwierze();
        Ssak ssak = new Ssak();
        Ssak ssaczek = new Ssak("ala");
        Zwierze ssak1 = new Ssak("ala");

        try {
            Ssak ssak2 = (Ssak) zwierze;
        } catch (ClassCastException e) {
            System.out.println("nie da sie tego rzutowac");
        }

        Gad gad = new Gad();
        Zwierze gad1 = new Gad();

        ssaczek.metodaDomyslna();
        zwierze.jedz();
        ssaczek.jedz();
        System.out.println(ssaczek.przemieszczajSie(5) + " " + ssaczek.getClass().getSimpleName());
        System.out.println(gad.przemieszczajSie(10) + " " + gad.getClass().getSimpleName());
        ssaczek.wydajDzwiek();
        gad.jedz();
    }


}

