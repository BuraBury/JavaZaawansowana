package com.burabury.abstract_and_objects.figures;

public class FigureTest {
    public static void main(String[] args) throws Exception {

        Square square = new Square(2);
        Triangle triangle = new Triangle(2, 1, 5, 4);
        Circle circle = new Circle(3);


        try {
            System.out.println(triangle.getField());
        } catch (WrongFieldData e) {
            System.out.println(("There's no such triangle in this World, my Lord"));
        }




    }
}
