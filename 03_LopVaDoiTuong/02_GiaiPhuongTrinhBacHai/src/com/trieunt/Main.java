package com.trieunt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;

        System.out.print("Nhập hệ số a: ");
        a = scan.nextDouble();
        System.out.print("Nhập hệ số b: ");
        b = scan.nextDouble();
        System.out.print("Nhập hệ số c: ");
        c = scan.nextDouble();

        QuadraticEquation ptbh = new QuadraticEquation(a, b, c);
        ptbh.displayQuadraticEquation();


    }
}
