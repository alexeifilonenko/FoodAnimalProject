package com.company;

import com.company.Herbivours.Elephant;
import com.company.Herbivours.Horse;
import com.company.Herbivours.Rabbit;
import com.company.Predators.Lion;
import com.company.Predators.Tiger;
import com.company.Predators.Wolf;

public class Main {

    public static void main(String[] args) {

        // Животные
        Animal rabbit = new Rabbit(5);
        Animal horse = new Horse(250);
        Animal elephant =  new Elephant(1000);
        Animal lion = new Lion(120);
        Animal tiger = new Tiger(95);
        Animal wolf = new Wolf(50);

        // Траву
        Grass cannabis = new Cannabis(1);

        // Еду
        Food cannabisFood = cannabis;
        Food elephantMeat = elephant;



        rabbit.toEat(cannabisFood);
        System.out.println(rabbit.getWeight());
        rabbit.toEat(elephantMeat);
        lion.toEat(rabbit);
        System.out.println(lion.getWeight());
        lion.toEat(elephantMeat);
        System.out.println(lion.getWeight());
        wolf.toEat(rabbit);
        System.out.println(wolf.getWeight());
        wolf.toEat(tiger);
        wolf.toEat(cannabis);
    }
}
