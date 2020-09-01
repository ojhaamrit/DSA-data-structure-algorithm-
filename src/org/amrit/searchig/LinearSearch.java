package org.amrit.searchig;

/**
 * Linear search is a very simple search algorithm. In this type of search,
 * a sequential search is done for all items one by one.
 * <p>
 * A simple approach is to do linear search, i.e
 * <p>
 * Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
 * If x matches with an element, return the index.
 * If x doesn’t match with any of elements, return -1.
 * <p>
 * <p>
 * Algorithm
 * 1.Get the length of the array.
 * 2.Get the element to be searched store it in a variable named value.
 * 3.Compare each element of the array with the variable value.
 * 4.In case of a match print a message saying element found.
 * 5.else, print a message saying element not found
 */
public class LinearSearch {

    public static void main(String[] args) {

        int[] a = {10, 50, 30, 70, 80, 60, 20, 90, 40};
        int item = 10;
        int temp = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == item) {
                System.out.println("element is present at " + i + " index position");
                temp += 1;
            }
        }
        if (temp == 0){
            System.out.println("item not found");
        }

    }
}
