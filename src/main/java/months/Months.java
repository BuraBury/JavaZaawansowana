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

    int ordinalNumber;

    Months() {
        this.ordinalNumber = this.ordinal();
    }

    public int getOrdinalNumber() {
        return ordinalNumber;
    }


    public static String ofNumber(int monthNumber) {
        try {
            return Months.values()[monthNumber - 1].toString();

        } catch (IndexOutOfBoundsException e) {
            return "There're only 12 months. " + e.getMessage();

        }


    }
}
