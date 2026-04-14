package repository;

import entity.DoubleArrayEntity;

import java.util.ArrayList;
import java.util.List;

public class ArrayRepository {

    private static ArrayRepository instance;

    private List<DoubleArrayEntity> list = new ArrayList<>();

    private ArrayRepository() {}

    public static ArrayRepository getInstance() {
        if (instance == null) {
            instance = new ArrayRepository();
        }
        return instance;
    }

    public void add(DoubleArrayEntity entity) {
        list.add(entity);
    }

    public void remove(DoubleArrayEntity entity) {
        list.remove(entity);
    }

    public List<DoubleArrayEntity> getAll() {
        return list;
    }
}
