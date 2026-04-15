package com.javacore.arrays.warehouse;

import com.javacore.arrays.entity.ArrayParameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private static final Logger logger = LogManager.getLogger();

    private static Warehouse instance;

    private Map<Integer, ArrayParameters> storage = new HashMap<>();

    private Warehouse() {}

    public static Warehouse getInstance() {
        if (instance == null) {
            instance = new Warehouse();
            logger.info("Warehouse instance created");
        }
        return instance;
    }

    public void put(int id, ArrayParameters parameters) {
        storage.put(id, parameters);
        logger.info("Stored parameters for id={}: {}", id, parameters);
    }

    public ArrayParameters get(int id) {
        ArrayParameters params = storage.get(id);

        if (params == null) {
            logger.warn("No parameters found for id={}", id);
        } else {
            logger.info("Retrieved parameters for id={}: {}", id, params);
        }

        return params;
    }

    public void remove(int id) {
        storage.remove(id);
        logger.info("Removed parameters for id={}", id);
    }
}