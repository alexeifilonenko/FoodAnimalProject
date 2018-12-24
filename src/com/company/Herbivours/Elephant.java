package com.company.Herbivours;

import com.company.Herbivorous;

public class Elephant extends Herbivorous {
    private int weightElephant;

    public Elephant(int weight) {
        super(weight);
    }

    public int getWeightElephant() {
        return weightElephant;
    }

    public void setWeightElephant(int weightElephant) {
        this.weightElephant = weightElephant;
    }
}
