package com.burabury.zdjavapol12_advanced;

import java.util.EnumSet;
import java.util.Set;

public class EnumMain {
    public static void main(String[] args) {

        Seasons spring = Seasons.SPRING;
        Seasons summer = Seasons.SUMMER;
        Seasons fall = Seasons.FALL;
        Seasons winter = Seasons.WINTER;

        Seasons.valueOf("WINTER");
        System.out.println(winter.toString());

        System.out.println();

        Seasons[] seasons = Seasons.values();

        for (Seasons s : seasons) {
            System.out.println(s);
            System.out.println(s.getDaysCounter() + " days");
        }

        System.out.println();

        int winterNumber = Seasons.WINTER.ordinal(); //rzutowanie na numer
        System.out.println(winterNumber);

        System.out.println();

        Seasons fromInt = Seasons.values()[1];
        System.out.println(fromInt);

        System.out.println();

        for (Seasons season : Seasons.values()) {
            System.out.printf("%s %d%n", season.name(), season.ordinal());
        }

        System.out.println();

        Set<Seasons> set = EnumSet.allOf(Seasons.class);
        System.out.println(set);

        System.out.println();

        System.out.println(summer.getDaysCounter() + spring.getDaysCounter() + winter.getDaysCounter() + fall.getDaysCounter());


    }


}
