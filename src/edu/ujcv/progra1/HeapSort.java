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

    public static int[] heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);


        for (int i=n-1; i>=0; i--) {
             int temp = arr[0];
             arr[0] = arr[i];
             arr[i] = temp;

             heapify(arr, i, 0);
        }
    }

            void heapify(int arr[], int n, int i) {
                int largest = i;
                int l = 2*i + 1;
                int r = 2*i + 2;

                if (l < n && arr[l] > arr[largest])
                    largest = l;

                if (r < n && arr[r] > arr[largest])
                    largest = r;


            }

}
