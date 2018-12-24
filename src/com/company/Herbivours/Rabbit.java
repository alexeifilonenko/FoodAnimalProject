package com.company.Herbivours;

import com.company.Herbivorous;

public class Rabbit extends Herbivorous {
    private int weightRabbit;

    public Rabbit(int weight) {
        super(weight);
    }


    public int getWeightRabbit() {
        return weightRabbit;
    }

    public void setWeightRabbit(int weightRabbit) {
        this.weightRabbit = weightRabbit;
    }
}
