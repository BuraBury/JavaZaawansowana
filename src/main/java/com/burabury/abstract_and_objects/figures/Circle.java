package com.burabury.abstract_and_objects.figures;

public class Circle extends Figure {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    @Override
    double getCircuit() {
        return Math.PI * 2 * getR();
    }

    @Override
    double getField() {
        return Math.PI * Math.pow(getR(), 2);
    }


}
