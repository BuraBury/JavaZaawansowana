package com.burabury.objects.phone;

import java.util.Objects;

public class PhoneHashCodeExample extends PhoneEqualsExample {
    String name;
    int phoneNumber;

    public PhoneHashCodeExample(String name, int phoneNumber) {
        super(name, phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }


}
