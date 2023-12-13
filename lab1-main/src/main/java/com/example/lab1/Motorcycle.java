package com.example.lab1;

import com.example.lab1.details.Details;

public class Motorcycle {

    private String name;
    private Details body;
    private Details wheels;

    public Motorcycle() {
    }

    // setters-----------------------------------------------------------------------------
    public void setName(String name) {
        this.name = name;
    }

    public void setBody(Details body) {
        this.body = body;
    }

    public void setWheels(Details wheels) {
        this.wheels = wheels;
    }



    // getters-----------------------------------------------------------------------------------------
    public String getName() {
        return this.name;
    }

    public Details getBody() {
        return this.body;
    }

    public Details getWheels() {
        return this.wheels;
    }



}
