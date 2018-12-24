package com.company.Herbivours;

import com.company.Herbivorous;

public class Horse extends Herbivorous {
    private int weightHorse;

    public Horse(int weight) {
        super(weight);
    }

    public int getWeightHorse() {
        return weightHorse;
    }

    public void setWeightHorse(int weightHorse) {
        this.weightHorse = weightHorse;
    }
}
