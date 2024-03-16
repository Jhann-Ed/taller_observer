package services;

import interfaces.Observer;

public class Inventory implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Inventory: " + message + ". Update Inventory.");
    }
}
