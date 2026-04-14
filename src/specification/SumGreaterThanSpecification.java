package specification;

import entity.ArrayParameters;
import entity.DoubleArrayEntity;
import warehouse.Warehouse;

import java.util.logging.Logger;

public class SumGreaterThanSpecification implements Specification {

    private static final Logger logger = Logger.getLogger(SumGreaterThanSpecification.class.getName());

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
            logger.warning("No parameters for entity id=" + entity.getId());
            return false;
        }

        boolean result = params.getSum() > threshold;

        if (result) {
            logger.info("Entity id=" + entity.getId() + " passed sum > " + threshold);
        }

        return result;
    }
}