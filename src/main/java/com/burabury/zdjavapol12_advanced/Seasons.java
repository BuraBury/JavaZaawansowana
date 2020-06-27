package com.burabury.zdjavapol12_advanced;

public enum Seasons {
    SPRING(90),
    SUMMER(93),
    FALL(89),
    WINTER(88);

    //dodawanie pol i metod
    private int daysCounter;

    Seasons(int daysCounter) {
        this.daysCounter = daysCounter;
    }

    public int getDaysCounter() {
        return daysCounter;
    }


}
