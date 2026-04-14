package entity;

import observer.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void notifyObservers();
}
