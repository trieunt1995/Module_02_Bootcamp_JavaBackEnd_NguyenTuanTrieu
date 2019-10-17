package com.trieunt;

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private int radius = 5;
    private String color = "Blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn()) {
            return "Trạng trái quạt đang bật: Tốc độ " + getSpeed() + " | Color " +
                    getColor() + " | Bán kính " + getRadius();
        }
        return "Trạng thái quạt: Tắt | Color " + getColor() + " | Bán kính " + getRadius();
    }
}
