package com.burabury.obiektowosc.phone;

import java.util.Objects;

public class PhoneEqualsExample {
    String name;
    int phoneNumber;

    public PhoneEqualsExample(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneEqualsExample that = (PhoneEqualsExample) o;
        return phoneNumber == that.phoneNumber &&
                Objects.equals(name, that.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, phoneNumber);
//    }
}
