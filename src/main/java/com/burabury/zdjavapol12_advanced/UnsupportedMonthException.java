package com.burabury.zdjavapol12_advanced;

public class UnsupportedMonthException extends RuntimeException {

    public UnsupportedMonthException(int number) {
        super("Error occured while parsing " + number + " to Month");
    }

}
