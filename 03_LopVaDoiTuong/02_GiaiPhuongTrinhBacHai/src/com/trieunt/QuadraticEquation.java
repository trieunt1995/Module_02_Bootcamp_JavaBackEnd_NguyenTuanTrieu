package com.trieunt;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {

    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }
    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }
    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (b * b) - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / 2 * a;
    }
    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / 2 * a;
    }

    public void displayQuadraticEquation() {
        if (getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (getDiscriminant() == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép " + x);
        } else {
            System.out.println("Phương trình có 2 nghiệm x1 = " + getRoot1() + " và x2 = " + getRoot2());
        }
    }
}
