package com.burabury.abstract_and_objects.zwierzeta;

public interface Zachowania {


  // int field = 10; interface moze miec zdefiniowane pola, są stałe - PUBLIC FINAL STATIC

    void jedz();

    String przemieszczajSie(int droga);

    void wydajDzwiek();

    //metoda domysna moze miec cialo metody w interface (zawiera slowko kluczowe 'defalut'):
    default void metodaDomyslna() {
        System.out.println("to jest metoda domyslna interfacu");
    }


}
