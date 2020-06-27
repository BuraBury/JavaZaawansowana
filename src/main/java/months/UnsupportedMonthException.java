package months;

public class UnsupportedMonthException extends IndexOutOfBoundsException {

    public UnsupportedMonthException(int number) {
        super("Error occured while parsing " + number + " to Month");
    }



}
