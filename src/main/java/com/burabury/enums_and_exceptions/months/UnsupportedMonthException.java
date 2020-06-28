package com.burabury.enums_and_exceptions.months;

public class UnsupportedMonthException extends RuntimeException {

    public UnsupportedMonthException(int number) {
        super("Error occurred while parsing " + number + " to Month");
    }

    public static void main(String[] args) {
        for (int i = 1; i < 13; i++) {
            Months months = Months.ofNumber(i);
            System.out.println(months);
        }
    }


}
