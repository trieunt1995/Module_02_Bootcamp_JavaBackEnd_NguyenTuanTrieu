package com.trieunt;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        while (count < 20) {
            if (isPrime(number)) {
                count++;
                System.out.print(number + " ");
                number++;
            } else {
                number++;
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
