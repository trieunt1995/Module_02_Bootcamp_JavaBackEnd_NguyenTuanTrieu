package com.trieunt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra: ");
        n = scan.nextInt();
        if(isPrime(n)) {
            System.out.println(n + " là số nguyên tố");
        } else {
            System.out.println(n + " không phải là số nguyên tố");
        }
    }

    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

}


