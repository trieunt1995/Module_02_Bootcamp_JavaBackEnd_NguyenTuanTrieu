package com.trieunt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập năm cần kiểm tra: ");
        year = scan.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " là năm nhuận");
        } else {
            System.out.println(year + " không phải là năm nhuận");
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
}
