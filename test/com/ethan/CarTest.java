package com.ethan;

// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    void testCarIdsAreUnique() {
        Car car1 = new Car();
        Car car2 = new Car();
        assertNotEquals(car1.id, car2.id);
    }

    @Test
    void testCanGetCarById() {
        Car car1 = new Car();
        Car car2 = new Car();
        assertEquals(car1, Cars.getById(car1.id));
        assertEquals(car2, Cars.getById(car2.id));
    }



}

