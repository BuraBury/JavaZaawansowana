package Zadanie1;

public class Main {

    public static void isGreaterThanSaturday(Enum<Enums> day) {
        int a = day.compareTo(Enums.SATURDAY);

        if (a == 0) {
            System.out.println("It's saturday");
        } else if (a < 0) {
            System.out.println("It's before Saturday");
        } else {
            System.out.println("It's after saturday");
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

        isGreaterThanSaturday(thursday);



    }
}
