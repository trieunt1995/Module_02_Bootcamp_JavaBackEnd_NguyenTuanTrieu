package com.trieunt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double soTienGui, tiLeLaiSuat, soTienLai;
        int soThang;

        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập vào số tiền gửi: ");
        soTienGui = scan.nextDouble();
        System.out.print("Tỉ lệ lãi suất: ");
        tiLeLaiSuat = scan.nextDouble();
        System.out.print("Nhập vào số tháng: ");
        soThang = scan.nextInt();

        System.out.println("Tiền lãi nhận được là: " + tinhTienLai(soTienGui, tiLeLaiSuat, soThang));
    }

    public static double tinhTienLai(double soTienGui, double tiLeLaiSuat, int soThang) {
        double soTienLai = 0;
        for (int i = 1; i <= soThang; i++) {
            soTienLai = soTienGui * (tiLeLaiSuat / 100) * soThang;
        }
        return soTienLai;
    }
}

