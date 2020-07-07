package com.burabury.obiektowosc.zadania.zadanie2;

public class PointMain {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(10, 8);
        Point2D point2D1 = new Point2D(point2D);
        Point2D point2D2 = new Point2D(-2, 45);

        Point3D point3D = new Point3D(2, 3, 4);
        Point3D point3D1 = new Point3D(2, 3, 4);
        Point3D point3D2 = new Point3D(1, 3, 4);

        System.out.println(point2D.toString());
        System.out.println(point2D1.toString());
        System.out.println(point2D2.toString());

        System.out.println(point3D.equals(point3D2));
        System.out.println(point3D.equals(point3D1));
    }
}
