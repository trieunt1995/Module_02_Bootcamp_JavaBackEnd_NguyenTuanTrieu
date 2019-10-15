package com.trieunt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choose;
        boolean flag = false;

        do {
            showMenu();
            choose = scan.nextInt();

            switch (choose) {
                case 1:
                    int width, height;
                    System.out.print("Nhập chiều rộng: ");
                    width = scan.nextInt();
                    System.out.print("Nhập chiều cao: ");
                    height = scan.nextInt();

                    drawRectangle(width, height);

                    break;
                case 2:
                    System.out.print("Nhập chiều cao tam giác: ");
                    int n = scan.nextInt();
                    System.out.println("********** Các loại tam giác *********");
                    drawSquareTriangleTopLeft(n);
                    System.out.println("=======================================");
                    drawSquareTriangleTopRight(n);
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng không tồn tại! Vui lòng chọn lại.");
                    flag = true;
            }

        } while (flag);

    }

    public static void showMenu() {
        System.out.println("/*=============== Vẽ các loại hình ===============*/");
        System.out.println("1. Vẽ hình chữ nhật");
        System.out.println("2. Vẽ các loại hình tam giác");
        System.out.println("3. Vẽ hình tam giác cân");
        System.out.println("4. Thoát");
        System.out.println("/*================================================*/");
        System.out.print("Chọn loại hình cần vẽ: ");
    }

    public static void drawRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void drawSquareTriangleTopLeft(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void drawSquareTriangleTopRight(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j <= 0; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
}
