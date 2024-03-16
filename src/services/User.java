package services;

import interfaces.Observer;

public class User implements Observer {
    @Override
    public void update(String message) {
        System.out.println("User: " + message + ". Update user.");
    }
}
