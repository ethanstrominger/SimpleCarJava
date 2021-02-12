package com.ethan;

import java.util.UUID;

public class Car {
    public String id;

    public Car() {
        this.id = UUID.randomUUID().toString();
    }
}

