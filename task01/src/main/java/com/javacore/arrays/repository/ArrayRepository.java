package main.java.com.javacore.arrays.repository;

import main.java.com.javacore.arrays.entity.DoubleArrayEntity;
import main.java.com.javacore.arrays.specification.Specification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ArrayRepository {

    private static final Logger logger = LogManager.getLogger();

    private static ArrayRepository instance;
    private List<DoubleArrayEntity> storage = new ArrayList<>();

    private ArrayRepository() {}

    public static ArrayRepository getInstance() {
        if (instance == null) {
            instance = new ArrayRepository();
            logger.info("Repository instance created");
        }
        return instance;
    }

    public void add(DoubleArrayEntity entity) {
        storage.add(entity);
        logger.info("Added entity id={}", entity.getId());
    }

    public void remove(DoubleArrayEntity entity) {
        storage.remove(entity);
        logger.info("Removed entity id={}", entity.getId());
    }

    public List<DoubleArrayEntity> getAll() {
        logger.info("Retrieving all entities, count={}", storage.size());
        return new ArrayList<>(storage);
    }

    public List<DoubleArrayEntity> query(Specification spec) {
        List<DoubleArrayEntity> result = new ArrayList<>();

        for (DoubleArrayEntity entity : storage) {
            if (spec.specify(entity)) {
                result.add(entity);
            }
        }

        logger.info("Query executed, found {} entities", result.size());
        return result;
    }
}