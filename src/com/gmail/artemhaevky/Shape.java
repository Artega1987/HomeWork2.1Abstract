package com.gmail.artemhaevky;

public abstract class Shape {

    abstract double getPerimetr ();
    abstract double getArea();
    public double  getSideLength (Point a, Point b) {
        return Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
    }


}
