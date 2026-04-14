package specification;

import entity.DoubleArrayEntity;

public class SumGreaterThanSpecification implements Specification {

    private double value;

    public SumGreaterThanSpecification(double value) {
        this.value = value;
    }

    @Override
    public boolean specify(DoubleArrayEntity entity) {
        double sum = 0;
        for (double d : entity.getArray()) {
            sum += d;
        }
        return sum > value;
    }
}
