package com.burabury.generycznosc.zadanie4;

import java.util.*;

public class MyObject implements Comparable<MyObject> {

    private final String anyString;
    protected final int anyInt;
    protected int secondInt;

    public MyObject(String anyString, int anyInteger) {
        this.anyString = anyString;
        this.anyInt = anyInteger;
    }

    public MyObject(String anyString, int anyInteger, int secondInt) {
        this.anyString = anyString;
        this.anyInt = anyInteger;
        this.secondInt = secondInt;
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
                anyInt == myObject.getAnyInt() &&
                secondInt == myObject.secondInt;
    }


    @Override
    public int hashCode() {
        return Objects.hash(anyString, anyInt, secondInt);
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

    public int getSecondInt() {
        return secondInt;
    }

    public static void testSet() {
        MyObject myObject = new MyObject("a", 1, 3);
        MyObject myObject1 = new MyObject("b", 1);
        MyObject myObject2 = new MyObject("c", 2, 3);
        MyObject myObject3 = new MyObject("c", 2);

        Set<MyObject> hashSet = new HashSet<>();
        Set<MyObject> treeSet = new TreeSet<>(Comparator.comparing(MyObject::getAnyInt).thenComparing(MyObject::getAnyInt));

        hashSet.add(myObject);
        hashSet.add(myObject1);
        hashSet.add(myObject2);
        hashSet.add(myObject3);

        treeSet.add(myObject);
        treeSet.add(myObject1);
        treeSet.add(myObject2);
        treeSet.add(myObject3);

    }

    @Override
    public int compareTo(MyObject myObject) {
        return Comparator
                .comparing(MyObject::getAnyString)
                .thenComparing(MyObject::getAnyInt)
                .thenComparing(MyObject::getSecondInt)
                .compare(this, myObject);

    }

    public static void main(String[] args) {
        testSet();

        MyObject myObject = new MyObject("a", 1, 2);
        MyObject myObject1 = new MyObject("a", 3, 4);
        int value = myObject.compareTo(myObject1);
        System.out.println(value);
    }


}
