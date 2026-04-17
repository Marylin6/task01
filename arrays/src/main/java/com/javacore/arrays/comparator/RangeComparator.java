package com.javacore.arrays.comparator;

import com.javacore.arrays.entity.DoubleArrayEntity;
import java.util.Comparator;

public class RangeComparator implements Comparator<DoubleArrayEntity> {

    @Override
    public int compare(DoubleArrayEntity o1, DoubleArrayEntity o2) {
        double range1 = getRange(o1.getArray());
        double range2 = getRange(o2.getArray());
        return Double.compare(range1, range2);
    }

    private double getRange(double[] array) {
        if (array == null || array.length == 0) return 0;
        double min = array[0];
        double max = array[0];
        for (double v : array) {
            if (v < min) min = v;
            if (v > max) max = v;
        }
        return max - min;
    }
}
