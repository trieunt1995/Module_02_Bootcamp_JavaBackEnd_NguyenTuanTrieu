package com.trieunt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;
        float chuVi;
        float dienTich;

        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        width = scan.nextInt();
        System.out.print("Nhập chiều dài: ");
        height = scan.nextInt();

        chuVi = (width + height) * 2;
        dienTich = width * height;

        System.out.println("Chu vi hình chữ nhật: " + chuVi);
        System.out.println("Diện tích hình chữ nhật: " + dienTich);


    }
}
