package com.burabury.generycznosc.food;

public class Main {
    public static void main(String[] args) {
        Cabbage cabbage = new Cabbage("cabbage");
        Beef beef = new Beef("Beef");
        Nudle nudle = new Nudle("nudle");

        Chef<Nudle> chefNudle = new Chef<>();
        Chef<Beef> chefBeef = new Chef<>();
        Chef<Cabbage> chefCabbage = new Chef<>();

        Chef<Food> masterChef = new Chef<>();

        chefBeef.prepareMeal(beef);
        chefNudle.prepareMeal(nudle);
        chefCabbage.prepareMeal(cabbage);

        masterChef.prepareMeal(beef);
        masterChef.prepareMeal(nudle);
        masterChef.prepareMeal(cabbage);


    }
}
