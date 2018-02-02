package com.gmail.artemhaevky;

public class Circle extends Shape {

    private Point a;
    private double r;

    public Circle() {
        super();
    }

    public Circle(Point a, double r) {
        super();
        this.a = a;
        this.r = r;
    }

    @Override
    double getPerimetr() {
        return 2 * Math.PI * r;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(r, 2);
    }
}
