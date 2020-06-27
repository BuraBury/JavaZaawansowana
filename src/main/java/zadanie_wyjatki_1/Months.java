package zadanie_wyjatki_1;

public enum Months {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    private final int numberOfMonth;

    Months(int numberOfMonth) {
        this.numberOfMonth = numberOfMonth;
    }

    public int getNumberOfMonth() {
        return numberOfMonth;
    }

    public static void showMonthByNumber(int number) {
        try {
            System.out.println(Months.values()[number - 1]);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
