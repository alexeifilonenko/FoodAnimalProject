package com.company;

 public abstract class Animal implements Meat {

    protected int weight;

     public Animal(int weight) {
         this.weight = weight;
     }

     public void setWeight(int weight) {
         this.weight = weight;
     }

     @Override
    public int getWeight() {
        return weight;
    }

   public abstract int toEat(Food food);

}
