package com.zwierzeta;

public class Zwierze implements Zachowania {

    public void wydajDzwiek() {
        System.out.println("Kazde zwierze ma swoj glos");
    }

    @Override
    public void jedz() {
        System.out.println("Am am am");
    }

    @Override
    public String przemieszczajSie(int droga) {
        return "Tyle przeszedłem: " + Integer.parseInt(String.valueOf(droga)) + "m";
    }


}
