package com.company;

public class Predator extends Animal {
    public Predator(int weight) {
        super(weight);
    }

    @Override
    public int toEat(Food food) {
        if(food instanceof Meat) {
            return ;
        } else {
            System.out.println("Predators eats only meat");
        }
    }
}
