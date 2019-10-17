package com.trieunt;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int total = scanner.nextInt();

        int[] myArr = addElememtInArray(total);
        displayAllElementInArray(myArr);
        System.out.print("\nNhập vị trí cần thêm: ");
        int position = scanner.nextInt();
        System.out.print("Nhập giá trị phần tử cần thêm: ");
        int element = scanner.nextInt();
        System.out.print("Mảng sau khi thêm là: ");
        displayAllElementInArray(addNewAElement(position, myArr, element));

    }

    public static int[] addElememtInArray(int total) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[total];
        int element = 0;

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            element = scanner.nextInt();

            myArray[i] = element;
        }

        return myArray;
    }

    public static void displayAllElementInArray(int[] myArray) {
        System.out.print("Phần tử có trong mảng là: ");
        for (int element : myArray) {
            System.out.print(element + " ");
        }
    }


    public static int[] addNewAElement(int position, int[] myArray, int element) {
        int[] newArr = Arrays.copyOf(myArray, myArray.length+1);
        for (int i = newArr.length-2; i >= position; i--) {
            newArr[i+1] = newArr[i];

        }
        newArr[position] = element;
        return newArr;
    }
}
