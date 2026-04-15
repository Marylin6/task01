package main.java.com.javacore.arrays.specification;

import main.java.com.javacore.arrays.entity.ArrayParameters;
import main.java.com.javacore.arrays.entity.DoubleArrayEntity;
import main.java.com.javacore.arrays.warehouse.Warehouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SumGreaterThanSpecification implements Specification {

    private static final Logger logger = LogManager.getLogger();

    private double threshold;
    private Warehouse warehouse;

    public SumGreaterThanSpecification(double threshold, Warehouse warehouse) {
        this.threshold = threshold;
        this.warehouse = warehouse;
    }

    @Override
    public boolean specify(DoubleArrayEntity entity) {
        ArrayParameters params = warehouse.get(entity.getId());

        if (params == null) {
            logger.warn("No parameters for entity id={}", entity.getId());
            return false;
        }

        boolean result = params.getSum() > threshold;

        if (result) {
            logger.info("Entity id={} passed sum > {}", entity.getId(), threshold);
        }

        return result;
    }
}