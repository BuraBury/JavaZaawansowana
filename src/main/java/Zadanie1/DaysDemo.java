package Zadanie1;

public class DaysDemo {

    public static void isGreaterThanSaturday(Days day) {
        int a = day.compareTo(Days.SATURDAY);

        if (a == 0) {
            System.out.println("It's saturday");
        } else if (a < 0) {
            System.out.println("It's before Saturday");
        } else {
            System.out.println("It's after saturday");
        }

    }

    public static void main(String[] args) {

        Days monday = Days.MONDAY;
        Days tuesday = Days.TUESDAY;
        Days wednesday = Days.WEDNESDAY;
        Days thursday = Days.THURSDAY;
        Days friday = Days.FRIDAY;
        Days saturday = Days.SATURDAY;
        Days sunday = Days.SUNDAY;

        Days[] days = Days.values();

        for (Days d : days) {
            System.out.println(d.testDay());
        }

        isGreaterThanSaturday(thursday);
        isGreaterThanSaturday(sunday);
        isGreaterThanSaturday(saturday);


    }


}
