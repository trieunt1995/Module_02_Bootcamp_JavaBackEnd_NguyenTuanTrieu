package com.trieunt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = 0;

        do {
            System.out.print("Nhập số phần tử cho mảng: ");
            size = scan.nextInt();
            if (size > 20 || size <= 0) {
                System.out.println("Kích thước của mảng phải lớn 0 và nhỏ hơn 20");
            }
        } while (size > 20 || size <= 0);

        int[] myArr = addElementArray(size);
        printAllElementArray(myArr);
        findElementMax(myArr);

    }

    public static int[] addElementArray(int size) {
        Scanner scan = new Scanner(System.in);
        int element = 0;
        int[] myArray = new int[size];

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            element = scan.nextInt();
            myArray[i] = element;
        }
        return myArray;
    }

    public static void printAllElementArray(int[] myArray) {
        System.out.print("Danh sách trong mảng: ");
        for (int element : myArray) {
            System.out.print(element + " ");
        }
    }

    public static void findElementMax(int[] myArr) {
        int max = myArr[0];
        int position = 1;

        for (int i = 1; i < myArr.length; i++) {
            if (max < myArr[i]) {
                max = myArr[i];
                position = i + 1;
            }
        }

        System.out.println("\nPhần tử lớn nhất trong mảng là: " + max + " tại vị trí: " + position);

    }
}
