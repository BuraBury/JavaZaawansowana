package months;

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
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }



}
