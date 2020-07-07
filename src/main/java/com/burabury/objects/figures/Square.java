package com.burabury.objects.figures;

public class Square extends Figure {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    double getField() {
        return Math.pow(a, 2);
    }

    @Override
    double getCircuit() {
        double circuit = 4 * a;
        if (circuit < 0) {
            try {
                throw new WrongCircuitData();
            } catch (WrongCircuitData wrongCircuitData) {
                System.exit(0);
            }
        }
        return circuit;
    }



}
