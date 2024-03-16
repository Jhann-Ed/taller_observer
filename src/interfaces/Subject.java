package interfaces;

public interface Subject {

    public void regiterObserver(Observer observer);

    public void removeObserver(Observer observer);
    public void notifyObservers();

}
