package com.ethan;

// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;

import java.util.Hashtable;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @BeforeEach
    void before() {
        Cars.inventory = new Hashtable<>();
    }

    @AfterEach
    void after() {
        Cars.inventory = new Hashtable<>();
    }

    @Test
    void testCarIdsAreUnique() {
        Car car1 = new Car("red");
        Car car2 = new Car("red");
        assertNotEquals(car1.id, car2.id);
    }

    @Test
    void testCanGetCarById() {
        Car car1 = new Car("red");
        Car car2 = new Car("red");
        assertEquals(car1, Cars.getById(car1.id));
        assertEquals(car2, Cars.getById(car2.id));
    }

    @Test
    void testGetRedCar() {
        Car car1 = new Car("red");
        Car car2 = new Car("blue");
        Car car3 = new Car("blue");
        Hashtable<String, Car> redCars = Cars.getByColor("red");
        assertEquals(1, redCars.size());
    }


}

