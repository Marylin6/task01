package entity;

import observer.Observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleArrayEntity implements Observable {

    private int id;
    private double[] array;

    private List<Observer> observers = new ArrayList<>();

    public DoubleArrayEntity(int id, double[] array) {
        this.id = id;
        this.array = array;
    }

    public int getId() {
        return id;
    }

    public double[] getArray() {
        return array;
    }

    public int size() {
        return array.length;
    }

    public double getElement(int index) {
        return array[index];
    }

    public void setElement(int index, double value) {
        array[index] = value;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DoubleArrayEntity that = (DoubleArrayEntity) o;

        if (id != that.id) return false;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(id);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return "DoubleArrayEntity{id=" + id + ", array=" + Arrays.toString(array) + '}';
    }
}