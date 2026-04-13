package service;

import entity.DoubleArrayEntity;

import java.util.Optional;

public class ArrayServiceImpl implements ArrayService {

    @Override
    public Optional<Double> findMin(DoubleArrayEntity entity) {
        double[] arr = entity.getArray();

        if (arr.length == 0) {
            return Optional.empty();
        }

        double min = arr[0];
        for (double num : arr) {
            if (num < min) {
                min = num;
            }
        }

        return Optional.of(min);
    }

    @Override
    public Optional<Double> findMax(DoubleArrayEntity entity) {
        double[] arr = entity.getArray();

        if (arr.length == 0) {
            return Optional.empty();
        }

        double max = arr[0];
        for (double num : arr) {
            if (num > max) {
                max = num;
            }
        }

        return Optional.of(max);
    }

    @Override
    public Optional<Double> sum(DoubleArrayEntity entity) {
        double[] arr = entity.getArray();

        if (arr.length == 0) {
            return Optional.empty();
        }

        double sum = 0;
        for (double num : arr) {
            sum += num;
        }

        return Optional.of(sum);
    }

    @Override
    public Optional<Double> average(DoubleArrayEntity entity) {
        double[] arr = entity.getArray();

        if (arr.length == 0) {
            return Optional.empty();
        }

        double sum = 0;
        for (double num : arr) {
            sum += num;
        }

        return Optional.of((double) sum / arr.length);
    }

    @Override
    public void insertionSort(DoubleArrayEntity entity) {
        double[] arr = entity.getArray();

        for (int i = 1; i < arr.length; i++) {
            double key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    @Override
    public void mergeSort(DoubleArrayEntity entity) {
        double[] arr = entity.getArray();
        mergeSortRecursive(arr, 0, arr.length - 1);
    }

    private void mergeSortRecursive(double[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;

        mergeSortRecursive(arr, left, mid);
        mergeSortRecursive(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    private void merge(double[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        double[] leftArr = new double[n1];
        double[] rightArr = new double[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }
}
