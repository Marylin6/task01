package com.javacore.arrays.entity;

import com.javacore.arrays.observer.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void notifyObservers();
}
