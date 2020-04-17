/*
    --- SELECTION SORT ---
    Time Complexity: O(n^2)

 */

import java.util.Arrays; //for print out Arrays to string

public class Main {

    public static void main(String[] args) {
        //array to be sorted using selection sort
        int[] originalArray = new int[]{54, 654, 123, 1, 45, 4, 456, 12, 31, 48, 90, 4};

        System.out.println("Original Array: " + Arrays.toString(originalArray));

        System.out.println("After selection sort: " + Arrays.toString(selectionSort(originalArray)));

    }

    //return back a sorted array
    public static int[] selectionSort(int[] array) {

        //loop thru. every numbers except the last index -1
        for (int i = 0; i < array.length - 1; i++) {

            //assume lowest number is at index i (index 0)
            int minIndex = i;

            //keep checking the i+1's number, till the last index
            for (int j = i + 1; j < array.length; j++) {

                //if j is less than the the value at index i
                if (array[j] < array[minIndex]) {

                    //keep updating the minIndex to the index with the lowest value in the array
                    minIndex = j;
                }
            }
            //after checking all i+.. values, swap the two values
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

        }

        //return back the sorted array
        return array;
    }


}
