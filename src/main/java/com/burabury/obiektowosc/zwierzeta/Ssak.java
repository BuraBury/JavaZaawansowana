package com.burabury.obiektowosc.zwierzeta;

import java.util.Objects;

public class Ssak extends Zwierze {
    String name;

    Ssak() {
    }

    Ssak(String name) {
        this.name = name;
    }


    @Override
    public void wydajDzwiek() {
        System.out.println("Kazdy ssak ma swoj glos");
    }

    @Override
    public void jedz() {
        System.out.println("Jem mleczko");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ssak ssak = (Ssak) o;
        return Objects.equals(name, ssak.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }




}
