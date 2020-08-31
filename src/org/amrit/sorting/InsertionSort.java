package org.amrit.sorting;

/**
 *
 * Algorithm
 * To sort an array of size n in ascending order:
 * 1: Iterate from arr[1] to arr[n] over the array.
 * 2: Compare the current element (key) to its predecessor.
 * 3: If the key element is smaller than its predecessor, compare it to the elements before.
 * Move the greater elements one position up to make space for the swapped element.
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] a = {5, 1, 6, 2, 4, 3};
        int temp, j;

        for (int i = 1; i < a.length; i++) {

            temp = a[i];
            j = i;

            while (j > 0 && a[j - 1] > temp) {

                a[j] = a[j - 1];
                j = j - 1;
            }
            a[j] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
