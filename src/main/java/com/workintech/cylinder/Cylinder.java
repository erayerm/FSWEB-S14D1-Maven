package com.workintech.cylinder;

public class Cylinder extends Circle {
    public double height;
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return height * getArea();
    }
}
