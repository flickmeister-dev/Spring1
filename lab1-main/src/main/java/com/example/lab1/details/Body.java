package com.example.lab1.details;


public class Body extends Details {
    private int height;
    private  float width;

    public Body(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
