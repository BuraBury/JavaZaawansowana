package com.zwierzeta;

public class Zwierze implements Zachowania {

    public void wydajDzwiek() {
        System.out.println("Kazde zwierze ma swoj glos");
    }

    @Override
    public void jedz() {
        System.out.println("am am am");
    }

    @Override
    public int przemieszczajSie(int droga) {
        return droga;
    }



}
