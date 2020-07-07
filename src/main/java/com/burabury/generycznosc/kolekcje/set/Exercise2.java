package com.burabury.generycznosc.kolekcje.set;

import java.util.HashSet;
import java.util.LinkedList;

public class Exercise2 {

    public static void main(String[] args) {

        String one = "one";
        String three = "three";
        String otherThree = "three";
        String two = "two";
        String janusz = "janusz";
        String otherTwo = "two";
        String four = "four";
        String oneMoreFour = "four";

        HashSet<String> hashSet = new HashSet<>();
        LinkedList<String> linkedList = new LinkedList<>();

        hashSet.add(one);
        hashSet.add(three);
        hashSet.add(otherThree);
        hashSet.add(two);
        hashSet.add(janusz);
        hashSet.add(otherTwo);
        hashSet.add(four);
        hashSet.add(oneMoreFour);

        linkedList.add(one);
        linkedList.add(three);
        linkedList.add(otherThree);
        linkedList.add(two);
        linkedList.add(janusz);
        linkedList.add(otherTwo);
        linkedList.add(four);
        linkedList.add(oneMoreFour);

        System.out.println(hashSet); //bez duplikatow
        System.out.println(linkedList);

    }
}
