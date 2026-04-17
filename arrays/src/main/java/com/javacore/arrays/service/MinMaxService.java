package com.javacore.arrays.service;

import com.javacore.arrays.entity.DoubleArrayEntity;

import java.util.Optional;

public interface MinMaxService {

    Optional<Double> findMin(DoubleArrayEntity entity);

    Optional<Double> findMax(DoubleArrayEntity entity);
}