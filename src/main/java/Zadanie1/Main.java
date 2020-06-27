package Zadanie1;

import java.util.EnumSet;

public class Main {
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
