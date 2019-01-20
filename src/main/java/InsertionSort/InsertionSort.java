package InsertionSort;

public class InsertionSort {

    //Write a function for insertion sort that takes in an unsorted array and returns the array sorted using insertion sort.
    public int[] insertionSort(int[] input){
        for(int i = 1; i < input.length; i++){
            int j = i-1, temp = input[i];
            while(j>=0 && temp<input[j]){
                input[j+1] = input[j--];
            }
            input[j+1] = temp;
        }
		return input;
    }

    public boolean isSorted(int[] input){
        for (int i = 1; i < input.length; i++){
            int prev = input[i-1];
            int head = input[i];

            if(head< prev){
                return false;
            }
        }
        return true;
    }



}
