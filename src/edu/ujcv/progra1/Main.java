package edu.ujcv.progra1;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        int[] array = new int [10000];
        Random R = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(R.nextInt(100000));
        }

        //HeapSort h= HeapSort();
        //h.heapSort(array);
        //MergeSort m = new MergeSort();
        //array = m.mergeSort(array);
        //BubleSort b = new BubleSort();
        //array = b.bubleSort(array);
        RecursiveInsertionSort ri = new RecursiveInsertionSort();
        ri.insertionSortRecursive(array, array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("\n\ntarda "+ s.sort()+ " milisegundos");
    }
}
