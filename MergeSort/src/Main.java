/*
    Merge Sort recursive
    Time Complexity: O(n log n)
 */

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[] array = {67, 56, 4654, 846, 51, 64, 212, 5, 1, 2, 0};
        System.out.println("Original unsorted array " + Arrays.toString(array));
        System.out.println("Sorted array using merge Sort " + Arrays.toString(mergeSort(array)));
    }

    public static int[] mergeSort(int[] array) {

        //get the middle index of the array
        int mid = array.length / 2;

        //Base case: check and see if its less than 2 elements in the array
        if (array.length < 2) {
            return array;
        }

        //split the array in the 2 halves (left and right)
        int[] left = new int[mid]; //first half
        int[] right = new int[array.length - mid]; //second half

        //populate the arrays
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        for (int j = 0; j < (array.length - mid); j++) {
            right[j] = array[mid + j];
        }

        //create a result array for storing result
        int[] result = new int[array.length];

        //recursively call mergesort method until one element left
        left = mergeSort(left);
        right = mergeSort(right);

        //merge the arrays
        result = merge(left, right);

        return result;
    }

    public static int[] merge(int[] left, int[] right) {

        //initialize index pointer
        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;

        //create a result array that has the array length
        int[] result = new int[(left.length + right.length)];

        while (leftPointer < left.length || rightPointer < right.length) {

            //if both left and right arrays have elements
            if (leftPointer < left.length && rightPointer < right.length) {

                //if left array's element at Pointer index is less than the right
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer] = left[leftPointer];

                    //increase the index pointer by 1, to mark that the completion for that particular element
                    resultPointer++;
                    leftPointer++;
                } else {
                    //else, the right side is smaller, add it to the result array
                    result[resultPointer] = right[rightPointer];
                    resultPointer++;
                    rightPointer++;
                }

            }
            //else if: Only one of the array has elements in it...
            //in this case left side:
            else if (leftPointer < left.length) {
                result[resultPointer] = left[leftPointer];
                resultPointer++;
                leftPointer++;

                //OR, the right side has element in it
            } else if (rightPointer < right.length) {
                result[resultPointer] = right[rightPointer];
                resultPointer++;
                rightPointer++;
            }
        }

        return result;
    }


}


