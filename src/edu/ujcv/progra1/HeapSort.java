package edu.ujcv.progra1;

import java.util.PriorityQueue;

public class HeapSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        heapSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int[] heapSort(int[] array) {
        public class HeapSort {
            public void sort(int arr[]) {
                int n = arr.length;

                for (int i = n / 2 - 1; i >= 0; i--)
                    heapify(arr, n, i);


                for (int i=n-1; i>=0; i--)
                {

                    int temp = arr[0];
                    arr[0] = arr[i];
                    arr[i] = temp;


                }

}
