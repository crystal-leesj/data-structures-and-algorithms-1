package MergeSort;

public class MergeSort {

    //Write a function that accepts an array of unsorted integers, and returns a sorted array by a recursive mergesort algorithm.

    //source: https://www.geeksforgeeks.org/merge-sort/

    public int[] mergeSort(int[] arr){
        //is array length <1
        if(arr.length<2){
            return arr;
        }

        //pass right/left method
        int [] right = splitRight(arr);
        int[] left = splitLeft(arr);

        //breaks into an array of one
        right = mergeSort(right);
        left = mergeSort(left);

        return merge(right,left);
    }

    public int[] merge(int[] a, int[] b){
        int aIdx = 0;
        int bIdx =0;

        int n = a.length;
        int m = b.length;

        int[] result = new int[n+m];

        //conditions:
        //aIdx<n && bIdx<m
        //aIdx<n
        //bIdx<m

        while(aIdx<n && bIdx<m){
            result[aIdx+bIdx] = a[aIdx]<b[bIdx] ? a[aIdx++] : b[bIdx++];
        }
        while (aIdx<n){
            result[aIdx+bIdx] = a[aIdx++];
        }
        while(bIdx<m){
            result[aIdx+bIdx] = b[bIdx++];
        }
    return result;
    }

    public int[] splitLeft(int[] arr){
        int [] left = new int[(arr.length)/2];
        for(int i = 0; i<left.length; i++){
            left[i] = arr[i];
        }
        return left;
    }

    public int[] splitRight(int[] arr){
        int[] right = new int[arr.length-arr.length/2];
        int arrStart = arr.length/2;
        for(int i = 0; i <right.length; i++){
            right[i] = arr[arrStart++];
        }
        return right;
    }
}
