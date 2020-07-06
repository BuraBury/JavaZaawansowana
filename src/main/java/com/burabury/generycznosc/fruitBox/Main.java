package com.burabury.generycznosc.fruitBox;

public class Main {
    public static void main(String[] args) {
        FruitBox<Apple> appletBox = new FruitBox<>(new Apple());
        FruitBox<Orange> orangeBox = new FruitBox<>(new Orange());

        Orange fruit = orangeBox.getFruit();

        Pair<FruitBox<Apple>, FruitBox<Orange>> pairOfBoxes =
                new Pair<>(
                        new FruitBox<>(new Apple()),
                        new FruitBox<>(new Orange())
                );

    }
}
