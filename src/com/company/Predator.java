package com.company;

public class Predator extends Animal {
    public Predator(int weight) {
        super(weight);
    }

    @Override
    public int toEat(Food food) {
        if (food instanceof Meat) {
            if(weight > food.getWeight()) {
                weight = weight + food.getWeight();
            } else {
                System.out.println("This food is too large for me");
            }

        } else {
            System.out.println("Predator eats only meat");
        }
        return weight;
    }
}
