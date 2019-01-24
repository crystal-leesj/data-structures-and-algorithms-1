package RadixSort;

import java.util.Arrays;

public class RadixSort {
    //source: https://www.geeksforgeeks.org/radix-sort/

    public  int[] radixSort(int arr[]){
        // Find the maximum number to know number of digits
        int m = getMax(arr);

        // Do counting sort for every digit. Note that instead
        // of passing digit number, exp is passed. exp is 10^i
        // where i is current digit number
        for (int exp = 1; m/exp > 0; exp *= 10)
            countSort(arr, exp);

        return arr;
    }

    //to return the max value in an array
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void countSort(int[] arr, int exp){
        //exp initialized at 1 in the radixSort method
        int output[] = new int[arr.length]; // output array
        int count[] = new int[10]; //0-9
        Arrays.fill(count,0);

        // Store count of occurrences in count[]
        for (int i = 0; i < arr.length; i++)
            count[ (arr[i]/exp)%10 ]++;

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (int i = arr.length - 1; i >= 0; i--)
        {
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
            count[ (arr[i]/exp)%10 ]--;
        }
        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to curent digit
        for (int i = 0; i < arr.length; i++)
            arr[i] = output[i];
    }

}
