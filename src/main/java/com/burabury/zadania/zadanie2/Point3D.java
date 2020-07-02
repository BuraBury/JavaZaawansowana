package com.burabury.zadania.zadanie2;

import java.util.Objects;

public class Point3D extends Point2D {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + getX() +
                ", y=" + getY() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return z == point3D.z && getX() == point3D.getX() && getY() == point3D.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(z, getX(), getY());
    }
}
