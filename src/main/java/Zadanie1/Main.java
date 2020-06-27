package Zadanie1;

import java.util.EnumSet;

public class Main {
    Enums saturday = Enums.valueOf("SATURDAY");

    public void isGreaterThanSaturday(Enum day) {
        int a = day.compareTo(saturday);

        if (a == 0) {
            System.out.println("Its saturday");
        } else if (a < 0) {
            System.out.println("Its before Saturday");
        } else {
            System.out.println("Its after saturday");
        }

    }
    public static void main(String[] args) {

        Enums monday = Enums.MONDAY;
        Enums tuesday = Enums.TUESDAY;
        Enums wednesday = Enums.WEDNESDAY;
        Enums thursday = Enums.THURSDAY;
        Enums friday = Enums.FRIDAY;
        Enums saturday = Enums.SATURDAY;
        Enums sunday = Enums.SUNDAY;

        Enums[] days = Enums.values();

        for (Enums d : days) {
            System.out.println(d.testDay());
        }




    }
}
