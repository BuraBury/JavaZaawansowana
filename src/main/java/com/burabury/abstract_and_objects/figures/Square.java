package com.burabury.abstract_and_objects.figures;

public class Square extends Figure{

    int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    double getField() {
        return Math.pow(getA(), 2);
    }

    @Override
    double getCircuit() {
        return 4 * getA();
    }
}
