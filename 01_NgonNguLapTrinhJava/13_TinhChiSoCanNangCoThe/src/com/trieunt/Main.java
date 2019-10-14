package com.trieunt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double chieuCao, canNang;

        Scanner scan = new Scanner(System.in);

        System.out.print("Nhập vào chiều cao: ");
        chieuCao = scan.nextDouble();
        System.out.print("Nhập vào cân nặng: ");
        canNang = scan.nextDouble();

        System.out.println("Chỉ số cân nặng của bạn là: " + chiSoCanNang(chieuCao, canNang));
    }

    public static String chiSoCanNang(double chieuCao, double canNang) {
        double bmi = canNang / (chieuCao * chieuCao);

        if (bmi < 18.5) {
            return bmi + " - Underweight";
        }
        if (bmi < 25) {
            return bmi + " - Normal";
        }
        if (bmi < 30) {
            return bmi + " - Overweight";
        }
        return bmi + " - Obese";
    }
}
