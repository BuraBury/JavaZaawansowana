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
        double circuit = Math.PI * 2 * getR();
        if (circuit < 0) {
            try {
                throw new WrongCircuitData();
            } catch (WrongCircuitData wrongCircuitData) {
               System.exit(0);
            }
        }
        return circuit;
    }

    @Override
    double getField() {
        return Math.PI * Math.pow(getR(), 2);
    }



}
