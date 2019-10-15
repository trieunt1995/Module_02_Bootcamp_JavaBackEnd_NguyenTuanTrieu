package com.trieunt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        System.out.print("Mời bạn nhập học sinh cần tìm: ");
        String name = scan.nextLine();

        int position = findValueArray(students, name);

        if (position != -1) {
            System.out.println("Học sinh có tên " + name + " nằm tại vị trí " + position);
        } else {
            System.out.println("Không tìm thấy học sinh có tên \"" + name + "\"");
        }


    }

    public static int findValueArray(String[] myArr, String name) {
        for (int i = 0; i < myArr.length; i++) {
            if (name.equals(myArr[i])) {
                return i;
            }
        }
        return -1;
    }
}
