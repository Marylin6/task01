package factory;

import entity.DoubleArrayEntity;

public class DoubleArrayFactory {
    private int currentId = 1;

    public DoubleArrayEntity create(double[] array) {
        return new DoubleArrayEntity(currentId++, array);
    }
}