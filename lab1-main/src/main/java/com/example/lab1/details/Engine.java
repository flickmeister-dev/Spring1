package com.example.lab1.details;

public class Engine extends Details {
    private String type;
    private int cylinders;
    private int displacement;



    public Engine(String type, int cylinders, int displacement) {
        this.type = type;
        this.cylinders = cylinders;
        this.displacement = displacement;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }
}
