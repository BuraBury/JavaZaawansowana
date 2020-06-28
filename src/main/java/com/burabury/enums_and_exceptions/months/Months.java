package com.burabury.enums_and_exceptions.months;

public enum Months {
    JANUARY(),
    FEBRUARY(),
    MARCH(),
    APRIL(),
    MAY(),
    JUNE(),
    JULY(),
    AUGUST(),
    SEPTEMBER(),
    OCTOBER(),
    NOVEMBER(),
    DECEMBER();


    public static void showMonthByNumber(int number) {
        try {
            System.out.println(Months.values()[number-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }


    public static Months ofNumber(int monthNumber) {
        try {
            return Months.values()[monthNumber - 1];

        } catch (ArrayIndexOutOfBoundsException e) {
            throw new UnsupportedMonthException(monthNumber);

        }


    }
}
