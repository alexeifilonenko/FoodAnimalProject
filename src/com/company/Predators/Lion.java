package com.company.Predators;

import com.company.Predator;

public class Lion extends Predator {
    private int weightLion;

    public Lion(int weight) {
        super(weight);
    }

    public int getWeightLion() {
        return weightLion;
    }

    public void setWeightLion(int weightLion) {
        this.weightLion = weightLion;
    }
}
