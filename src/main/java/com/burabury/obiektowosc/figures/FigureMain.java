package com.burabury.obiektowosc.figures;

public class FigureMain {
    public static void main(String[] args) throws Exception {

        Square square = new Square(2);
        Triangle triangle = new Triangle(4, 3, 5, 4);
        Circle circle = new Circle(-2);

        try {
            System.out.println(triangle.getField());
        } catch (WrongFieldData e) {
            System.out.println(("There's no such triangle in this World, my Lord"));
        }

        System.out.println(triangle.getCircuit());

        System.out.println(square.getCircuit());
        System.out.println(square.getField());

        System.out.println(circle.getCircuit());


    }


}
