package com.burabury.generycznosc.zadaniaYT.zwierzaki;

public class Zwierze implements Comparable<Zwierze> {

    private Integer rozmarButa;

    public Zwierze(Integer rozmarButa) {
        this.rozmarButa = rozmarButa;
    }

    @Override
    public int compareTo(Zwierze o) {
        return rozmarButa.compareTo(o.rozmarButa);
    }
}
