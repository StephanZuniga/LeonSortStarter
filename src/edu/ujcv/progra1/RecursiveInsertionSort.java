package edu.ujcv.progra1;

public class RecursiveInsertionSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        RecursiveInsertionSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }
    static void RecursiveInsertionSort(int arr[], int n) {
        if (n <= 1)
            return;

        RecursiveInsertionSort( arr, n-1 );


        int last = arr[n-1];
        int j = n-2;


        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
}

