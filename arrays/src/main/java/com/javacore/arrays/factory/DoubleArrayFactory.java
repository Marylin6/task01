package com.javacore.arrays.factory;

import com.javacore.arrays.entity.DoubleArrayEntity;

public class DoubleArrayFactory {
    private int currentId = 1;

    public DoubleArrayEntity create(double[] array) {
        return new DoubleArrayEntity(currentId++, array);
    }
}