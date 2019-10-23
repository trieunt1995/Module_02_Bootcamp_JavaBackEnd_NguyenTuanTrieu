package com.trieunt.bai1;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + this.width + " and length ="
                + this.length + ", which is a subclass of " + super.toString();
    }
}
