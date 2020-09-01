package org.amrit.searchig;

/**
 *
 */
public class BinarySearch {

    public static void main(String[] args) {

        int[] a = {1, 2, 4, 5, 7, 8, 9};
        int item = 8;

        int lowerIndex = 0;
        int higherIndex = a.length - 1;
        int middleIndex = (lowerIndex + higherIndex) / 2;

        while (lowerIndex <= higherIndex) {

            /**
             * Check if item is present at mid
             */
            if (a[middleIndex] == item) {
                System.out.println("item present at " + middleIndex + " index position");
                break;

                /**
                 * If item greater, ignore left half
                 */
            } else if (a[middleIndex] < item) {
                lowerIndex = middleIndex + 1;

                /**
                 * If item is smaller, ignore right half
                 */
            } else {
                higherIndex = middleIndex - 1;
            }
            middleIndex = (lowerIndex + higherIndex) / 2;
        }

        if (lowerIndex > higherIndex) {
            System.out.println("item not found");
        }

    }
}
