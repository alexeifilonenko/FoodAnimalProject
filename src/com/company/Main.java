package com.company;

import com.company.Herbivours.Elephant;
import com.company.Herbivours.Rabbit;
import com.company.Predators.Lion;

public class Main {

    public static void main(String[] args) {

        // Животные
        Animal rabbit = new Rabbit(5);
        Animal elephant =  new Elephant(1000);
        Animal lion = new Lion(120);

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

    }
}
