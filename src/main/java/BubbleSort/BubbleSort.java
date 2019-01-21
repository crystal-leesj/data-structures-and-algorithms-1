package BubbleSort;

public class BubbleSort {

    //Write a function for insertion sort that takes in an unsorted array and returns the array sorted using insertion sort.

    public int[] bubbleSort(int[] input) {

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j+1 < input.length; j++) {
                swap(input, j, j+1);
                if(isSorted(input)) return input;
            }
        }

        return input;
    }

    public void swap(int[] input, int i, int j) {
        if (input[i] > input[j]) {
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
        }

    }
    public boolean isSorted(int[] input) {

        for (int i = 1; i < input.length; i++) {
            int head = input[i];
            int prev = input[i-1];
            if(head < prev){
                return false;
            }
        }
        return true;
    }
}
