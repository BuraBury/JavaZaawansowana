package com.burabury.generycznosc.zadanie4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyObject {

    private final String anyString;
    protected final int anyInt;

    public MyObject(String anyString, int anyInteger) {
        this.anyString = anyString;
        this.anyInt = anyInteger;
    }

    public String getAnyString() {
        return anyString;
    }

    public Integer getAnyInt() {
        return anyInt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyObject myObject = (MyObject) o;
        return Objects.equals(anyString, myObject.anyString) &&
                anyInt == myObject.getAnyInt();
    }


    @Override
    public int hashCode() {
        return Objects.hash(anyString, anyInt);
    }

    public static List<MyObject> removeDuplicates(List<MyObject> list) {

        List<MyObject> toReturn = new ArrayList<>();
        for (MyObject s : list) {
            if (!toReturn.contains(s)) {
                toReturn.add(s);
            }
        }
        return toReturn;
    }


}
