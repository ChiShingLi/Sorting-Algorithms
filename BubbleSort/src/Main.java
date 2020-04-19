/*
    Bubble Sort
    Time Complexity: O(n^2)
 */

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        //default unsorted array
        int[] array = new int[]{231, 542, 12, 3, 4, 1};
        System.out.println("Default unsorted Array: " + Arrays.toString(array));

        System.out.println("Sorted w/ Bubble Sort " + Arrays.toString(bubbleSort(array)));


    }

    //return back an sorted array
    public static int[] bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            //check every elements, starts at index 0
            //array.length-1, so that it doesn't overflow the array and cause bug
            //then -i, because we know the array on the right i side is already sorted
            for (int j = 0; j < array.length - 1 - i; j++) {

                //sorting in increasing order, swap if greater
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }


        }

        return array;

    }


}
