package com.trieunt;

public class Main {
    public static void main(String[] args) {
        Fan fanOne = new Fan();
        fanOne.setOn(true);
        fanOne.setSpeed(Fan.FAST);
        fanOne.setRadius(10);
        fanOne.setColor("Yellow");
        System.out.println(fanOne.toString());

        Fan fanTwo = new Fan();
        System.out.println(fanTwo.toString());
    }
}
