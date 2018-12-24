package com.company.Predators;

import com.company.Predator;

public class Wolf extends Predator {
    private int weightWolf;

    public Wolf(int weight) {
        super(weight);
    }

    public int getWeightWolf() {
        return weightWolf;
    }

    public void setWeightWolf(int weightWolf) {
        this.weightWolf = weightWolf;
    }
}
