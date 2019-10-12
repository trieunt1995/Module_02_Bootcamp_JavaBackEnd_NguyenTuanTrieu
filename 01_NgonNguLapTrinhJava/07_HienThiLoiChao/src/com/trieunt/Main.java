package com.trieunt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập tên bạn: ");
        name = scan.nextLine();

        System.out.println("Xin chào " + name);
    }
}
