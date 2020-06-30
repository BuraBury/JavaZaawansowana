package com.burabury.abstract_and_objects.figures;

public class Triangle extends Figure {

    int a;
    int b;
    int c;
    int h;

    Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    double getField() {
        return getA() * getH();
    }

    @Override
    double getCircuit() {
        return getA() + getB() + getC();
    }
}
