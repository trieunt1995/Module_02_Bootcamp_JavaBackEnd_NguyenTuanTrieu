package com.trieunt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số phần tử có trong mảng: ");
        int size = scan.nextInt();

        int[] myArray = addElementInArray(size);
        printAllElementInArray(myArray);
        findMinElement(myArray);


    }

    public static int[] addElementInArray(int size) {
        int[] myArray = new int[size];
        int element = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            element = scan.nextInt();

            myArray[i] = element;
        }

        return  myArray;
    }

    public static void printAllElementInArray(int[] myArray) {
        System.out.print("Phần tử có trong mảng là: ");
        for (int element : myArray) {
            System.out.print(element + " ");
        }
    }

    public static void findMinElement(int[] myArray) {
        int min = myArray[0];
        int position = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
                position = i + 1;
            }
        }
        System.out.print("\nPhần tử nhỏ nhất trong mảng là: " + min + " nằm ở vị trí: " + position);
    }
}
