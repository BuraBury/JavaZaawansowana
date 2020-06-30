package com.burabury.enums_and_exceptions.days_of_week;

public enum Days {
    MONDAY(),
    TUESDAY(),
    WEDNESDAY(),
    THURSDAY(),
    FRIDAY(),
    SATURDAY(),
    SUNDAY();

    public boolean isWeekDay() {
        return this != SATURDAY && this != SUNDAY;
    }

    public boolean isHoliday() {
        return this == SATURDAY || this == SUNDAY;
    }

    public String testDay() {
        if (isHoliday()) {
            return "Today is time to Rest";
        } else {
            return "Go to work";
        }
    }



}




