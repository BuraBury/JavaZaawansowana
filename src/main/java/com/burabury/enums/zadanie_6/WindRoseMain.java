package com.burabury.enums.zadanie_6;

import static java.util.Arrays.*;

public class WindRoseMain {
    public static void main(String[] args) {

        stream(WindRose.values()).forEach(System.out::println);

        System.out.println();

        for (int i = 0; i < WindRose.values().length; i++) {
            System.out.println(WindRose.values()[i].getAngle() + " " + WindRose.values()[i]);
        }


        try {
            System.out.println("\n" + WindRose.getDirection(366));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
