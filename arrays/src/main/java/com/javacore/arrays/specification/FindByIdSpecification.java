package com.javacore.arrays.specification;

import com.javacore.arrays.entity.DoubleArrayEntity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FindByIdSpecification implements Specification {

    private static final Logger logger = LogManager.getLogger();
    private int id;

    public FindByIdSpecification(int id) {
        this.id = id;
    }

    @Override
    public boolean specify(DoubleArrayEntity entity) {
        boolean result = entity.getId() == id;

        if (result) {
            logger.info("Entity matched by id={}", id);
        }

        return result;
    }
}