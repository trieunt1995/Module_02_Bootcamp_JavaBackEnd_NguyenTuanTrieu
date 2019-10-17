package com.trieunt;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle() {

    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return this.width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }

    public double getArea(){
        return (width + height) * 2;
    }

    public double getPerimeter() {
        return width * height;
    }

    public void disPlay() {
        System.out.println("Chu vi hình chữ nhật: " + getArea());
        System.out.println("Diện tích hình chữ nhật: " + getPerimeter());
    }
}
