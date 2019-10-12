package com.trieunt;

import java.util.Scanner;

public class Main {
    /*
        Menu
        Draw the triangle
        Draw the square
        Draw the rectangle
     */
    public static void main(String[] args) {
        int n, chieuDai, chieuRong, choose;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);

        do {
            showMenu();
            choose = scan.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Mời bạn nhập chiều cao tam giác: ");
                    n = scan.nextInt();
                    drawTringle(n);
                    break;
                case 2:
                    System.out.print("Mời bạn nhập chiều cao tam giác: ");
                    n = scan.nextInt();
                    drawSquare(n);
                    break;
                case 3:
                    System.out.print("Nhập chiều dài: ");
                    chieuDai = scan.nextInt();
                    System.out.print("Nhập chiều rộng: ");
                    chieuRong = scan.nextInt();
                    drawRectangle(chieuRong, chieuDai);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Không hợp lệ! Vui lòng chọn lại chức năng.");
            }

        } while (flag);

    }

    public static void showMenu() {
        System.out.println("/*================== Menu ==================*/");
        System.out.println("1. Vẽ hình tam giác");
        System.out.println("2. Vẽ hình vuông");
        System.out.println("3. Vẽ hình chữ nhật");
        System.out.println("/*==========================================*/");
        System.out.print("Chọn chức năng: ");
    }

    public static void drawTringle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void drawSquare(int n) {
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void drawRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
