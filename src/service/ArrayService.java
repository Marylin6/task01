package service;

import entity.DoubleArrayEntity;

import java.util.Optional;

public interface ArrayService {

    Optional<Double> findMin(DoubleArrayEntity entity);

    Optional<Double> findMax(DoubleArrayEntity entity);

    Optional<Double> sum(DoubleArrayEntity entity);

    Optional<Double> average(DoubleArrayEntity entity);

    void mergeSort(DoubleArrayEntity entity);

    void insertionSort(DoubleArrayEntity entity);
}
