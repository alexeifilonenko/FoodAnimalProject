package com.company;

public class Predator extends Animal {
    public Predator(int weight) {
        super(weight);
    }

    @Override
    public int toEat(Food food) {
        if (food instanceof Meat) {
            weight = weight + food.getWeight();
        } else {
            System.out.println("Predator eats only meat");
        }
        return weight;
    }
}
