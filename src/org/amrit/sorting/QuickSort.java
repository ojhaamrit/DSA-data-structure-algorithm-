package org.amrit.sorting;

/**
 * Quick Sort:- Quicksort uses a divide-and-conquer strategy like merge sort.
 *
 * Quicksort Partition Java
 * Partitioning is the key process of the Quicksort technique. So what is partitioning?
 *
 * The input list is divided into two sub-lists by an element called pivot;
 * one sub-list with elements less than the pivot and another one with elements greater than the pivot.
 * This process repeats for each sub-list.
 *
 * Finally, all sorted sub-lists merge to form the final output.
 */
public class QuickSort {

    public static void main(String[] args) {

        int[] a = {15, 9, 7, 13, 12, 16, 4, 18, 11};
        int len = a.length;

        QuickSort quickSort = new QuickSort();
        quickSort.quickSortRecursion(a, 0, len - 1);
        quickSort.printArray(a);
    }

    public int partition(int[] a, int low, int high) {
        int pivot = a[(low + high) / 2];
        while (low <= high) {

            while (a[low] < pivot) {
                low++;
            }
            while (a[high] > pivot) {
                high--;
            }
            if (low <= high) {
                int temp = a[low];
                a[low] = a[high];
                a[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }

    public void quickSortRecursion(int[] a, int low, int high) {
        int pi = partition(a, low, high);

        if (low < pi - 1) {
            // call quickSortRecursion recursively to sort sub array before pivot
            quickSortRecursion(a, low, pi - 1);
        }
        if (pi < high) {
            // call quickSortRecursion recursively to sort sub array after pivot
            quickSortRecursion(a, pi, high);
        }
    }

    public void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

}
