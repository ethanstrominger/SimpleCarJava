package com.ethan;

// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;

import java.util.Enumeration;
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
    void testGetBlueCar() {
        String blue = "blue";
        String red = "red";
        Car car1 = new Car(red);
        Car car2 = new Car(blue);
        Car car3 = new Car(blue);

        assertCarsInInventory(blue, 2);
        assertCarsInInventory(red, 1);
    }

    private void assertCarsInInventory(String color, int expectedCount) {
        Hashtable<String, Car> blueCars = Cars.getByColor(color);
        assertEquals(expectedCount, blueCars.size());

        Enumeration<String> enumeration = blueCars.keys();

        while(enumeration.hasMoreElements()) {
            String key = enumeration.nextElement();
            Car car = blueCars.get(key);
            assertEquals(color, car.color);
        }
    }
}

