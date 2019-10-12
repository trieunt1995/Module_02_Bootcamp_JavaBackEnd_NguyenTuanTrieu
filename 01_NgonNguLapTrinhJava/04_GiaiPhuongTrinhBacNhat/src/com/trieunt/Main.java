package com.trieunt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b;

        Scanner scan = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        a = scan.nextDouble();
        System.out.print("Nhập hệ số b: ");
        b = scan.nextDouble();

        if(a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.println("Phương trình có nghiệm x = " + (-b / a));
        }
    }
}
