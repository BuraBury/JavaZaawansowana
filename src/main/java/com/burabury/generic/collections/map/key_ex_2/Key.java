package com.burabury.generic.collections.map.key_ex_2;

import java.util.Objects;

public class Key {

    private String keyName;

    public Key(String key) {
        this.keyName = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key1 = (Key) o;
        return Objects.equals(keyName, key1.keyName);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public void keySet(String name) {
        this.keyName = name;
    }
}
