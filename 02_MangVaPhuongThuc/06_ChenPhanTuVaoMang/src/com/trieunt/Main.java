package com.trieunt;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



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

    public static int[] addNewAElement(int position, int[] myArray) {


        return myArray;
    }
}
