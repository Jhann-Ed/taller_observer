package services;

import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class PaymentService implements Subject {

    private List<Observer> observers;
    private String message;

    public PaymentService() {
        this.observers = new ArrayList<>();
    }

    public void completePayment() {
        this.message = "payment completed";
        notifyObservers();

    }

    @Override
    public void regiterObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(message);
        }
    }
}
