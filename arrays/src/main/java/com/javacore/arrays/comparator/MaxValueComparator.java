package com.javacore.arrays.comparator;

import com.javacore.arrays.entity.DoubleArrayEntity;
import java.util.Comparator;
import java.util.Optional;

import com.javacore.arrays.service.MinMaxServiceImpl;

public class MaxValueComparator implements Comparator<DoubleArrayEntity> {

    private final MinMaxServiceImpl maxService;

    public MaxValueComparator() {
        this.maxService = new MinMaxServiceImpl();
    }

    @Override
    public int compare(DoubleArrayEntity o1, DoubleArrayEntity o2) {
        Optional<Double> max1 = maxService.findMax(o1);
        Optional<Double> max2 = maxService.findMax(o2);
        if (max1.isEmpty() && max2.isEmpty()) {
            return 0;
        }
        if (max1.isEmpty()) {
            return -1;
        }
        if (max2.isEmpty()) {
            return 1;
        }

        return Double.compare(max1.get(), max2.get());
    }
}