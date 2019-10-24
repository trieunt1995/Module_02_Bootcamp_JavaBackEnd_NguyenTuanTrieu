package com.trieunt.bai1;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] list = new Animal[2];
        list[0] = new Chicken();
        list[1] = new Tiger();

        for (Animal item : list) {
            System.out.println(item.makeSound());

            if (item instanceof Chicken) {
                Edible edible = (Edible) item;
                System.out.println(edible.howToEat());
            }
        }
    }
}
