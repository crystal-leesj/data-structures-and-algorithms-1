import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6};
        int[] guess = arrayShift(nums,5);
        System.out.println(Arrays.toString(guess));
    }
    public static int[] arrayShift(int[] intitalArray,int ele) {
        int middle;
        int[] newArray = new int[intitalArray.length + 1];
        if (newArray.length % 2 == 0) {
            middle = newArray.length / 2;
        } else {
            middle = (newArray.length + 1) / 2;
        }

        for(int i = 0; i<newArray.length; i++) {
            if (i == middle) {
                newArray[i] = intitalArray[i];
                newArray[i] = ele;
                    }
                    else if(i< middle){
                        newArray[i] = intitalArray[i];
                    }
                    else{
                    newArray[i] = intitalArray[i-1];
                     }
        }
                return newArray;
    }
}

