
package org.amrit.sorting;

/**
 * Selection Sort sorts an array by repeatedly finding the minimum element (considering ascending order)
 * from unsorted part and putting it at the beginning.
 *
 * Algorithm:
 * 1.Set MIN to location 0
 * 2.Search the minimum element in the list
 * 3.Swap with value at location MIN
 * 4.Increment MIN to point to next element
 * 5.Repeat until the list is sorted
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] a = {1, 3, 8, 2, 9, 15, 4};

        for (int i = 0; i < a.length - 1; i++) {

            int min = i; // iTH position: element from i till n-1 are candidates.

            for (int j = i + 1; j < a.length; j++) {

                if (a[j] < a[min]) {

                    min = j; // update the index of minimum element.

                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
