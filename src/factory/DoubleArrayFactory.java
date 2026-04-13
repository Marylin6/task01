package factory;

import entity.DoubleArrayEntity;

public class DoubleArrayFactory {
    public DoubleArrayEntity create(double[] array) {
        return new DoubleArrayEntity(array);
    }
}