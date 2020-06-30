package com.burabury.abstract_and_objects.figures;

public class FigureTest {
    public static void main(String[] args) {

        Square square = new Square(2);
        Triangle triangle = new Triangle(3, 3, 3, 4);
        Circle circle = new Circle(3);

        System.out.println(circle.getField());
        System.out.println(circle.getCircuit());

    }
}
