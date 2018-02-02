package com.gmail.artemhaevky;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(3,8);
        Point b = new Point(3,6);
        Point c = new Point(3,6);
        double r = 12;
        Triangle triangle = new Triangle(a, b, c);
        Circle   circle   = new Circle(a, r);



    }
}
