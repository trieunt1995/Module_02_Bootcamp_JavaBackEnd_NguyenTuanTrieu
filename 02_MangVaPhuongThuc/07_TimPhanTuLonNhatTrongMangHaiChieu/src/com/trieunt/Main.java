package com.trieunt;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        print("Nhập số hàng: ");
        int rows = scan.nextInt();
        print("Nhập số cột: ");
        int cols = scan.nextInt();

        int[][] myArr = insertArray(cols, rows);

        displayArray(myArr);
        print("======================\n");
        print("Phần tử lớn nhất trong mảng là: " + findMax(myArr));
    }

    public static int findMax(int[][] myArr) {
        int max = myArr[0][0];

        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                if (max < myArr[i][j]) {
                    max = myArr[i][j];
                }
            }
        }

        return max;
    }

    public static int[][] insertArray(int col, int row) {
        int[][] myArray = new int[row][col];
        for (int i = 0; i < myArray.length; i++) {
            print("Nhập hàng thứ " + i + ":\n");
            for (int j = 0; j < myArray[i].length; j++) {
                print("Nhập phần tử thứ " + j + ": ");
                myArray[i][j] = scan.nextInt();
            }
        }

        return myArray;
    }

    public static void displayArray(int[][] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                System.out.print(myArr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void print(String content) {
        System.out.print(content);
    }

}
