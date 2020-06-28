package com.zwierzeta;

public class MainZwierzeta {
    public static void main(String[] args) {
        Zwierze zwierze = new Zwierze();

        Ssak ssak = new Ssak();
        Zwierze ssak1 = new Ssak();

        try {
            Ssak ssak2 = (Ssak) zwierze;
        } catch (ClassCastException e) {
            System.out.println("nie da sie tego rzutowac");
        }


        Gad gad = new Gad();

    }


}

