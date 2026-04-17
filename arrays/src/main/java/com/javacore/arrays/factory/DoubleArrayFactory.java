package com.javacore.arrays.factory;

import com.javacore.arrays.entity.DoubleArrayEntity;
import com.javacore.arrays.observer.Observer;

public class DoubleArrayFactory {
    private int currentId = 1;
    private Observer observer;

    public DoubleArrayFactory(Observer observer) {
        this.observer = observer;
    }

    public DoubleArrayEntity create(double[] array) {
        return new DoubleArrayEntity(currentId++, array, observer);
    }
}