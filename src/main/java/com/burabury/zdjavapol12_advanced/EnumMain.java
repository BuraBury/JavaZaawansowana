package com.burabury.zdjavapol12_advanced;

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
        }

        System.out.println();

        int winterNumber = Seasons.WINTER.ordinal();
        System.out.println(winterNumber);

        System.out.println();

        Seasons fromInt = Seasons.values()[winterNumber];
        System.out.println(fromInt);


    }


}
