package com.company.Predators;

import com.company.Predator;

public class Tiger extends Predator {
    private int weightTiger;

    public Tiger(int weight) {
        super(weight);
    }

    public int getWeightTiger() {
        return weightTiger;
    }

    public void setWeightTiger(int weightTiger) {
        this.weightTiger = weightTiger;
    }
}
