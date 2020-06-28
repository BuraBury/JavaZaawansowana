package com.burabury.enums_and_exceptions.months;

public class Main {
    public static void main(String[] args) {
        Months january = Months.JANUARY;
        Months february = Months.FEBRUARY;
        Months match = Months.MARCH;
        Months april = Months.APRIL;
        Months may = Months.MAY;
        Months june = Months.JUNE;
        Months july = Months.JULY;
        Months august = Months.AUGUST;
        Months september = Months.SEPTEMBER;
        Months october = Months.OCTOBER;
        Months november = Months.NOVEMBER;
        Months december = Months.DECEMBER;

        System.out.println(Months.ofNumber(13));

        int number = 15;
        try {
            Months.ofNumber(number);
        } catch (UnsupportedMonthException e){
        throw new UnsupportedMonthException(number);
        }


    }


}
