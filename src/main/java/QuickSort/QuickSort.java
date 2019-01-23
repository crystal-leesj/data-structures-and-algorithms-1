package QuickSort;

import java.util.Random;

public class QuickSort {
    //source: https://www.geeksforgeeks.org/quick-sort/
    public int partition(int[] arr, int begin, int end) {
        //begin =0
        //end = arr.length

        int pivot = arr[begin];

        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                //swap--right
                swap(arr, j, i);
            }
        }

        swap(arr, i, begin);


        return i+1;
    }


    public int[] quickSort(int arr[], int begin, int end) {

        if(begin<end){
            //cal piv--> call partition method
            int pivot = partition(arr,begin,end);
            quickSort(arr, begin, pivot-1);
            quickSort(arr, pivot+1,end);
        }
        return arr;
    }

    public void swap(int[] arr, int i, int j){
        if(i != j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public int[] generateRandomArray(int size){
        int[] input = new int[size];
        for (int i = 0; i<input.length; i++){
            Random random = new Random();
            int r = random.nextInt(size);
            input[i] = r;
        }
        return input;
    }
}