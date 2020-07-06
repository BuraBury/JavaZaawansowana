package com.burabury.generycznosc.zadaniaYT;

import java.util.ArrayList;
import java.util.List;

public class Generycznosc3 {

    public static void niebezpiecznaModyfikacjaListy(List lista) {
        lista.add("inny string");
        lista.add(5); //powoduje class cast exception !!!
    }

    public static void main(String[] args) {

        //1. Kolekcja niegeneryczna
        List kolekcjaNiegeneryczna = new ArrayList();
        kolekcjaNiegeneryczna.add("cos");
        kolekcjaNiegeneryczna.add(5);
        kolekcjaNiegeneryczna.add(0.2f);

        for (Object s : kolekcjaNiegeneryczna) {
            String lancuch = (String) s; //trzeba rzutowac object na typ String
            System.out.println(s); //class cast exception !!! <--- błąd dopiero po kompilacji
        }

//=====================================================================================================

        //2. Kolekcja generyczna
        List<String> kolekcjaGeneryczna = new ArrayList<>();

        kolekcjaGeneryczna.add("Ala ");
        kolekcjaGeneryczna.add("ma ");
        kolekcjaGeneryczna.add("kota!");
        //kolekcjaGeneryczna.add(5); od razu rzuca blad, zanim przejdzie do kompilacji

        niebezpiecznaModyfikacjaListy(kolekcjaGeneryczna); //niebezpieczne modyfikowanie kolekcji !!! class cast exception

        for (String s : kolekcjaGeneryczna) { //nie trzeba nic rzutowac, od razu lecimy po Stringach
            System.out.println(s); //kompiluje sie poprawnie !!!
        }


    }
}
