package com.trieunt;

public class Main {

    public static void main(String[] args) {
        System.out.print("Các số nguyên tố nhỏ hơn 100: ");
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }

    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
