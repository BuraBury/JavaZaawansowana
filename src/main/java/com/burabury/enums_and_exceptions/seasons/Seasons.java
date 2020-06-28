package com.burabury.enums_and_exceptions.seasons;

import java.time.Year;

public enum Seasons {
    SPRING(90, "Wiosna"),
    SUMMER(93, "Lato"),
    FALL(89, "Jesień"),
    WINTER(88, "Zima");

    //dodawanie pol i metod
    private final int daysCounter;
    private final String translation;

    Seasons(int daysCounter, String translation) {
        this.daysCounter = daysCounter;
        this.translation = translation;
    }

    public int getDaysCounter() {
        return daysCounter;
    }


    public int getDaysCounterForYear(int year) {
        if (this == Seasons.WINTER && Year.isLeap(year)) {
            return daysCounter + 1;
        }
        return daysCounter;
    }

    public static Seasons fromPolishTranslation(String polishTranslation) {
        Seasons[] values = Seasons.values();
        for (Seasons s : values) {
            if (polishTranslation.equals(s.translation)) {
                return s;
            }
        }
        throw new UnsupportedOperationException("Nie udalo sie stworzyc enuma");

    }


}
