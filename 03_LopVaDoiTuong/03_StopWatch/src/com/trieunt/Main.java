package com.trieunt;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        StopWatch st = new StopWatch();

        System.out.println(st);
        st.start();
        for (int i = 0; i <= 1000; i++) {
            System.out.print("");
        }

        st.end();

        System.out.println("Thời gian chạy vòng lặp 1000 lần là: " + st.getElapsedTime() + "ms");


    }
}
