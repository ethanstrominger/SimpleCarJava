package com.ethan;

import java.util.UUID;

public class Car {
    private final String color;
    public String id;


    public Car(String color) {
        this.color = color;
        this.id = UUID.randomUUID().toString();
        Cars.add(this);
    }


}

