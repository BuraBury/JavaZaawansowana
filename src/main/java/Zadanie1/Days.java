package Zadanie1;

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
        if (this == SATURDAY || this == SUNDAY) {
            return "Today is time to Rest";
        } else {
            return "Go to work";
        }
    }

}




