package com.javacore.arrays.specification;

import com.javacore.arrays.entity.ArrayParameters;
import com.javacore.arrays.entity.DoubleArrayEntity;
import com.javacore.arrays.warehouse.Warehouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MaxInRangeSpecification implements Specification {

    private static final Logger logger = LogManager.getLogger();

    private final double min;
    private final double max;
    private final Warehouse warehouse;

    public MaxInRangeSpecification(double min, double max, Warehouse warehouse) {
        this.min = min;
        this.max = max;
        this.warehouse = warehouse;
    }

    @Override
    public boolean specify(DoubleArrayEntity entity) {
        ArrayParameters params = warehouse.get(entity.getId());

        if (params == null) {
            logger.warn("No parameters for entity id={}", entity.getId());
            return false;
        }

        double maxValue = params.getMax();
        boolean result = maxValue >= min && maxValue <= max;

        if (result) {
            logger.info("Entity id={} max={} in range [{}, {}]", entity.getId(), maxValue, min, max);
        } else {
            logger.debug("Entity id={} max={} NOT in range [{}, {}]", entity.getId(), maxValue, min, max);
        }

        return result;
    }
}