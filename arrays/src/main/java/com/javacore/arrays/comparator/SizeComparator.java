package com.javacore.arrays.comparator;

import com.javacore.arrays.entity.DoubleArrayEntity;

import java.util.Comparator;

public class SizeComparator implements Comparator<DoubleArrayEntity> {
    @Override
    public int compare(DoubleArrayEntity o1, DoubleArrayEntity o2) {
        return Integer.compare(o1.getArray().length,o2.getArray().length);
    }
}
