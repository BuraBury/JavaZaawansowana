package com.zwierzeta;

public interface Zachowania {

    void jedz();

    String przemieszczajSie(int droga);


//metoda domysna moze miec cialo metody w interface (zawiera slowko kluczowe 'defalut'):
    default void metodaDomyslna() {
        System.out.println("to jest metoda domyslna interfacu");
    }
}
