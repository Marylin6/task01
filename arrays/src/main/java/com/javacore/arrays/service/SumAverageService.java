package com.javacore.arrays.service;

import com.javacore.arrays.entity.DoubleArrayEntity;

import java.util.Optional;

public interface SumAverageService {

    Optional<Double> findSum(DoubleArrayEntity entity);

    Optional<Double> findAverage(DoubleArrayEntity entity);
}