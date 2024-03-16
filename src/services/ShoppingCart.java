package services;

import interfaces.Observer;

public class ShoppingCart implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Shopping cart: " + message + ". Empty cart.");
    }
}
