package com.trieunt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = 0;
        int[] myArray;

        do {
            System.out.print("Nhập kích thước của mảng: ");
            size = scan.nextInt();
            if (size > 20 || size <= 0) {
                System.out.println("Kích thước của mảng phải lớn hơn 0 và nhỏ hơn 20");
            }

        } while (size > 20 || size <= 0);

        myArray = addElementInArray(size);
        printAllElementInArray(myArray);
        reverseArray(myArray);
        System.out.println("\n");
        printAllElementInArray(myArray);
    }

    public static int[] addElementInArray(int size) {
        Scanner scan = new Scanner(System.in);

        int[] myArray = new int[size];
        int element = 0;

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            element = scan.nextInt();
            myArray[i] = element;
        }

        return myArray;
    }

    public static void printAllElementInArray(int[] myArray) {
        System.out.print("Các phần tử trong mảng là: ");
        for (int element : myArray) {
            System.out.print(element + " ");
        }
    }

    public static void reverseArray(int[] myArray) {
        int size = myArray.length;
        int temp;
        for (int i = 0; i < size / 2; i++) {
            temp = myArray[i];
            myArray[i] = myArray[size - 1 - i];
            myArray[size - 1 - i] = temp;
        }
    }
}
