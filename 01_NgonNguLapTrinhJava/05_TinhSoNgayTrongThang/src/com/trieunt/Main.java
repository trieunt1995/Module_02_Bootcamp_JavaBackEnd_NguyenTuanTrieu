package com.trieunt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int thang;
        boolean flag = true;
        String result = "";

        Scanner scan = new Scanner(System.in);

        System.out.print("Nhập tháng cần kiểm tra: ");
        thang = scan.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = " có 31 ngày";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = " có 30 ngày";
                break;
            case 2:
                int nam;
                System.out.print("Nhập năm cần kiểm tra: ");
                nam = scan.nextInt();

                if((nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0)) {
                    result = " có 29 ngày";
                } else {
                    result = " có 28 ngày";
                }
                break;
            default:
                result = " không chính xác! Vui lòng kiểm tra lại.";
                break;
        }

        System.out.println("Tháng " + thang + result);
    }
}
