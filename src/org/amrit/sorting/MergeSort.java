package org.amrit.sorting;

/**
 * MergeSort:- is a divide & conquer algorithm based on the idea of breaking down a list into several sublist
 * until each sublist consists of single element and merging those sublist in a manner that result into a
 * sorted list.
 */
public class MergeSort {

    int[] array;
    int[] tempMergeArray;
    int length;

    public void sort(int inputArray[]) {
        this.array = inputArray;
        this.length = inputArray.length;
        this.tempMergeArray = new int[length];
        divideArray(0, length - 1);
    }

    public void divideArray(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            /**
             * It will sort left side of an array
             */
            divideArray(lowerIndex, middle);
            /**
             * It will sort right side of an array
             */
            divideArray(middle + 1, higherIndex);

            mergeArray(lowerIndex, middle, higherIndex);
        }
    }

    public void mergeArray(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {

            // all the values of array are copied to tempMergeArray
            tempMergeArray[i] = array[i];

            i = lowerIndex;
            int j = middle + 1;
            int k = lowerIndex;
            while (i <= middle && j <= higherIndex) {

                if (tempMergeArray[i] <= tempMergeArray[j]) {
                    array[k] = tempMergeArray[i];
                    i++;
                } else {
                    array[k] = tempMergeArray[j];
                    j++;
                }
                k++;
            }

            while (i <= middle){
                array[k] = tempMergeArray[i];
                k++;
                i++;
            }
        }
    }

    public static void main(String[] args) {

        int[] inputArray = {49, 36, 13, 52, 19, 94, 21};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(inputArray);

        /**
         * printing sorted array.
         */
        for (int i : inputArray){
            System.out.print(i + " ");
        }

    }
}
