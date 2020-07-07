package com.burabury.obiektowosc.figures;

public class Triangle extends Figure {

    private int a;
    private int b;
    private int c;
    private int h;

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
    double getField() throws Exception {
        double s;
        if ((a < b + c && b < a + c && c < a + b)) {
            s = (double) ((a + b + c) * ((a + b) - c) * ((a - b) + c) * (-a + b + c)) / 4;
        } else throw new WrongFieldData();
        return Math.sqrt(s);
    }

    @Override
    double getCircuit() {
        double circuit = a + b + c;
        if (circuit < 0 || !(a < b + c && b < a + c && c < a + b)) {
            try {
                throw new WrongCircuitData();
            } catch (WrongCircuitData wrongCircuitData) {
                System.exit(0);
            }
        }

        return circuit;
    }



}
