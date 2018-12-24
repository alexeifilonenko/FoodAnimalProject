package com.company;

public class Herbivorous extends Animal {
    public Herbivorous(int weight) {
        super(weight);
    }

    @Override
    public int toEat(Food food) {
        if (food instanceof Grass) {

        } else {
            System.out.println("Herbivorous eats only grass");
        }
    }
}
