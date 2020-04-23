/*
    Insertion sort
    Time Complexity: O(n^2)

 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //unsorted array
        int[] array = new int[]{456, 6, 2, 5, 48, 84, 2, 1};

        System.out.println("original unsorted array: " + Arrays.toString(array));

        System.out.println("Sorted array using insertion sort: " + Arrays.toString(insertionSort(array)));

    }


    public static int[] insertionSort(int[] array) {
        //assume index 0 is sorted
        // sorted | unsorted
        //e.g: 456| 6, 2, 5, 48, 84, 2, 1

        //i indicate the the key
        for (int i = 1; i < array.length; i++) {
            //get the first value
            int temp = array[i];

            //get the starting index position as key, increase by 1 each run
            int key = i;

            //shifting & sorting numbers, NOT moving keys
            //check and compare if value at (key) is less than value at (key - 1)
            while (key > 0 && (temp < array[key - 1])) {

                //if true, swap
                array[key] = array[key - 1];

                //move the checker key to the left by 1
                key--;
            }
            //put back the starting value to the appropriate location
            array[key] = temp;

        }
        return array;
    }

}
