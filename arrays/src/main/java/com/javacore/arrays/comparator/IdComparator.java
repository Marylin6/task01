package com.javacore.arrays.comparator;

import com.javacore.arrays.entity.DoubleArrayEntity;

import java.util.Comparator;

public class IdComparator implements Comparator<DoubleArrayEntity> {
    @Override
    public int compare(DoubleArrayEntity o1, DoubleArrayEntity o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}