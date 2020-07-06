package com.burabury.generycznosc.zadaniaYT;

import java.util.ArrayList;
import java.util.List;

public class Generycznosc {

    public static double obliczSume(List<Integer> elementy) {
        int suma = 0;
        for (int element : elementy) {
            suma += element;
        }
        return suma;
    }

    public static Object srodkowyElementListy(List<?> lista) {
        if (lista.size() > 0) {
            return lista.get(lista.size() / 2);
        } else return null;
    }

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(5);
        double suma = obliczSume(lista);
        System.out.println(suma);
        System.out.println(srodkowyElementListy(lista));

    }
}
