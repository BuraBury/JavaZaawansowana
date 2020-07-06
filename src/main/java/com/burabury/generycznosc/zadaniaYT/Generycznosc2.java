package com.burabury.generycznosc.zadaniaYT;

import java.util.List;

public class Generycznosc2 {

    public static <T> T metoda(T argument) {
        List<T> lista = null;
        T tymczasowa = null;

        return argument;
    }

    public <T> T metodaNiestatyczna(T argument) {
        List<T> lista = null;
        T tymczasowa = null;

        class KlasaZagniezdzona {
            List<T> innaLista = null;
            public void testowa (T arg) {

            }
        }

        return argument;
    }

    public static void main(String[] args) {

    }
}
