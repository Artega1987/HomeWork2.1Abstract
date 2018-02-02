package com.gmail.artemhaevky;

public class Triangle extends Shape{
    private Point a;
    private Point b;
    private Point c;


    public Triangle() {
        super();
    }

    public Triangle(Point a, Point b, Point c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;

    }
    double p = super.getSideLength(a,b)+super.getSideLength(b,c)+super.getSideLength(c,a);



    @Override
    double getPerimetr() {
        return p;
    }

    @Override
    double getArea(){
        return Math.sqrt(p * (p - super.getSideLength(a, b)) * (p - super.getSideLength(b, c)) * (p - super.getSideLength(c, a)));

    }

    }




