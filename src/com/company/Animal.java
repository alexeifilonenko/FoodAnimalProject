package com.company;

 public abstract class Animal implements Meat {

    private int weight;

     public Animal(int weight) {
         this.weight = weight;
     }

     public void setWeight(int weight) {
         this.weight = weight;
     }

     @Override
    public void getWeight() {

    }

   public abstract int toEat(Food food);

}
