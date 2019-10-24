package com.trieunt.bai1;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken sound";
    }

    @Override
    public String howToEat() {
        return "Chicken eat";
    }
}
