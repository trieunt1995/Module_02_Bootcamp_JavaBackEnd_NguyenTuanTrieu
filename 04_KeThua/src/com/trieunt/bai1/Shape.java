package com.trieunt.bai1;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "Green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if (this.filled) {
            return "A Shape with color of " + this.color + " and filled";
        }
        return "A Shape with color of " + this.color + " and not filled";
    }
}
