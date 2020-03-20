package edu.ujcv.progra1;

public class RecursiveInsertionSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        RecursiveInsertionSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }
    static void insertionSortRecursive(int arr[], int n) {
        if (n <= 1)
            return;
}

