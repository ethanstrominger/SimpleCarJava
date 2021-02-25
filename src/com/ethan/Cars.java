package com.ethan;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Objects;

public class Cars {

    static Hashtable<String, Car> inventory = new Hashtable<>();

    public static void add(Car car) {
        Cars.inventory.put(car.id, car);
    }

    public static Car getById(String id) {
        return Cars.inventory.get(id);
    }

    public static Hashtable<String, Car> getByColor(String color) {
        Hashtable<String, Car> list = new Hashtable<>();
        Enumeration<String> enumeration = inventory.keys();

        while(enumeration.hasMoreElements()) {
            String key = enumeration.nextElement();
            Car car = inventory.get(key);
            if (Objects.equals(car.color, color)) {
                list.put(key, car);
            }
        }
        return list;
    }

    public static Hashtable<String, Car> getInventory() {
        return inventory;
    }

    public static void deleteById(String id) {
        // todo: implement
    }
}
