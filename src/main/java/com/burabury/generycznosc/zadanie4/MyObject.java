package com.burabury.generycznosc.zadanie4;

import java.util.*;

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

    public int getAnyInt() {
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

    public static void testSet() {
        MyObject myObject = new MyObject("a", 1);
        MyObject myObject1 = new MyObject("b", 1);
        MyObject myObject2 = new MyObject("c", 2);

        Set<MyObject> hashSet = new HashSet<>();
        Set<MyObject> treeSet = new TreeSet<>(Comparator.comparing(MyObject::getAnyInt).thenComparing(MyObject::getAnyInt));

        hashSet.add(myObject);
        hashSet.add(myObject1);
        hashSet.add(myObject2);

        treeSet.add(myObject);
        treeSet.add(myObject1);
        treeSet.add(myObject2);


    }


}
