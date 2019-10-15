package com.trieunt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choose;
        boolean flag = true;
        double celsius;
        double fahrenheit;

        do {
            showMenu();
            choose = scan.nextInt();

            switch (choose) {
                case 1:
                    System.out.print("Mời bạn nhập độ C: ");
                    celsius = scan.nextDouble();
                    System.out.println(celsius + " độ C => " + convertToFahrenheit(celsius) + " độ F");
                    break;
                case 2:
                    System.out.print("Mời bạn nhập độ F: ");
                    fahrenheit = scan.nextDouble();
                    System.out.println(fahrenheit + " độ F => " + convertToCelsius(fahrenheit) + " độ C");
                    break;
                case 3:
                    System.out.println("Bye bye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ! Xin chọn lại");
                    flag = true;
            }

        } while (flag);
    }

    public static void showMenu() {
        System.out.println("============= Menu =============");
        System.out.println("1. Chuyển từ độ C sang độ F");
        System.out.println("2. Chuyển từ độ F sang độ C");
        System.out.println("3. Thoát chương trình");
        System.out.println("================================");
        System.out.print("Mời bạn chọn chức năng: ");
    }

    public static double convertToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double convertToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
