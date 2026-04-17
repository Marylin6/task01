package com.javacore.arrays.service;

import com.javacore.arrays.entity.DoubleArrayEntity;

import java.util.Optional;

public class SumAverageServiceImpl {
    public Optional<Double> sum(DoubleArrayEntity entity) {
        double[] arr = entity.getArray();

        if (arr.length == 0) {
            return Optional.empty();
        }

        double sum = 0;
        for (double num : arr) {
            sum += num;
        }

        return Optional.of(sum);
    }

    public Optional<Double> average(DoubleArrayEntity entity) {
        double[] arr = entity.getArray();

        if (arr.length == 0) {
            return Optional.empty();
        }

        double sum = 0;
        for (double num : arr) {
            sum += num;
        }

        return Optional.of((double) sum / arr.length);
    }
}
