package com.ethan;

public class Car {
    static int counter = 1;

    public int id;

    public Car() {
        this.id = counter;
        counter++;
    }
}
