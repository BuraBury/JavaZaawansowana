package com.burabury.generic.collections.map.key_ex_2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Key firstKey = new Key("first");
        Key secondKey = new Key("second");
        Key thirdKey = new Key("third");

        Map<Key, String> map = new HashMap<>();

        map.put(firstKey, "first value");
        map.put(secondKey, "second value");
        map.put(thirdKey, "third value");


        System.out.println(map.get(firstKey));
        System.out.println(map.get("first"));

        firstKey.keySet("first2");
        System.out.println(map.get(firstKey));


    }
}
