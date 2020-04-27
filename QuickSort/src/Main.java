import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {7, 2, 1, 8, 6, 3, 5, 4};

        System.out.println("Original unsorted array: " + Arrays.toString(array));

        System.out.println("Sorted array with Quicksort " + Arrays.toString(quickSort(array, 0, array.length - 1)));

    }

    public static int[] quickSort(int[] array, int low, int high) {

        if (low < high) {
            //return the pivot index after partition
            int pI = partition(array, low, high);

            //quickSort the left side
            quickSort(array, low, pI - 1);

            //quickSort the right side
            quickSort(array, pI + 1, high);

        }

        //return the sorted array
        return array;
    }

    public static int partition(int[] array, int low, int high) {
        int i = low - 1; //i pointer starts at index: -1
        // int j = low; //j pointer starts at index: 0

        for (int j = low; j < high; j++) {
            //if the element at j is less than the pivot
            if (array[j] < array[high]) {
                i++; //increase i

                //swap, i with j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        //after 'i' got to the pivot, swap pivot with i+1
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        //return back the index of the new pivot
        return (i + 1);
    }

}
