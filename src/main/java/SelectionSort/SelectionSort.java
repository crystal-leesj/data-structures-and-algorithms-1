package SelectionSort;

public class SelectionSort {

    public int[] selectionSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int minIdx = i, minVal = Integer.MAX_VALUE;
            for (int j = i; j < input.length; j++) {
                if (input[j] < minVal ) {
                    minVal = input[j];
                    minIdx = j;
                }
            }
            swap(input,minIdx,i);
        }
        return input;
    }

    public void swap(int[] input, int i, int j) {
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp ;
    }
}
