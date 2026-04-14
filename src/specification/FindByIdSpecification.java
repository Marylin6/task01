package specification;

import entity.DoubleArrayEntity;

public class FindByIdSpecification implements Specification {

    private int id;

    public FindByIdSpecification(int id) {
        this.id = id;
    }

    @Override
    public boolean specify(DoubleArrayEntity entity) {
        return entity.getId() == id;
    }
}