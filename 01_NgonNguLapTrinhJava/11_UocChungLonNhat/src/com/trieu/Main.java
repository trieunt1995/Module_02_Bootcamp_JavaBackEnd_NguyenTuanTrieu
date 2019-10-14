package com.trieu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b;

        Scanner scan = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        a = scan.nextInt();
        System.out.print("Nhập số b: ");
        b = scan.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất");
        } else {
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
            System.out.println("Ước chung lớn nhất là " + a);
        }

    }
}
