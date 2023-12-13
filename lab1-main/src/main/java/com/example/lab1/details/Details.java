package com.example.lab1.details;

import com.example.lab1.Motorcycle;

public abstract class Details {
    private Motorcycle motorcycle;

    public Details() {
    }

    public Details(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }

    public Motorcycle getMotorcycle() {
        return motorcycle;
    }

    public void setMotorcycle(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }
}
