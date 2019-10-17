package com.trieunt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double width, height;

        System.out.print("Nhập chiều dài: ");
        height = scan.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        width = scan.nextDouble();

        Rectangle hcn = new Rectangle(width, height);
        hcn.disPlay();

    }
}
